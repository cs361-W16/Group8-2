package models;

/**
 * Created by Jason Ye on 2/19/2016.
 */
public class Spanish_Game extends Game {
    public void buildSpanishDeck(){
        for (int i = 1; i < 11; i++){
            deck.add(new Card(i,Spanish_Suit.Cups));
            deck.add(new Card(i,Spanish_Suit.Swords));
            deck.add(new Card(i,Spanish_Suit.Coins));
            deck.add(new Card(i,Spanish_Suit.Clubs));
        }
    }
}
