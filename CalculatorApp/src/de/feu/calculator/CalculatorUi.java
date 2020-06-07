package de.feu.calculator;

import java.util.Scanner;

public class CalculatorUi {
	private static final String CALC_OPERATOR = "=";
	private Scanner scanner;
	private Calculator calculator;

	public CalculatorUi(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void on() {
		try {
			reset();
			do {
				System.out.println("Gib eine Zahl ein!");

				int nextZahl = getNumberFromUser();

				this.calculator.add(nextZahl);
				System.out.println("Aktuelle Berechnung: " + this.calculator.getCalculation());
			} while (!this.scanner.hasNext(CALC_OPERATOR));
		} finally {
			this.scanner.close();
		}
	}

	private int getNumberFromUser() {
		while (!this.scanner.hasNextInt()) {
			System.out.println("Das ist keine Zahl!");
			this.scanner.next();
		}
		return this.scanner.nextInt();
	}

	private void reset() {
		this.scanner = new Scanner(System.in);
		this.calculator.reset();
	}

}
