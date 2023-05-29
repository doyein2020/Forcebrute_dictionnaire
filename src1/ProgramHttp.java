import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class ProgramHttp {
    public static void main(String[] args) {
        try {
            // Spécifiez l'URL du serveur auquel vous souhaitez envoyer la requête POST
            String urlString = "http://localhost/test/tp1/seveurHttp.php";
            URL url = new URL(urlString);

            // Ouvrez une connexion HTTP vers l'URL spécifiée
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Définissez la méthode de requête sur POST
            connection.setRequestMethod("POST");

            // Activez l'envoi de données
            connection.setDoOutput(true);

            // Demandez à l'utilisateur d'entrer les paramètres
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Entrez le mot de passe a chercher : ");
            String param1 = reader.readLine();


            // Construisez les données à envoyer
            String postData = "param1=" + param1;
            byte[] postDataBytes = postData.getBytes(StandardCharsets.UTF_8);

            // Définissez les en-têtes de la requête
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));

            // Envoyez les données au serveur
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
            outputStream.write(postDataBytes);
            outputStream.flush();
            outputStream.close();

            // Obtenez la réponse du serveur
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = responseReader.readLine()) != null) {
                response.append(line);
            }
            responseReader.close();

            // Affichez la réponse du serveur
            System.out.println("Réponse du serveur :");
            System.out.println(response.toString());

            // Fermez la connexion
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
