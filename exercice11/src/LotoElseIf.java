public class LotoElseIf {
    public static void main(String[] args) {
        int gainLoto = 25000;
        int billetTrouve = 50;

        int factureElectricite = 341;
        int coutVoiture = 18000;
        int optionRadar = 450;
        int optionJantesAlu = 900;
        int detteGrandMere = 5000;
        int impot = 448;

        int entrees = gainLoto + billetTrouve;
        int depensesSansOptions = factureElectricite + coutVoiture + detteGrandMere + impot;
        int totalSansOptions = entrees - depensesSansOptions;

        int montantOptions = optionRadar + optionJantesAlu;
        int total = totalSansOptions - montantOptions;

        if (total > 0) {
            System.out.printf("Oui, je peux acheter ma voiture et il me restera %d euros !\n", total);
        } else if (totalSansOptions > 0) {
            int montantManquantPourOptions = montantOptions - totalSansOptions;
            System.out.printf("Je peux acheter la voiture mais il me manque %d euros pour les options !", montantManquantPourOptions);
        }
        else {
            System.out.printf("Non, je ne peux pas acheter la voiture. Il me manque %d euros !\n", Math.abs(total));
        }
    }
}
