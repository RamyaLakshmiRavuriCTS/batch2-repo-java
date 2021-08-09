package com.cts.Question29;

public class Card implements Comparable<Card> {

	private String symbol;
	private int number;

	public Card() {
	}

	public Card(String symbol, int number) {
		this.symbol = symbol;
		this.number = number;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return this.symbol.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Card card = (Card) obj;
		return this.symbol.equals(card.symbol);
	}

	@Override
	public int compareTo(Card obj) {
		return this.symbol.compareTo(obj.symbol);
	}
}
