import java.util.Random;
import java.util.Arrays;

/**
 * Diese Klasse repräsentiert einen Kartenstapel mit einer variablen Anzahl
 * Karten
 * Sie soll ein Array cards von Typ Card als Instanzvariable haben,
 * - einen Konstruktor Deck(Card[] cards), welches eine Instanz bestehend aus
 * den gegebenen Karten kreiert,
 * - einen Konstruktor Deck(), welcher ein vollständiges Kartenset (4x9 Karten)
 * erzeugt,
 * - einen (trivialen) Getter getCards()
 * - eine Methode addCard(Card card), welche zum Deck eine Karte hinzufügt,
 * falls diese noch nicht im Deck enthalten ist und andernfalls eine Warnung auf
 * der Konsole ausgibt
 * - eine Methode pop(), welche die letzte Karte im Array aus dem Deck entfernt,
 * sofern Karten vorhanden sind
 * - eine Methode shuffle(), welche die Karten im Array durchmischt
 * 
 * Tipps:
 * - Um ein Array zu redimensionieren, verwende den Befehl "Arrays.copyOf" aus
 * java.util.Arrays
 * - Um eine zufällige Ganzzahl in einem gegebenen Bereich zu erzeugen, verwende
 * "rnd.nextInt", wobei "rnd" eine Instanz der Klasse "Random" aus
 * "java.util.Random" bezeichnet
 *
 */
public class Deck {
    
    Card[] cards = new Card[0];


    // Deck erstellen mit Karten mit Namen
    public Deck(Card[] cards){
        this.cards = cards;
    }

    // volles Decke estellen
    public Deck(){
        for (Suit s : Suit.values()){
            for (Rank r : Rank.values()){
                Card c = new Card(r,s);
                addCard(c);
            }
        }
    }

    // Hinzufügen von Karte und Kontrolle ob die Karte bereits im Deck ist.
    public void addCard(Card card){
        boolean add = true;
        if(cards.length != 0){
            for(int i = 0; i < cards.length ; i++ ){
                if(cards[i].equals(card)){
                    add = false;
                }
            }  
        }
        
        if (add){
            cards = Arrays.copyOf(cards, cards.length +1);
            cards[cards.length -1] = card;
        }
        else{
            System.out.println("die Karte "+ card +" ist bereits im Stapel und wird nicht hinzugefügt");
        } 
    }

    // gibt das Ganze Deck (alle Karten) Zurück
    public Card[] getCards(){
        return cards;
    }

    public Card pop(){
        Card gezogen = new Card(null,null);
        if (cards.length != 0){
            gezogen = cards[cards.length-1];
            cards = Arrays.copyOf(cards, cards.length -1);
            return gezogen;
        }
        else{
            return null;
        }
    }

    public void shuffle(){
        for (int i = 0; i < 36; i++){
            Random rnd = new Random();
            int nummer = rnd.nextInt(cards.length);
            Card karte1 = cards[i];
            Card karte2 = cards[nummer];
            cards[i] = karte2;
            cards[nummer]= karte1;
        }
    }

    public static Suit suit;

    public void validCards(Deck played){
        // eine Deck erstellen mit einem Array von spielbaren Karten
        Deck playable = new Deck(new Card[0]);

        if (played.cards.length == 0){
            for (int i = 0 ; i < this.cards.length; i++){
                playable.addCard(this.cards[i]);
            }
            
        }
        else{
            for (int i = 0; i < played.cards.length; i ++){
                if(played.cards[i].suit ==  suit ){
                    for (int j =0; j < cards.length; j++){
                        if (cards[j].suit == suit){
                            playable.addCard(this.cards[j]);
                        }
                    }
                }
            }
        }
        if (playable.cards.length == 0){
            for (int i = 0 ; i < this.cards.length; i++){
                playable.addCard(this.cards[i]);
            }
        }
        System.out.println(Arrays.toString(playable.getCards()));
    }
    
    public static void distributecards( Deck deck, Deck[] handCards){
        for (int i = 0; i < deck.cards.length; i++ ){
            for (int j =0; j<4; j++){
                Card gezogen = new Card(null,null);
                gezogen = deck.pop();
                handCards[j].addCard(gezogen);
            }
        }
    }

}
