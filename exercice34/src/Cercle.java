public class Cercle implements FigureGeometrique {
    int rayon;

    @Override
    public int getAire() {
        return (int)(this.rayon * this.rayon * Math.PI);
    }

    @Override
    public int getPerimetre() {
        return (int)(2 * Math.PI * this.rayon);
    }
}
