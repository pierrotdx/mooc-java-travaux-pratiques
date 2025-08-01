public class Message {
    String contactVoix(String numero) {
        return this.contactVoix("téléphone", numero);
    }

    String contactVoix(String type, String idDestinataire) {
        return "Tentative de contact voix avec " + idDestinataire + " par " + type;
    }

    String contactTexte(String email) {
        return this.contactTexte("email", email);
    }

    String contactTexte(String type, String idDestinataire) {
        return "Tentative de contact texte avec " + idDestinataire + " par " + type;
    }
}
