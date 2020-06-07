package de.feu.calculator;

public class CalcApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Calculator calc2 = new Calculator();

		calculator.on();
		System.out.println("Anzahl an Calculators: " + Calculator.counter);
	}

}
