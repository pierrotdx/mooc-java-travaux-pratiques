public class Apollo {
    String nom;
    ReservoirOxygene reservoirOxygene1 = new ReservoirOxygene();
    ReservoirOxygene reservoirOxygene2 = new ReservoirOxygene(0);
    ReservoirCarburant reservoirCarburant1 = new ReservoirCarburant(20);
    ReservoirCarburant reservoirCarburant2 = new ReservoirCarburant(987);
    Propulseur propulseur1 = new Propulseur(true);
    Propulseur propulseur2 = new Propulseur(false);

    Apollo() {}

    Apollo(String nom){
        this.nom = nom;
    }

    void decollage() {
        if (this.propulseur1 != null && this.propulseur2 != null && this.reservoirCarburant1 != null && this.reservoirCarburant2 != null && this.reservoirOxygene1 != null && this.reservoirOxygene2 != null) {
            System.out.println("Apollo décolle!");
            System.out.println(this.verifierPropulseurs());
            System.out.println(this.reservoirCarburant1.verifierNiveau());
            System.out.println(this.reservoirCarburant2.verifierNiveau());
            System.out.println(this.reservoirOxygene1.verifierNiveau());
            System.out.println(this.reservoirOxygene2.verifierNiveau());
        }
    }

    String verifierPropulseurs() {
        if (this.propulseur1.enFonction == null || this.propulseur2.enFonction == null) {
            return "Houston nous avons un problème! Un propulseur ne répond plus!";
        }
        if (!this.propulseur1.enFonction || !this.propulseur2.enFonction) {
            return "Houston nous avons un problème! Un propulseur s'est arrêté de fonctionner!";
        }
        return "Tout va bien Houston!";
    }
}
