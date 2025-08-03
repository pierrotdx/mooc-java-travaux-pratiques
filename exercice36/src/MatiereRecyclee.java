public enum MatiereRecyclee {
    METAL("métal"),
    COMPOST("compost"),
    VERRE("verre"),
    PET("poly éthylène téréphtalate"),
    PATE_A_PAPIER("pâte à papier");

    String nom;

    MatiereRecyclee(String nom) {
        this.nom = nom;
    }
}
