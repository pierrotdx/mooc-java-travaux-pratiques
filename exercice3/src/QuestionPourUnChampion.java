import java.util.Scanner;

public class QuestionPourUnChampion {

    public static void main(String[] args) {
        int score = 0;
        String answer;

        System.out.println("Quel était le métier de Roland Garros ?");
        answer = "aviateur";
        System.out.println(answer);
        if (answer.equalsIgnoreCase("aviateur")) {
            score++;
        }

        System.out.println("Comment se nommaient les missions américaine qui ont mené le 1er homme sur la lune ?");
        answer = "apollo";
        System.out.println(answer);

        if (answer.equalsIgnoreCase("Apollo")) {
            score++;
        }

        System.out.println("A quoi correspond le symbole chimique N ?");
        answer = "azote";
        System.out.println(answer);
        if (answer.equalsIgnoreCase("azote")) {
            score++;
        }

        System.out.println("Qui a écrit le Rouge et le Noir ?");
        answer = "Stendhal";
        System.out.println(answer);
        if (answer.equalsIgnoreCase("Stendhal")) {
            score++;
        }

        System.out.println("Quelle pays trouve t-on entre l'Italie et le Liechtenshtein ?");
        answer = "Suisse";
        System.out.println(answer);
        if (answer.equalsIgnoreCase("Suisse")) {
            score++;
        }

        System.out.printf("Votre score est de %d/5.\n", score);
    }

}