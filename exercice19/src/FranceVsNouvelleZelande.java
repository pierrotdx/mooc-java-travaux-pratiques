public class FranceVsNouvelleZelande {
    public static void main(String... args) {
        Equipe france = new Equipe("France");
        Equipe nouvelleZelande = new Equipe("Nouvelle Zélande");

        france.essai(false);
        france.essai(false);
        france.essai(false);
        france.drop();

        nouvelleZelande.essai(true);
        nouvelleZelande.essai(true);

        System.out.printf("L'équipe de France bat la Nouvelle-Zélande par %d points à %d.", france.score, nouvelleZelande.score);
    }
}
