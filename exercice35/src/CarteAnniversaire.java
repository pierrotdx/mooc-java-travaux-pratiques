public class CarteAnniversaire extends Carte {
    void souhaiterAnniversaire() {
        System.out.println("Joyeux anniversaire " + this.destinataire);
    };

    public boolean equals(Object obj) {
        return obj instanceof CarteAnniversaire && this.destinataire.equals(((Carte) obj).destinataire);
    }
}
