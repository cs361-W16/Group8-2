package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Jason Ye on 2/19/2016.
 */
public class Spanish_Card extends Game implements Serializable{
    public final int value;
    public final Spanish_Suit SpanSuit;

    @JsonCreator
    public Spanish_Card(@JsonProperty("value") int value, @JsonProperty("SpanSuit") Spanish_Suit SpanSuit){
        this.value = value;
        this.SpanSuit = SpanSuit;
    }

    public Spanish_Suit getSuit(){ return SpanSuit; }

    public int getValue() { return value;}

    public String toString() { return this.value + this.SpanSuit.toString();}


}
