import java.util.ArrayList;
import java.util.List;

public class BruteForceCracker {

    private int nMotDePasse;
    private List<String> combinations;

    public BruteForceCracker() {
        System.out.println(" ");
    }

    public List<String> bruteForceCracker(int[] digits) {
        List<String> combinations = new ArrayList<>();
        backtrack(combinations, digits, new StringBuilder(), 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, int[] digits, StringBuilder current, int index) {
        if (index == digits.length) {
            combinations.add(current.toString());
        } else {
            int digit = digits[index];
            for (int i = 0; i < digit; i++) {
                current.append(i);
                backtrack(combinations, digits, current, index + 1);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }

    public boolean rechercheMotDePasseDansCombinaison(int motDePasse, List<String> combinations) {
        String target = String.valueOf(motDePasse);
        long startTime = System.currentTimeMillis(); // Enregistre le temps de début
        for (String combination : combinations) {
            if (combination.equals(target)) {
                long endTime = System.currentTimeMillis(); // Enregistre le temps de fin
                long elapsedTime = endTime - startTime; // Calcule le temps écoulé en millisecondes
                System.out.println("Le mot de passe   " + motDePasse + " , a été trouvé dans les combinaisons.");
                System.out.println("Temps écoulé : " + elapsedTime + " millisecondes.");
                return true;
            }
        }
        long endTime = System.currentTimeMillis(); // Enregistre le temps de fin si le mot de passe n'est pas trouvé
        long elapsedTime = endTime - startTime; // Calcule le temps écoulé en millisecondes
        System.out.println("Le mot de passe " + motDePasse + " n'a pas été trouvé dans les combinaisons.");
        System.out.println("Temps écoulé : " + elapsedTime + " millisecondes.");
        return false;
    }
}
