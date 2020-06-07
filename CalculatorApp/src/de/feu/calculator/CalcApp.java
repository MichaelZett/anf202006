package de.feu.calculator;

import java.math.BigDecimal;

public class CalcApp {

	public static void main(String[] args) {
//		Calculator multiplyCalculator = new MultiplyCalculator();
//		Calculator addCalculator = new AddCalculator();
//		Calculator minusCalculator = new MinusCalculator();
//
//		CalculatorUi ui = new CalculatorUi(minusCalculator);
//		ui.on();

		DivideCalculator divideCalculator = new DivideCalculator();
		divideCalculator.add(27.0);
		divideCalculator.add(3.0);
		divideCalculator.add(3.0);

		BigDecimal bigNumber = new BigDecimal("27.00");
		BigDecimal result = bigNumber.divide(new BigDecimal("3.00"));
		System.out.println("BigDecimal: " + result);

//		if (divideCalculator.hasResult()) {
//			System.out.println("Ergebnis: " + divideCalculator.getResult());
//		}
	}

}
