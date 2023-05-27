/* cette classe permet de convertir convertir un mot de passe en hache*/

public class M_hache {

    private String nMotAchage;

    public M_hache(String motchage) {
        this.nMotAchage = motchage;
    }

    public String getMotchage() {
        return nMotAchage;
    }

    public String calcul() {

        MD5exemple example = new MD5exemple(this.nMotAchage);
        String hash = example.calculateHash();
        return hash ;
    }


}
