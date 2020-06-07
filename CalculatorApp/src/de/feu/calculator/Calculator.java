package de.feu.calculator;

import java.util.ArrayList;
import java.util.List;

class Calculator {
	private static final String ADD_OPERATOR = "+";
	static int counter = 0;
	private List<Integer> numbers;

	// Parameterlose Konstruktor
	Calculator() {
		super();
		this.numbers = new ArrayList<>();
		counter++;
	}

	boolean hasResult() {
		return !this.numbers.isEmpty();
	}

	void add(int zahl) {
		this.numbers.add(zahl);
	}

	String getCalculation() {
		String berechnung = "";
		for (Integer integer : this.numbers) {
			if (berechnung.length() > 0) {
				berechnung = berechnung + ADD_OPERATOR;
			}
			berechnung = berechnung + integer;
		}
		return berechnung;
	}

	String getResult() {
		return String.valueOf(calculate());
	}

	void reset() {
		this.numbers.clear();
	}

	private int calculate() {
		int result = 0;
		for (Integer integer : this.numbers) {
			result += integer; // identisch zu result = result+integer;
		}
		return result;
	}

//	private int calculateStreams() {
//		return this.numbers.stream().reduce(0, (a, b) -> a + b);
//	}

}
