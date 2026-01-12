import java.util.Arrays;

/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen (als Testcode) von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
public class Jass {   

    public static void main(String[] args) {
        Deck[] handKarten = new Deck[]{new Deck(new Card[0]), new Deck(new Card[0]), new Deck(new Card[0]), new Deck(new Card[0])};
        Deck d = new Deck();
        d.shuffle();
        Deck.distributecards(d, handKarten);
        System.out.println(Arrays.toString(handKarten[0].getCards()));
    }
}
