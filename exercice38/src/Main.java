import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informations du système");

        Map<String, String> properties = new HashMap<String, String>();
        properties.put("Nom d'utilisateur", "user.name");
        properties.put("Système d'exploitation", "os.name");
        properties.put("Version du système d'exploitation", "os.version");
        properties.put("Architecture du système d'exploitation", "os.arch");
        properties.put("Répertoire courant de travail", "user.dir");
        properties.put("Version Java", "java.version");
        properties.put("Emplacement Java", "java.home");


        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String value = System.getProperty(entry.getValue());
            System.out.printf("%s: %s\n", entry.getKey(), value);
        }
    }
}
