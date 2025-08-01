public class Etoile {
    static int nbEtoile;
    boolean estAttrape;

    Etoile() {
        if (nbEtoile < 2) {
            this.estAttrape = false;
            nbEtoile++;
        }
    }
}
