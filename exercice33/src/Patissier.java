public class Patissier extends Candidat {
    Patissier() {
        super();
    }

    Patissier(String nom, int numeroCandidat) {
        super(nom, numeroCandidat);
    }

    Gateau realiserDessert(String nomGateau) {
        Gateau gateau = new Gateau();
        gateau.nom = nomGateau;
        System.out.printf("Le pâtissier %s a réalisé: %s\n", this.nom, gateau.nom);
        return gateau;
    }
}
