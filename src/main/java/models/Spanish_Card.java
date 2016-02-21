package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Jason Ye on 2/19/2016.
 */
public class Spanish_Card extends Game implements Serializable{
    public final int value;
    public final Suit suit;

    @JsonCreator
    public Spanish_Card(@JsonProperty("value") int value, @JsonProperty("suit") Suit suitt){
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit(){ return suit; }

    public int getValue() { return value;}

    public String toString() { return this.value + this.suit.toString();}


}
