public class Repas {
    static int compteurCalories;
    static int nbRepas;
    String nom;
    int nbCaloriesGagnees;

    void consommer() {
        nbRepas++;
        compteurCalories += this.nbCaloriesGagnees;
    }
}
