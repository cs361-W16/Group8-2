package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brandon on 2/18/2016.
 */
public class testEng_Card {
    @Test
    public void testGetSuit(){
        Eng_Card c = new Eng_Card(5,Eng_Suit.Clubs);
        assertEquals(Eng_Suit.Clubs,c.getSuit());
    }

    @Test
    public void testToString(){
        Eng_Card c = new Eng_Card(5,Eng_Suit.Clubs);
        assertEquals("5Clubs",c.toString());
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
    }

}
