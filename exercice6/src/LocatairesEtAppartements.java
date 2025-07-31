public class LocatairesEtAppartements {

    public static void main(String[] args) {

        //Appartement
        int surface = 100;
        int nbPiece = 3;
        int loyer = 700;
        boolean cuisineEquipe = false;
        boolean balcon = false;
        boolean parking = true;

        //Dossier locataire
        int salaireMensuelNet = 1000;
        boolean cdi = false;
        boolean garant = true;
        int salaireGarant = 3000;

        System.out.println(appartementConvient(surface, nbPiece, loyer, cuisineEquipe, balcon, parking));
        System.out.println(locataireConvient(salaireMensuelNet, cdi, garant, salaireGarant));

    }

    private static boolean appartementConvient(int surface, int nbPieces, int loyer, boolean cuisineEquipee, boolean balcon, boolean parking) {
        boolean convientAuPremierEnsembleDeCriteres = surface > 80 && nbPieces >= 3 && loyer <= 700;
        boolean convientAuSecondEnsembleDeCriteres = surface > 70 && nbPieces >= 2 && cuisineEquipee && balcon && parking && loyer <= 700;
        return convientAuPremierEnsembleDeCriteres || convientAuSecondEnsembleDeCriteres;
    }

    private static boolean locataireConvient(int salaireMensuelNet, boolean cdi, boolean garant, int salaireGarant) {
        boolean convientAuPremierEnsembleDeCriteres = salaireMensuelNet > 1500 && cdi;
        boolean convientAuSecondEnsembleDeCriteres = salaireMensuelNet >= 900 && garant && salaireGarant >= 3000;
        return convientAuPremierEnsembleDeCriteres || convientAuSecondEnsembleDeCriteres;
    }
}