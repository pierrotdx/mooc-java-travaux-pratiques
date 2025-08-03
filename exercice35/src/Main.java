public class Main {
    static public void main(String... args) {
        CarteBonneAnnee carteBonneAnnee = new CarteBonneAnnee();
        carteBonneAnnee.destinataire = "Robert";

        CarteAnniversaire carteAnniversaire = new CarteAnniversaire();
        carteAnniversaire.destinataire = "Robert";

        GrandParent grandParent = new GrandParent();
        grandParent.souhaiterEvenement(carteBonneAnnee);
        grandParent.souhaiterEvenement(carteAnniversaire);
        grandParent.souhaiterEvenement(carteAnniversaire);
    }
}
