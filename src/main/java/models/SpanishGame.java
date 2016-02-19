package models;

/**
 * Created by Jason Ye on 2/18/2016.
 */
public class SpanishGame extends Game {
    public void buildSpanishDeck(){
        for (int i = 1; i < 11; i++){
            deck.add(new Card(i, Suit.Cups));
            deck.add(new Card(i, Suit.Clubs));
            deck.add(new Card(i, Suit.Coins));
            deck.add(new Card(i, Suit.Swords));
        }
    }
}
