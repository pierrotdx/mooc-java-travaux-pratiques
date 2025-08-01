public class SecondesAu21emeSiecle {
    public static void main(String... args) {
        TempsPasse tempsPasse = new TempsPasse();

        // pour la date de l'exercice : 2018-04-01 à 14h28m32s
        int nbAnnees = 18;
        int nbMois = 4;
        int nbHeures = 14;
        int nbMinutes = 28;
        int nbSecondes = 32;

        for (int annee = 2000 ; annee < 2000 + nbAnnees; annee++) {
            tempsPasse.ajouteAnnee(annee);
            System.out.println("annee : " + annee);
        }

        for (int mois = 1; mois < nbMois; mois++) {
            tempsPasse.ajouteMois(mois, false);
            System.out.println("mois : " + mois);
        }

        tempsPasse.ajouteHeures(nbHeures);
        tempsPasse.ajouteMinutes(nbMinutes);
        tempsPasse.ajouteSecondes(nbSecondes);

        System.out.printf("Au 21ème siècle il y a eu %d secondes", tempsPasse.nombreDeSecondes);
    }
}
