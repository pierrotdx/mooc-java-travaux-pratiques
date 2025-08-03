public class Main {
    public static void main(String... args) {
        Saiyan saiyan = new Saiyan(1000, 1000);

        SuperSaiyan1 superSaiyan1 = new SuperSaiyan1(saiyan.force, saiyan.vitesse);
        superSaiyan1.augmenterForce(100);

        SuperSaiyan2 superSaiyan2 = new SuperSaiyan2(superSaiyan1.force, superSaiyan1.vitesse);
        superSaiyan2.augmenterForce(200);

        SuperSaiyan3 superSaiyan3 = new SuperSaiyan3(superSaiyan2.force, superSaiyan2.vitesse);
        superSaiyan3.augmenterForce(300);

        System.out.println("La vitesse finale du guerrier est " + superSaiyan3.vitesse);
        System.out.println("La couleur de cheveux finale du guerrier est le " + superSaiyan3.couleurCheveux);
    }
}
