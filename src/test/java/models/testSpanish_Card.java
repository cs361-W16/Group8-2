package models;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Jason Ye on 2/19/2016.
 */
public class testSpanish_Card {
    @Test
    public void testGetSpanishSuit(){
        Spanish_Card c = new Spanish_Card(5,Spanish_Suit.Coins);
        assertEquals(Suit.Swords, c.getSuit());
    }

    @Test
    public void testToString(){
        Spanish_Card c = new Spanish_Card(5,Spanish_Suit.Coins);
        assertEquals("5Coins", c.toString());
    }

    @Test
    public void testMoveCard(){
        Game g = new Game();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
        g.move(0,2);
        assertEquals(1,g.cols.get(2).size());
        assertEquals(0,g.cols.get(0).size());
        //fixed
    }
}
