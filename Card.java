/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {

    Suit suit;
    Rank rank;

    public Card(Rank Rank, Suit Suit){
        this.rank = Rank;
        this.suit = Suit;
    }

    @Override
    public String toString() {
        return this.rank + " " + this.suit ;
    }
    
    public boolean equals(Card card){
        return this.suit == card.suit && this.rank == card.rank;
    }

}
