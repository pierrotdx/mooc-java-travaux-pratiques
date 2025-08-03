public class ProduitNonRecyclableException extends Exception {

    public ProduitNonRecyclableException (Object o){
        super("L'objet de type "+o.getClass().getSimpleName()+" n'est pas recylable !");
    }

}