package de.feu.calculator;

public class MultiplyCalculator extends AbstractCalculator {
	// Parameterlose Konstruktor
	MultiplyCalculator() {
		super();
	}

	@Override
	protected int calculate() {
		int result = 1;
		for (Integer integer : this.numbers) {
			result *= integer;
		}
		return result;
	}

	@Override
	protected Operator getOperator() {
		return Operator.MULTIPLY;
	}
}
