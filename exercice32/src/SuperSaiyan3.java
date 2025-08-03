public class SuperSaiyan3 extends Saiyan {
    SuperSaiyan3(int force, int vitesse) {
        super(force, vitesse);
    }

    void augmenterForce(int force) {
        this.force += force;
        this.vitesse += force;
    }
}
