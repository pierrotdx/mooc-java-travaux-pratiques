import java.util.ArrayList;
import java.util.List;

public class Concours {
    Dessert dessert;
    Gateau gateau;
    Glace glace;
    MontageChocolat montageChocolat;

    void designerGagnant(){
        if(dessert != null && montageChocolat != null && glace != null && gateau!= null){
            List<Dessert> listeDessert = new ArrayList();
            listeDessert.add(dessert);
            listeDessert.add(montageChocolat);
            listeDessert.add(glace);
            listeDessert.add(gateau);

            int numeroGagnant = 0 + (int)(Math.random() * ((3 - 0) + 1));

            System.out.println("Le dessert gagnant est: " + listeDessert.get(numeroGagnant).nom);
        } else {
            System.out.println("Tous les desserts ne sont pas terminés");
        }
    }
}
