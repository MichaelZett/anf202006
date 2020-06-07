package de.feu.calculator;

public interface Calculator {

	boolean hasResult();

	void add(int zahl);

	String getCalculation();

	String getResult();

	void reset();

}