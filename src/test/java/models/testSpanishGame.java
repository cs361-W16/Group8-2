package models;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Jason Ye on 2/20/2016.
 */
public class testSpanishGame {
    @Test
    public void SpanishGameCreation(){
        Game s = new Spanish_Game();
        assertNotNull(s);
    }

    @Test
    public void testBuildSpanishDeck(){
        Game g = new Spanish_Game();
        assertEquals(40,g.deck.size());
    }
    
    @Test
    public void testSpanishDeckCount(){
        Game s = new Spanish_Game();
        assertEquals(40,s.deck.size());
    }

    @Test
    public void testSpanishCustomDeal(){
        Game g = new Spanish_Game();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("1Swords",g.cols.get(0).toString());
        assertEquals("2Swords",g.cols.get(1).toString());
        assertEquals("3Swords",g.cols.get(2).toString());
        assertEquals("4Swords",g.cols.get(3).toString());
    }

    @Test
    public void testSpanishGameRemove(){
        Game g = new Spanish_Game();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }
}
