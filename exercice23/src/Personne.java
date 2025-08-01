public class Personne {
    String nom;
    Personne voisin;

    public Personne(String nom) {
        this.nom = nom;
    }

    public Personne(String nom, Personne voisin) {
        this.nom = nom;
        this.voisin = voisin;
    }

    void sePresenter() {
        if (this.voisin != null) {
            System.out.printf("Bonjour je m'appelle %s ! Et toi comment t'appelles-tu ?\n", this.nom);
            this.voisin.sePresenter(this);
        } else {
            System.out.printf("Bonjour je m'appelle %s.", this.nom);
        }
    }


    void sePresenter(Personne interlocuteur) {
        if (this.voisin != null) {
            System.out.printf("Bonjour %s ! Je m'appelle %s. Et toi comment t'appelles-tu ?\n", interlocuteur.nom, this.nom);
            this.voisin.sePresenter(this);
        } else {
            System.out.printf("Bonjour %s ! Je m'appelle %s.\n", interlocuteur.nom, this.nom);
        }
    }
}
