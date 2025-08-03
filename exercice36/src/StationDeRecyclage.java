import java.util.ArrayList;
import java.util.List;

public class StationDeRecyclage {
    private List<Recyclable> produitsARecycler=new ArrayList<>();

    public void arrivage(Recyclable recyclable){
        produitsARecycler.add(recyclable);
    }

    public void recycler(){
        for (Recyclable recyclable : produitsARecycler){
            try{
                System.out.println("Recyclage de "+recyclable.getClass().getSimpleName()+", résultat obtenu: "+recyclable.recycle().nom);
            }
            catch (ProduitNonRecyclableException pnre){
                System.out.println(pnre.getMessage());
            }

        }
    }
}