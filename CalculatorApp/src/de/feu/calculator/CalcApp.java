package de.feu.calculator;

public class CalcApp {

	public static void main(String[] args) {
		Calculator multiplyCalculator = new MultiplyCalculator();
		Calculator addCalculator = new AddCalculator();
		CalculatorUi ui = new CalculatorUi(multiplyCalculator);
		CalculatorUi ui2 = new CalculatorUi(addCalculator);
		ui.on();

		if (multiplyCalculator.hasResult()) {
			System.out.println("Ergebnis: " + multiplyCalculator.getResult());
		}
	}

}
