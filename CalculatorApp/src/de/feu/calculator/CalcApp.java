package de.feu.calculator;

public class CalcApp {

	public static void main(String[] args) {
		Calculator multiplyCalculator = new MultiplyCalculator();
		Calculator addCalculator = new AddCalculator();
		Calculator minusCalculator = new MinusCalculator();

		CalculatorUi ui = new CalculatorUi(minusCalculator);
		ui.on();

		if (minusCalculator.hasResult()) {
			System.out.println("Ergebnis: " + minusCalculator.getResult());
		}
	}

}
