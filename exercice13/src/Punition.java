public class Punition {
    public static void main(String[] args) {
        int nbLignes = 25;

        for (int ligne = 1; ligne < nbLignes + 1; ligne++) {
            String message  = "Je n'ai pas le droit d'aller sur Udemy en classe.";
            boolean afficherNumeroDeLigne = ligne > 1 && ligne % 5 == 0;
            if (afficherNumeroDeLigne) {
                message = ligne + " - " + message;
            }
            System.out.println(message);
        }

    }
}