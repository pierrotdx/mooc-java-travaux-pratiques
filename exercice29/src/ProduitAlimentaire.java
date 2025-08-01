public class ProduitAlimentaire {
    double prixTTC;
    private double taux = 1.055;

    ProduitAlimentaire() {
        this.prixTTC = 0;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

    ProduitAlimentaire(double prixHT) {
        this.prixTTC = prixHT * this.taux;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

    ProduitAlimentaire(double prixHT, double reduction) {
        this.prixTTC = prixHT * (1 - reduction / 100) * this.taux;
        Epicerie.chiffreAffaires += this.prixTTC;
    }
}
