
import java.util.Scanner;
import java.util.List;

public class MainApp1{

  public static void main(String[] args){

     Passwd pwd = new Passwd();

   Scanner sc = new Scanner(System.in);

  

   System.out.println("0:------------> Hacher un mot de passe");
   System.out.println("1:----------> Forcebrute");
   System.out.println("2:----------->dictionnary");

 System.out.println("quelle methode de crackage voulez-vous? ou vous preferez hacher un mot de passe");

   int mot = sc.nextInt();

   if(mot == 1){

 /// Forcebrute

     int[] digits = {10, 10, 10, 10, 10};

     BruteForceCracker cracker = new BruteForceCracker();

     List<String> combinations = cracker.bruteForceCracker(digits);

     Scanner scanner = new Scanner(System.in);
     System.out.println("Entrez un mot de passe à cinq chiffres :");
     int password = scanner.nextInt();

     cracker.rechercheMotDePasseDansCombinaison(password, combinations);

     int size = combinations.size();
     System.out.println("Taille des combinaisons : " + size);

   }
   else if(mot == 2){

     //dictionnary


     pwd.find();


   }
   else if(mot == 0){
//hashage
     System.out.println("entrer le mot de passe a hache!!");
     Scanner tr = new Scanner(System.in);


     String motpasse = tr.nextLine();

     M_hache hache = new M_hache(motpasse);

            String  hash = hache.calcul();

    System.out.println("le hash du mot " + motpasse + "--------> " + hash);

   }

   else{
     System.out.println("Entrer le bon numero!!");
   }




  }
}
