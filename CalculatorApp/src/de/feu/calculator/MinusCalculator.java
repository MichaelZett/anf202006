package de.feu.calculator;

import java.util.ArrayList;
import java.util.List;

public class MinusCalculator implements Calculator {

	static int counter = 0;
	private List<Integer> numbers;

	// Parameterlose Konstruktor
	public MinusCalculator() {
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
				berechnung = berechnung + Operator.MINUS.symbol;
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
		if (hasResult()) {
			int result = this.numbers.get(0);
			for (int i = 1; i < this.numbers.size(); i++) {
				result = result - this.numbers.get(i);
			}
			return result;
		} else {
			return 0;
		}
	}
}
