public class Candidat {
    String nom;
    int numeroCandidat;

    Candidat() {}

    Candidat(String nom, int numeroCandidat) {
        super();
        this.nom = nom;
        this.numeroCandidat = numeroCandidat;
    }

    Dessert realiserDessert(String nomDessert) {
        Dessert dessert = new Dessert();
        dessert.nom = nomDessert;
        System.out.printf("Le candidat %s a réalisé: %s\n", this.nom, dessert.nom);
        return dessert;
    }
}
