public class Compte {
    /** C : courant, E : épargne */
    char type;
    float solde;

    Compte(char type, float solde) {
        this.type = type;
        this.solde = solde;
    }

    void debiter(float montant) {
        this.solde -= montant;
    }

    void crediter(float montant) {
        this.solde += montant;
    }

    void verser(Compte compteCible, float montant) {
        this.debiter(montant);
        compteCible.crediter(montant);
    }
}
