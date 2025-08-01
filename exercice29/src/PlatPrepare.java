public class PlatPrepare {
    double prixTTC;
    private double taux = 1.1;

    PlatPrepare() {
        this.prixTTC = 0;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

    PlatPrepare(double prixHT) {
        this.prixTTC = prixHT * this.taux;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

    PlatPrepare(double prixHT, double reduction) {
        this.prixTTC = prixHT * (1 - reduction / 100) * this.taux;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

}
