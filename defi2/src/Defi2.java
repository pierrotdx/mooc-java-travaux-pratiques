public class Defi2 {
    public static void main(String[] args) {
        double distanceAParcourir = 8f;
        int count = 0;
        while (distanceAParcourir != 0) {
            distanceAParcourir = distanceAParcourir / 2f;
            count++;
        }
        System.out.println(count);
    }
}
