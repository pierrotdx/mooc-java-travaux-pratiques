public class PartageonsLesBonbons {
    public static void main(String[] args) {
        int nbBonbons = 51;
        int nbEleves = 25;

        int bonbonsPourChacun = nbBonbons / nbEleves;
        System.out.println(bonbonsPourChacun);

        int combienPourLeProfesseur = nbBonbons % nbEleves;
        System.out.println(combienPourLeProfesseur);

        float bonbonsPourChacunSiJAvaisUnCouteau = (float)nbBonbons / nbEleves;
        System.out.println(bonbonsPourChacunSiJAvaisUnCouteau);
    }
}