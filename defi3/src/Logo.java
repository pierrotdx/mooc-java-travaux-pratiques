public class Logo {
    public  static void main(String... args) {
        Tortue tortue = new InstrumentedTortue();

        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(100);

        tortue.tournerGauche(90);
        tortue.avancer(300);
        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerDroite(90);
        tortue.avancer(300);

        tortue.tournerGauche(90);
        tortue.avancer(100);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(200);

        System.out.println("La valeur de x est " + tortue.x);
        System.out.println("La valeur de y est " + tortue.y);
        System.out.println("La valeur de l'angle est " + tortue.angleActuel);
    }
}
