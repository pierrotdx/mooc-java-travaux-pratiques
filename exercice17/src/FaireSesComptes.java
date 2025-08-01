public class FaireSesComptes {
    public static void main(String[] args) {
        Compte courant = new Compte('C', 253.5f);
        Compte epargne = new Compte('E', 1600f);

        courant.debiter(56f);
        courant.debiter(35f);
        courant.debiter(15f);
        courant.debiter(125.5f);

        epargne.verser(courant, 150);

        courant.debiter(68f);
        courant.debiter(99f);

        System.out.printf("Il reste %f en fin de semaine sur le compte courant.\n", courant.solde);
        System.out.printf("Il reste %f en fin de semaine sur le compte épargne.\n", epargne.solde);
    }
}
