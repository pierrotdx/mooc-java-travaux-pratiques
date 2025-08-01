public class Salade {
    Pomme pomme = new Pomme();
    Fraise fraise1 = new Fraise();
    Fraise fraise2 = new Fraise();
    Fraise fraise3 = new Fraise();
    Fraise fraise4 = new Fraise();
    Fraise fraise5 = new Fraise();
    Fraise fraise6 = new Fraise();
    Poire poire = new Poire();
    Mandarine mandarine1 = new Mandarine();
    Mandarine mandarine2 = new Mandarine();
    Banane banane = new Banane();

    Salade() {
        new Fraise();
        new Fraise();
        new Banane();
    }

    public static void main(String... args){
        new Salade();
    }
}
