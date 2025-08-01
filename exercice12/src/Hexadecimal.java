public class Hexadecimal {

    public static void main(String[] args) {
        char hexadecimalValue = 'C';
        int decimalValue = -1;
        switch (hexadecimalValue) {
            case '0':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                decimalValue = Integer.parseInt(Character.toString(hexadecimalValue));
                break;
            case 'A':
                decimalValue = 10;
                break;
            case 'B':
                decimalValue = 11;
                break;
            case 'C':
                decimalValue = 12;
                break;
            case 'D':
                decimalValue = 13;
                break;
            case 'E':
                decimalValue = 14;
                break;
            case 'F':
                decimalValue = 15;
                break;
            default:
                System.out.println("Ceci n'est pas une valeur hexadécimale.");
        }
        if (decimalValue > 0) {
            System.out.printf("'%c' en hexadécimale correspond à %d en base 10\n", hexadecimalValue, decimalValue);
        }
    }
}