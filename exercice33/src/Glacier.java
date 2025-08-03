public class Glacier extends Candidat {
    Glacier() {
        super();
    }

    Glacier(String nom, int numeroCandidat) {
        super(nom, numeroCandidat);
    }

    Glace realiserDessert(String nomGlace) {
        Glace glace = new Glace();
        glace.nom = nomGlace;
        System.out.printf("Le glacier %s a réalisé: %s\n", this.nom, glace.nom);
        return glace;
    }
}
