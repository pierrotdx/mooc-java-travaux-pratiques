public class Tortue {
     int x = 0;
     int y = 0;
     int angleActuel = 0;

    void avancer(int combien) {
        switch (this.angleActuel) {
            case 0:
                y += combien;
            case 90:
                x -= combien;
                break;
            case 180:
                y -= combien;
                break;
            case 270:
                x+= combien;
                break;
        }
    }

    void tournerDroite(int angle) {
        if (angle == 90 || angle == 180 || angle == 270) {
            this.angleActuel += angle;
        }
    }

    void tournerGauche(int angle) {
        if (angle == 90 || angle == 180 || angle == 270) {
            this.angleActuel -= angle;
        }
    }
}
