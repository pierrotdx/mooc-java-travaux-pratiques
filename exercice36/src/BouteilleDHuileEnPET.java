public class BouteilleDHuileEnPET extends BouteilleEnPET {
    @Override
    public MatiereRecyclee recycle() throws ProduitNonRecyclableException {
        throw new ProduitNonRecyclableException(this);
    }
}
