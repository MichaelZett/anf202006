package de.feu.calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCalculator implements Calculator {
	protected static int counter = 0;
	protected List<Integer> numbers;

	public AbstractCalculator() {
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
	public void reset() {
		this.numbers.clear();
	}

	@Override
	public String getResult() {
		return String.valueOf(calculate());
	}

	@Override
	public String getCalculation() {
		String berechnung = "";
		for (Integer integer : this.numbers) {
			if (berechnung.length() > 0) {
				berechnung = berechnung + getOperator().symbol;
			}
			berechnung = berechnung + integer;
		}
		return berechnung;
	}

	protected abstract Operator getOperator();

	protected abstract int calculate();

}