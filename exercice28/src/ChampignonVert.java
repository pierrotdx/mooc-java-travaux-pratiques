public class ChampignonVert {
    static int nbChampignonVert;
    String couleur;
    boolean estAttrape;

    ChampignonVert() {
        if (nbChampignonVert < 1) {
            this.couleur = "Vert";
            this.estAttrape = false;
            nbChampignonVert++;
        }
    }
}
