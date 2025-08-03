public class Main {
    static public void main(String... args) {
        Concours concours = new Concours();

        Candidat candidat = new Candidat("Ferrau Gauthier", 1);
        concours.dessert = candidat.realiserDessert("Paris Brest");;

        Patissier patissier = new Patissier("Voleta Labossière", 2);
        concours.gateau = patissier.realiserDessert("Forêt Noire");

        Chocolatier chocolatier = new Chocolatier("Annette Lessard", 2);
        concours.montageChocolat = chocolatier.realiserDessert("Oeuf de Pâque en chocolat");

        Glacier glacier = new Glacier("Emmanuel Picard", 2);
        concours.glace = glacier.realiserDessert("Glace Vanille-Fraise revisitée");

        concours.designerGagnant();
    }
}
