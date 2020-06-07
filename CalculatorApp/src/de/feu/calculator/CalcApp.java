package de.feu.calculator;

public class CalcApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		CalculatorUi ui = new CalculatorUi(calculator);
		ui.on();

		if (calculator.hasResult()) {
			System.out.println("Ergebnis: " + calculator.getResult());
		}
	}

}
