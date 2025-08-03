public class TasDeFeuilles implements Recyclable {
    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.COMPOST;
    }
}
