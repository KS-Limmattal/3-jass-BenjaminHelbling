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

    public void pop(){
        if (cards.length != 0){
            cards = Arrays.copyOf(cards, cards.length -1);
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

}
