public class GrandParent {
    CarteAnniversaire carteAnniversaire2018Robert;
    CarteBonneAnnee carteBonneAnnee2018Robert;

    void souhaiterEvenement(Carte carte) {
        if (carte instanceof CarteAnniversaire) {
            if (carte.equals(carteAnniversaire2018Robert)) {
                System.out.println("Je ne peux pas renvoyer la même carte!");
            } else {
                ((CarteAnniversaire) carte).souhaiterAnniversaire();
                this.carteAnniversaire2018Robert = (CarteAnniversaire) carte;
            }
        }
        if (carte instanceof CarteBonneAnnee) {
            if (carte.equals(carteBonneAnnee2018Robert)) {
                System.out.println("Je ne peux pas renvoyer la même carte!");
            } else {
                ((CarteBonneAnnee) carte).souhaiterBonneAnnee();
                this.carteBonneAnnee2018Robert = (CarteBonneAnnee) carte;
            }
        }
    }
}
