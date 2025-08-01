public class Morse {
    public static void main(String[] args) {
        String messageCode = "";
        messageCode += Bateau.lettreVersMorse("S") + " ";
        messageCode += Bateau.lettreVersMorse("O") + " ";
        messageCode += Bateau.lettreVersMorse("S");
        System.out.println("Message de détresse : " + messageCode);

        String messageDecode = "";
        messageDecode += Bateau.morseVersLettre("...");
        messageDecode += Bateau.morseVersLettre("---");
        messageDecode += Bateau.morseVersLettre("...");
        System.out.println("...---... signifie : " + messageDecode);
    }

}
