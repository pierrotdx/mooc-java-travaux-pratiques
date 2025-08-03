public class Recyclage {

    public static void main(String... args) {
        StationDeRecyclage usine=new StationDeRecyclage();
        usine.arrivage(new BoiteDeConserve());
        usine.arrivage(new BouteilleEnPET());
        usine.arrivage(new TasDeFeuilles());
        usine.arrivage(new BouteilleEnVerre());
        usine.arrivage(new BoiteDeSardines());
        usine.arrivage(new BouteilleDHuileEnPET());
        usine.arrivage(new VieuxJournal());

        usine.recycler();
    }

}
