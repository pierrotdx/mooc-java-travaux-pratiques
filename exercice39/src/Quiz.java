import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reponseUtilisateur;
        int score = 0;

        System.out.println("Quel est votre nom?");
        reponseUtilisateur = sc.nextLine();
        System.out.println("Démarrons le quiz " + reponseUtilisateur);

        System.out.println("Est-ce que 1 > 0 ? oui/non");
        reponseUtilisateur = sc.nextLine();
        if (reponseUtilisateur.equals("oui")) {
            score++;
        }

        System.out.println("Est-ce que 1 < 0 ? oui/non");
        reponseUtilisateur = sc.nextLine();
        if (reponseUtilisateur.equals("non")) {
            score++;
        }

        System.out.println("Est-ce que 1 = 0 ? oui/non");
        reponseUtilisateur = sc.nextLine();
        if (reponseUtilisateur.equals("non")) {
            score++;
        }

        System.out.println("Votre score final est de " + score);

    }

}
