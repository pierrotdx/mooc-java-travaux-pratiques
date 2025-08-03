public enum Meteo {
    SOLEIL("Grand soleil"),
    MITIGE("Soleil avec quelques éclaircies"),
    COUVERT("Couvert mais pas de pluie"),
    AVERSE("Nuageux avec quelques averses"),
    PLUIE("Pluie en continue"),
    VENT("Quelques rafales de vent");

    final String temps;

    Meteo(String temps) {
        this.temps = temps;
    }
}
