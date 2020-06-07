package de.feu.calculator;

public enum Operator {
	ADD("+"), CALC("="), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

	public final String symbol;

	private Operator(String symbol) {
		this.symbol = symbol;
	}

}
