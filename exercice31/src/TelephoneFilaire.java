public class TelephoneFilaire extends ConducteurDeCourant {
    public FilsDeCuivre extraireLesFilsDeCuivre() {
        this.operationnel = true;
        return new FilsDeCuivre();
    };
}