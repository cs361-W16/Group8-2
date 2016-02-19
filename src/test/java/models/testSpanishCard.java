package models;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Jason on 2/18/2016.
 */
public class testSpanishCard {
    @Test
    public void testGetSuit(){
        Card c = new Card(4,SpanishSuit.Swords);
        assertEquals(SpanishSuit.Swords,c.getSuit());
    }

    @Test
    public void testToString(){
        Card c = new Card(4,SpanishSuit.Swords);
        assertEquals("4Swords",c.toString());
    }

    @Test
    public void testMoveCard(){
        Game g = new Game();
        g.buildDeck();
        g.customDeal(1,2,3,4);
        g.remove(3);
        assertEquals(0,g.cols.get(2).size());
        g.move(1,3);
        assertEquals(1,g.cols.get(2).size());
        assertEquals(2,g.cols.get(2).size());
    }
}
