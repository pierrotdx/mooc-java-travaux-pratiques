public class ReservoirOxygene {
    Integer niveau;
    ReservoirOxygene() {}
    ReservoirOxygene(Integer niveau) {
        this.niveau = niveau;
    }
    String verifierNiveau() {
        if (this.niveau == null) {
            return "Un réservoir à oxygène ne répond pas";
        }
        if (this.niveau == 0) {
            return "Un réservoir à oxygène est vide";
        }
        return "Il reste " + this.niveau.toString() + " litre(s) d'oxygène";
    }
}
