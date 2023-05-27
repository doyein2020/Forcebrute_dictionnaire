/*
cette classe nous permet de creer l'algorithme de hachage .
il est dotee d'une fonction capable de faire l'algorithme de hachage 

*/




import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

 class MD5exemple{

    private String input;

    public MD5exemple(String input) {
        this.input = input;
    }

    public String calculateHash() {
        try {
            // Création d'une instance du message digest avec l'algorithme MD5
            MessageDigest md5Digest = MessageDigest.getInstance("MD5");

            // Calcul du hachage en convertissant l'entrée en tableau de bytes
            byte[] hash = md5Digest.digest(input.getBytes());

            // Conversion du hachage en représentation hexadécimale
            String hexHash = bytesToHex(hash);

            // Retourne le résultat
            return hexHash;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Méthode pour convertir un tableau de bytes en représentation hexadécimale
    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }


}
