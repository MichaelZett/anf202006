package de.feu.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	private static final String CALC_OPERATOR = "=";
	static int counter = 0;
	private Scanner scanner;
	private List<Integer> numbers;

	// Parameterlose Konstruktor
	public Calculator() {
		super();
		this.numbers = new ArrayList<>();
		counter++;
	}

	public void on() {
		try {
			reset();
			do {
				System.out.println("Gib eine Zahl ein!");

				int nextZahl = getNumberFromUser();

				this.numbers.add(nextZahl);
			} while (!this.scanner.hasNext(CALC_OPERATOR));
			calcAndShow();
		} finally {
			this.scanner.close();
		}
	}

	private void calcAndShow() {
		int result = calculate();
		System.out.println("Die Summe ist: " + result);
	}

	private void reset() {
		this.scanner = new Scanner(System.in);
		this.numbers.clear();
	}

	private int getNumberFromUser() {
		while (!this.scanner.hasNextInt()) {
			System.out.println("Das ist keine Zahl!");
			this.scanner.next();
		}
		return this.scanner.nextInt();
	}

	private int calculate() {
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
