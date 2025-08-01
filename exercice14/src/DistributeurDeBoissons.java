public class DistributeurDeBoissons {


    public static void main(String[] args) {

        float prixBoisson=2.50f;
        float montantIntroduit=10f;

        float montantARendre = montantIntroduit - prixBoisson;

        int nbPieces2e = 0;
        int nbPieces1e = 0;
        int nbPieces50c = 0;
        int nbPieces20c = 0;
        float montantCourant = 0f;

        while (montantCourant + 2f <= montantARendre) {
            montantCourant += 2f;
            nbPieces2e++;
        }

        while (montantCourant + 1f <= montantARendre) {
            montantCourant += 1f;
            nbPieces1e++;
        }

        while (montantCourant  + 0.5f <= montantARendre) {
            montantCourant += 0.5f;
            nbPieces50c++;
        }

        while (montantCourant + 0.2f <= montantARendre) {
            montantCourant += 0.2f;
            nbPieces20c++;
        }

        System.out.println("Le nombre de pièces de 2 Euros rendues est de : " + nbPieces2e);
        System.out.println("Le nombre de pièces de 1 Euro rendues est de : " + nbPieces1e);
        System.out.println("Le nombre de pièces de 0.50 Euro rendues est de : " + nbPieces50c);
        System.out.println("Le nombre de pièces de 0.20 Euro rendues est de : " + nbPieces20c);

    }


}