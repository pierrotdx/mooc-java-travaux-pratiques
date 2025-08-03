public abstract class Langue {
    abstract String getCommentCaVa();
    abstract String getLangue();
    void traduireCommentCaVa() {
        System.out.printf("En %s, on traduit \"Comment ça va ?\" par \"%s\"\n", this.getLangue(), this.getCommentCaVa());
    }
}
