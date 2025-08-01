public class ChampignonRouge {
    static int nbChampignonRouge;
    String couleur;
    boolean estAttrape;

    ChampignonRouge() {
        if (nbChampignonRouge < 2) {
            this.couleur = "Rouge";
            this.estAttrape = false;
            nbChampignonRouge++;
        }
    }
}
