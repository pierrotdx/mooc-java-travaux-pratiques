public class Loto {
    public static void main(String[] args) {
        int factureElectricite = 341;
        int gainLoto = 25000;
        int coutVoiture = 18000;
        int coutRadar = 450;
        int coutJantes = 900;
        int detteGrandMere = 5000;
        int total = gainLoto - factureElectricite - coutVoiture - coutJantes - coutRadar - detteGrandMere;

        if (total > 0) {
            System.out.printf("Oui, je peux acheter ma voiture et il me restera %d euros !\n", total);
        } else {
            System.out.printf("Non, je ne peux pas acheter la voiture. Il me manque %d euros !\n", Math.abs(total));
        }
    }
}