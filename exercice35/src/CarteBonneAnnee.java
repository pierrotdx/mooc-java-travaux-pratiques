public class CarteBonneAnnee extends Carte {
    void souhaiterBonneAnnee() {
        System.out.println("Bonne année " + this.destinataire);
    };

    public boolean equals(Object obj) {
        return obj instanceof CarteBonneAnnee && this.destinataire.equals(((Carte) obj).destinataire);
    }
}
