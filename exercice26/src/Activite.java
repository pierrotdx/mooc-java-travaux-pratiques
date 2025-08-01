public class Activite {
    String nom;
    int nbCaloriesPerdues;
    static int nbActivite;

    void effectuer() {
        nbActivite++;
        Repas.compteurCalories -= this.nbCaloriesPerdues;
    }
}
