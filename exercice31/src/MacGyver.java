public class MacGyver {
    public static void main(String... args){

        SourceDeCourant source = new Voiture();
        ConducteurDeCourant conducteur = new TelephoneFilaire();
        ElectroAimant aimant = new RobinetEnInox();

        FilsDeCuivre filsDeCuivre = ((TelephoneFilaire)conducteur).extraireLesFilsDeCuivre();
        ((Voiture)source).brancherLesFilsSurLaBatterie(filsDeCuivre);
        ((RobinetEnInox)aimant).entourerDeFilsDeCuivre(filsDeCuivre);

        if (source.operationnel && conducteur.operationnel && aimant.operationnel){
            System.out.println("MacGyver place l'électro-aimant contre la porte et fait glisser la barre de fer jusqu'à sa chute");
        }
        else {
            System.out.println("Le dispositif n'est pas opérationnel, vous devez apporter des modifications");
        }
    }
}