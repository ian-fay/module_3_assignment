package edu.wctc;

public enum Suits {
    SPADES("of spades"),
    DIAMONDS("of diamond"),
    CLUBS("of clubss"),
    HEARTS("of hearts");

    private String value;
    Suits(String spade) {
    }

    public String getValue() {
        return value;
    }
}