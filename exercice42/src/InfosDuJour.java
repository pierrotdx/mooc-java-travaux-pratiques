public class InfosDuJour {
    String dateDuJour;
    Drapeau drapeauDuJour;
    Meteo meteoDuJour;

    InfosDuJour(){}

    InfosDuJour(String dateDuJour, Drapeau drapeauDuJour, Meteo meteoDuJour) {
        this.dateDuJour = dateDuJour;
        this.drapeauDuJour = drapeauDuJour;
        this.meteoDuJour = meteoDuJour;
    }

    void afficherInfosDuJour() {
        System.out.println("Date du jour : " + this.dateDuJour);
        System.out.println("Meteo du jour : " + this.meteoDuJour);
        System.out.println("Drapeau du jour : " + this.drapeauDuJour);
        switch (this.drapeauDuJour) {
            case VERT:
                System.out.println("Il ne faut pas baliser la plage");
                break;
            case ORANGE:
                System.out.println("Il faut augmenter le nombre de sauveteurs");
                break;
            case ROUGE:
                System.out.println("Il faut baliser la plage");
                break;
        }
    }
}
