public class Fomo {
    public static void main(String... args) {
        Message message = new Message();
        String text;

        text = message.contactVoix("0064223664715");
        System.out.println(text);

        text = message.contactVoix("skype", "jpejnesis");
        System.out.println(text);

        text = message.contactTexte("skype", "jpejnesis");
        System.out.println(text);
    }
}
