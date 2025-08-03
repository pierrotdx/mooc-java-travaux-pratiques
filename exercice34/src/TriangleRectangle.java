public class TriangleRectangle implements FigureGeometrique {
    int a;
    int b;

    @Override
    public int getPerimetre() {
        return this.a + this.b + (int)Math.sqrt(this.a * this.a + this.b * this.b);
    }

    @Override
    public int getAire() {
        return (int)this.a * this.b / 2;
    }
}
