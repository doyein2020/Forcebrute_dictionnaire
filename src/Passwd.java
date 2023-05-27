
import java.util.Scanner;

public class Passwd {

    String nWord;
    Motpasse[] nPwd;

    public Passwd() {

        this.nPwd = new Motpasse[3];

        Motpasse passer = new Motpasse("passer");
        Motpasse donner = new Motpasse("donner");
        Motpasse pasdutout = new Motpasse("pasdutout");
        Motpasse balmaakh = new Motpasse("balmaakh");
        Motpasse nopil = new Motpasse("nopil");
        Motpasse wamais = new Motpasse("wamais");
        Motpasse Dic1 = new Motpasse("Dic1");
        Motpasse yeneu = new Motpasse("yeneu");
        Motpasse nedorspas = new Motpasse("nedorspas");
        Motpasse oknice = new Motpasse("oknice");
        this.nPwd = new Motpasse[]{passer, donner, pasdutout, balmaakh, nopil, wamais, Dic1, yeneu, nedorspas, oknice};
    }

    public void find() {

      Scanner scanner = new Scanner(System.in);
  System.out.print("hacker un mot de passe : ");
  String nWord = scanner.nextLine();

  if (nWord == null || nWord.isEmpty()) {
      System.out.println("Erreur : Saisie invalide");
      return;
  }


        try {
            String mot_de_passe;


            for (int i = 0; i < nPwd.length; i++) {
                if (nPwd[i].getnMotpasse().equals(nWord)) {
                    mot_de_passe = nPwd[i].getnMotpasse();
                    System.out.println("c'est bon !!!");

                }

                if (nPwd[i].getnMot_Ache().equals(nWord)) {
                    mot_de_passe = nPwd[i].getnMotpasse();
                    System.out.println(mot_de_passe);
                }

                

            }

        } catch (NullPointerException exception) {
            System.out.println("Erreur : NullPointerException");
        } finally {
            System.out.println("Fin du programme");
        }
    }
}
