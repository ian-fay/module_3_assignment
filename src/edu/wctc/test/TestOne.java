package edu.wctc.test;

import edu.wctc.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TestOne {
    @Test
    public void testCard() {
        Card card = new Card(Faces.ACE, Suits.CLUBS);
        assertEquals("The card has the wrong value!", 1, card.getCardValue());
    }

    @Test
    public void testDeck() {
        Deck deck = new Deck();
        assertEquals("The Deck is the wrong size.",52, deck.getSize());
    }

    @Test
    public void testIsRoyalFlush() {
        //Deck deck = new Deck();
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card (Faces.JACK, Suits.CLUBS));
        hand.add(new Card (Faces.QUEEN, Suits.CLUBS));
        hand.add(new Card (Faces.KING, Suits.CLUBS));
        hand.add(new Card (Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isRoyalFlush(theHand));

    }

    @Test
    public void testIsFlush() {
        //Deck deck = new Deck();
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.FOUR, Suits.CLUBS));
        hand.add(new Card (Faces.FIVE, Suits.CLUBS));
        hand.add(new Card (Faces.SIX, Suits.CLUBS));
        hand.add(new Card (Faces.SEVEN, Suits.CLUBS));
        hand.add(new Card (Faces.EIGHT, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isFlush(theHand));

    }
}
