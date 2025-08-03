public class SuperSaiyan2 extends Saiyan {
    SuperSaiyan2(int force, int vitesse) {
        super(force, vitesse);
    }

    void augmenterForce(int force) {
        this.force += force;
        this.vitesse -= force;
    }
}
