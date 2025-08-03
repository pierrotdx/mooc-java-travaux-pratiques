public class SuperSaiyan1 extends Saiyan {
    SuperSaiyan1(int force, int vitesse) {
        super(force, vitesse);
        this.couleurCheveux = "jaune";
    }

     void augmenterForce(int force) {
        this.force += force;
    }
}
