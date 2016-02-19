package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Brandon on 2/18/2016.
 */

public class Eng_Card extends Game implements Serializable {
    public final int value;
    public final Eng_Suit suit;

    @JsonCreator
    public Eng_Card(@JsonProperty("value") int value, @JsonProperty("suit") Eng_Suit suit) {
        this.value = value;
        this.suit = suit;

    }

    public Eng_Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return this.value + this.suit.toString();
    }
}