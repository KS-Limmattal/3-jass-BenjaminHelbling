import java.util.Arrays;

/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen (als Testcode) von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
public class Jass {

    Deck[] handCards = new Deck[4];
    
    public static void distributecards( Deck deck, Deck[] handCards){
        // ich werde in der Nächsten stunde die pop funktion erweitern das sie sich die gezogene karte merkt um sie dann in zu distribute cards hinzuzufügen.
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = new Card( Rank.ASS , Suit.ROSEN);
        d.shuffle();
        for(int i = 0; i< 30 ; i++){
            d.pop();
        }
        d.addCard(c);
        System.out.println(Arrays.toString(d.getCards()));
    }
}
