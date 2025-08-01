public class BatailleTerreDuMilieu {
    public static void main(String[] args) {
        Combattant humain = new Combattant("HUMAIN");
        humain.niveauDeVie = 10;
        Arme epee = new Arme("EPEE", 20);
        humain.saisirArme(epee);

        Combattant orc = new Combattant("ORC");
        orc.niveauDeVie = 21;

        humain.attaquer(orc);
        humain.attaquer(orc);
    }
}
