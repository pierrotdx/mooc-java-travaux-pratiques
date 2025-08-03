public class BoiteDeConserve implements Recyclable {
    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.METAL;
    }
}
