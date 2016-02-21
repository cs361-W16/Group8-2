package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by Jason Ye on 2/19/2016.
 */
public class Spanish_Game extends Game{
    public void buildDeck(){
        for (int i = 1; i < 11; i++){
            deck.add(new Card(i,Suit.Coins));
            deck.add(new Card(i,Suit.Cups));
            deck.add(new Card(i,Suit.Swords));
            deck.add(new Card(i,Suit.Clubs));
        }
    }
}
