package de.feu.calculator;

import java.util.ArrayList;
import java.util.List;

public class DivideCalculator {
	private List<Double> numbers = new ArrayList<>();

	public boolean hasResult() {
		return !this.numbers.isEmpty();
	}

	public void add(double zahl) {
		this.numbers.add(zahl);
	}

	public String getResult() {
		if (hasResult()) {
			double result = this.numbers.get(0);
			for (int i = 1; i < this.numbers.size(); i++) {
				result = result / this.numbers.get(i);
			}
			return String.valueOf(result);
		} else {
			return String.valueOf(0.0);
		}
	}

}
