public class VieuxJournal implements Recyclable {
    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        return MatiereRecyclee.PATE_A_PAPIER;
    }
}
