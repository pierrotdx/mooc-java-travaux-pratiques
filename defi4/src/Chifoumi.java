public enum Chifoumi {
    PIERRE,
    FEUILLE,
    CISEAUX;

    public boolean bats(Chifoumi autreElement) {
        if (this.equals(PIERRE)) {
            return autreElement.equals(CISEAUX);
        }
        if (this.equals(CISEAUX)) {
            return autreElement.equals(FEUILLE);
        }
        if (this.equals(FEUILLE)) {
            return autreElement.equals(PIERRE);
        }
        return false;
    }
}
