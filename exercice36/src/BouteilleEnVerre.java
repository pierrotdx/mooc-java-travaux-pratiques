public class BouteilleEnVerre implements  Recyclable {
    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.VERRE;
    }
}
