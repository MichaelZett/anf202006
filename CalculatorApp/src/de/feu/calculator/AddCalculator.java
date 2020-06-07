package de.feu.calculator;

import java.util.ArrayList;
import java.util.List;

public class AddCalculator implements Calculator {
	static int counter = 0;
	private List<Integer> numbers;

	// Parameterlose Konstruktor
	public AddCalculator() {
		super();
		this.numbers = new ArrayList<>();
		counter++;
	}

	@Override
	public boolean hasResult() {
		return !this.numbers.isEmpty();
	}

	@Override
	public void add(int zahl) {
		this.numbers.add(zahl);
	}

	@Override
	public String getCalculation() {
		String berechnung = "";
		for (Integer integer : this.numbers) {
			if (berechnung.length() > 0) {
				berechnung = berechnung + Operator.ADD.symbol;
			}
			berechnung = berechnung + integer;
		}
		return berechnung;
	}

	@Override
	public String getResult() {
		return String.valueOf(calculate());
	}

	@Override
	public void reset() {
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
