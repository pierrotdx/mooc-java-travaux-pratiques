public class Chocolatier extends Candidat {
    Chocolatier() {
        super();
    }

    Chocolatier(String nom, int numeroCandidat) {
        super(nom, numeroCandidat);
    }

    MontageChocolat realiserDessert(String nomMontageChocolat) {
        MontageChocolat montageChocolat = new MontageChocolat();
        montageChocolat.nom = nomMontageChocolat;
        System.out.printf("Le chocolatier %s a réalisé: %s\n", this.nom, montageChocolat.nom);
        return montageChocolat;
    }
}
