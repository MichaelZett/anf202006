package de.feu.calculator;

public class AddCalculator extends AbstractCalculator {
	// Parameterlose Konstruktor
	public AddCalculator() {
		super();
	}

	@Override
	protected Operator getOperator() {
		return Operator.ADD;
	}

	@Override
	protected int calculate() {
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
