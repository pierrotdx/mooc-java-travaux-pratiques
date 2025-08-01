public class Main {
    static public void main(String... args) {
        Mario mario = new Mario();
        ChampignonVert champignonVert = new ChampignonVert();
        ChampignonRouge champignonRouge = new ChampignonRouge();
        PieceDoree pieceDoree = new PieceDoree();
        Etoile etoile = new Etoile();

        mario.mangerChampignonVert(champignonVert);
        mario.mangerChampignonRouge(champignonRouge);
        mario.attraperPiece(pieceDoree);
        mario.attraperEtoile(etoile);
    }
}
