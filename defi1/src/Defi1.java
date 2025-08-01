public class Defi1 {
    public static void main(String... args) {
      double pi = 0;
      int nbIterations = 2000000;
      int signe = 1;
      for (int iteration = 1; iteration < nbIterations + 1; iteration += 2) {
        pi = pi + signe * 4f / iteration;
        signe = -1 * signe;
      }
        System.out.println(pi);
    }
}
