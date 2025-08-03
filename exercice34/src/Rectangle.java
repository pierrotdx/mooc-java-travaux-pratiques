public class Rectangle implements FigureGeometrique {
    int longueur;
    int largeur;

    @Override
    public int getPerimetre() {
        return 2 * (this.largeur + this.longueur);
    }

    @Override
    public int getAire() {
        return this.largeur * this.longueur;
    }
}
