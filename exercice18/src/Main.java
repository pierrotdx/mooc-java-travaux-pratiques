import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        List<MembreDesNuls> troupe = new ArrayList<MembreDesNuls>();
        troupe.add(new MembreDesNuls("Alain Chabat"));
        troupe.add(new MembreDesNuls());
        troupe.add(new MembreDesNuls("Chantal Lauby"));
        troupe.add(new MembreDesNuls("Dominique Farrugia"));
        troupe.add(new MembreDesNuls("Bruno Carette"));

        for (MembreDesNuls membre : troupe) {
            String phrase = membre.nom != null
                    ? membre.nom + " est bien un membre des Nuls."
                    : null + " n'est pas un membre des Nuls.";
            System.out.println(phrase);
        }
    }
}
