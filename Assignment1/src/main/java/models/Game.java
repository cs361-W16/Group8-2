package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class Game {

    public java.util.List<Card> deck = new ArrayList<>();

    public java.util.List<java.util.List<Card>> cols = new ArrayList<>();


    public Game(){
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }














    //I like space between my methods





















    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }












    //I like space between my methods














    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void dealFour() {
        for(int i = 0; i < 4; i++){
            cols.get(i).add(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
    }

    //customDeal to setup game for testing purposes
    public void customDeal(int c1, int c2, int c3, int c4) {
        cols.get(0).add(deck.get(c1));
        deck.remove(c1);
        cols.get(1).add(deck.get(c2));
        deck.remove(c2);
        cols.get(2).add(deck.get(c3));
        deck.remove(c3);
        cols.get(3).add(deck.get(c4));
        deck.remove(c4);
    }

    public void remove(int columnNumber) {
        Card c = getTopCard(columnNumber);
        boolean removeCard = false;
        for(int i = 0; i < 4; i++){
            if(i != columnNumber){
                Card compare = getTopCard(i);
                if(compare.getSuit() == c.getSuit()){
                    if(compare.getValue()> c.getValue()){
                        removeCard = true;
                    }
                }
            }
        }
        if(removeCard){
            this.cols.get(columnNumber).remove(this.cols.get(columnNumber).size()-1);
        }

    }

    private Card getTopCard(int columnNumber) {
        return this.cols.get(columnNumber).get(this.cols.get(columnNumber).size()-1);
    }

    /*
    This could be problematic.
    Don't call this.
     */
    private void mayhem()
    {
        //Let's not talk about this
        List<List<List<List<List<Card>>>>> cards = new ArrayList<List<List<List<List<Card>>();

        int mayhemVar = 0;

        //Loop 0
        for(int i = 0; i < 10; i++)
        {
            //Loop 1
            for(int j = 0; j < 10; j++)
            {
                //Loop 2
                for(int k = 0; k < 10; k++)
                {
                    //Loop 3
                    for(int l = 0; l < 10; l++)
                    {
                        //Loop 4
                        for(int m = 0; m < 10; m++)
                        {
                            mayhemVar += 1;
                            List<List<List<List<Card>>>> cardListListListList = new ArrayList<List<List<List<Card>();
                            cards.add(cardListListListList);
                        }
                    }
                }
            }
        }


































































































        //I think that should conflict...

























































































        //Did it work yet?
    }
}
