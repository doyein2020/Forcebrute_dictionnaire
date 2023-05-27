/* dans cette classe je creer le mot de passe et je lui associe son hache*/

public class Motpasse {
    private String nMotpasse;
    private String nMot_Ache;

    public Motpasse(String motpasse) {
        this.nMotpasse = motpasse;
        M_hache mot_achache = new M_hache(this.nMotpasse);

        this.nMot_Ache = mot_achache.calcul();

        

    }

    public String getnMotpasse(){

      return this.nMotpasse ;
    }

    public String getnMot_Ache(){

      return this.nMot_Ache;
    }


}
