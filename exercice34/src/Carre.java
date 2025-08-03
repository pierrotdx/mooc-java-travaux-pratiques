public class Carre implements FigureGeometrique {
    int cote;

    @Override
    public int getAire() {
        return this.cote * this.cote;
    }

    @Override
    public int getPerimetre() {
        return 4 * this.cote;
    }
}
