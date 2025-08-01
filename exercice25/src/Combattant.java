public class Combattant {
    String type;
    int niveauDeVie;
    Arme arme;

    public Combattant(String type) {
        this.type = type;
    }

    void saisirArme(Arme arme) {
        this.arme = arme;
    }

    void attaquer(Combattant ennemi) {
        if (this.arme == null) {
            return;
        }
        ennemi.niveauDeVie -= this.arme.degats;
        if (ennemi.niveauDeVie <= 0) {
            System.out.printf("%s a vaincu le combattant %s\n", this.type, ennemi.type);
        }
    }

    void soigner(Combattant cible) {
        cible.niveauDeVie += 10;
    }
}
