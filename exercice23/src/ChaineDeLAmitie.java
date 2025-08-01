public class ChaineDeLAmitie {
    public static void main(String... args){
        Personne cyrille = new Personne("Cyrille");
        Personne lola = new Personne("Lola", cyrille);
        Personne lisa = new Personne("Lisa", lola);
        Personne julien = new Personne("Julien", lisa);
        Personne rene = new Personne("René", julien);
        rene.sePresenter();
    }
}
