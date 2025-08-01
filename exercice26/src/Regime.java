public class Regime {
    static public void main(String... args) {
        Repas petitDej = new Repas();
        petitDej.nbCaloriesGagnees = 600;

        Repas dej = new Repas();
        dej.nbCaloriesGagnees = 200;

        Repas diner = new Repas();
        diner.nbCaloriesGagnees = 233;

        Activite course = new Activite();
        course.nbCaloriesPerdues = 299;

        petitDej.consommer();
        dej.consommer();
        course.effectuer();
        diner.consommer();

        int maxNbCaloriesQuotidien = 2000;
        if (Repas.compteurCalories < maxNbCaloriesQuotidien) {
            System.out.printf("Apres %d repas et %d activité(s) mon apport calorique du jours est %d calories\n", Repas.nbRepas, Activite.nbActivite, Repas.compteurCalories);
            System.out.printf("Je suis bien en dessous de %d calories\n", maxNbCaloriesQuotidien);
        }
    }
}
