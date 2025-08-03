public class QuickChange {
    public static void afficherTypeCostume(Object object){
        System.out.println("Attention, je suis à présent un " + object.getClass().getSimpleName() + "!");
    }

    public static Long changerCostumeIntegerEnLong(Integer costumeAsInteger){
        Long result = costumeAsInteger.longValue();
        afficherTypeCostume(result);
        return result;
    }

    public static String changerCostumeLongEnString(Long costumeAsLong){
        String result =  String.valueOf(costumeAsLong);
        afficherTypeCostume(result);
        return result;
    }

    public static Double changerCostumeStringEnDouble(String costumeAsString){
        Double result = Double.parseDouble(costumeAsString);
        afficherTypeCostume(result);
        return result;
    }


    public static void main(String[] args) {
        Integer costume = 100;
        afficherTypeCostume(costume);
        Long costumeAsLong = changerCostumeIntegerEnLong(costume);
        String costumeAsString = changerCostumeLongEnString(costumeAsLong);
        Double costumeAsDouble = changerCostumeStringEnDouble(costumeAsString);
    }
}