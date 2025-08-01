public class TempsPasse {
    int nombreDeSecondes = 0;

    void ajouteSecondes(int quantite) {
        this.nombreDeSecondes += quantite;
    }

    void ajouteMinutes(int quantite) {
        int secondesAAjouter = quantite * 60;
        this.ajouteSecondes(secondesAAjouter);
    }

    void ajouteHeures(int quantite) {
        int minutesAAjouter = quantite * 60;
        this.ajouteMinutes(minutesAAjouter);
    }

    void ajouteJours(int quantite) {
        int joursAAjouter = quantite * 24;
        this.ajouteHeures(joursAAjouter);
    }

    void  ajouteMois(int indexMois, boolean anneeBissextile) {
        int nbJoursDansMois;
        switch (indexMois) {
            case 2:
                nbJoursDansMois = anneeBissextile ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nbJoursDansMois = 30;
                break;
            default:
                nbJoursDansMois = 31;
        }
        this.ajouteJours(nbJoursDansMois);
    }

    void ajouteAnnee(int annee) {
        boolean anneeBissextile = annee % 4 == 0;
        int nbJoursDansAnnee = anneeBissextile ? 366 : 365;
        this.ajouteJours(nbJoursDansAnnee);
    }
}
