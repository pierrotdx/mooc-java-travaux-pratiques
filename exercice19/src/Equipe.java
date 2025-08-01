public class Equipe {
    String nom;
    int score;

    Equipe(String nom) {
        this.nom = nom;
    }

    void essai(boolean avecTransformation) {
        this.score += 5;
        if (avecTransformation) {
            this.transformation();
        }
    }

    void transformation() {
        this.score += 2;
    }

    void drop() {
        this.score += 3;
    }
}
