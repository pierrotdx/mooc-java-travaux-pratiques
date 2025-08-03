public enum Drapeau {
    VERT("Drapeau vert: Baignade surveillée"),
    ORANGE("Drapeau orange: Baignade dangereuse"),
    ROUGE("Drapeau rouge: Baignade interdite");

    final String precision;

    Drapeau(String precision) {
        this.precision = precision;
    }
}
