/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen (als Testcode) von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
public class Jass {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = new Card( Rank.ASS , Suit.ROSEN);
        d.addCard(c);
        System.out.println(d.cards.length);
    }
}
