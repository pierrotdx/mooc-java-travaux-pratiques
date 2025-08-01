public class Main {
    static public void main(String... args) {
        PlatPrepare plat = new PlatPrepare(48);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire(82);
        System.out.println("Le chiffre d'affaires est de: " + Epicerie.chiffreAffaires + "€");
    }
}
