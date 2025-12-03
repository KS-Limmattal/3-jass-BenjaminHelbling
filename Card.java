/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {

    Suit Suit;
    Rank Rank;

    public Card(Rank Rank, Suit Suit){
        this.Rank = Rank;
        this.Suit = Suit;
    }

    @Override
    public String toString() {
        return "Card is"+ this.Rank + this.Suit ;
    }
    @Override
    public equals(Object Card){
        if(this.Card == Card){

        } else{
            if (this.Rank == Card){

            }
            
        }
        
    }

}
