package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	ArrayList<Integer> numbers = new ArrayList<Integer>();

	public void testEvenNumbers() {

	}

	public void addNumber(Integer n) {
		numbers.add(n);
	}

	private Boolean isMultipleOf(int n1, int n2) {
		return n1 % n2 == 0;
	}

	private Boolean isEven(int number) {
		return isMultipleOf(number, 2);
	}

	public Integer getEvenOcurrences() {
		int evenOcurrences = 0;

		for (int number : numbers) {
			if (isEven(number)) {
				evenOcurrences++;
			}
		}

		return evenOcurrences;
	}

	public Integer getOddOcurrences() {
		int oddOcurrences = 0;

		for (int number : numbers) {
			if (!isEven(number)) {
				oddOcurrences++;
			}
		}

		return oddOcurrences;
	}

	public Integer getMultiplesOfOcurrences(int number1) {
		int multiplesOcurrences = 0;

		for (int number2 : numbers) {
			if (isMultipleOf(number2, number1)) {
				multiplesOcurrences++;
			}
		}

		return multiplesOcurrences;
	}

	private Integer evenDigitsOf(int n) {
		int number = n;
		int divisor = 10;
		int evenDigits = 0;

		while (number >= divisor) {
			if (isEven(number % divisor)) {
				evenDigits++;
				number = number - (number % divisor);
				divisor *= 10;
			} else {
				number = number - (number % divisor);
				divisor *= 10;
			}
		}

		return evenDigits;
	}

	private Boolean haveMoreEvenDigitsThan(int n1, int n2) {
		return evenDigitsOf(n1) > evenDigitsOf(n2);
	}

	public Integer getMostEvenDigits(ArrayList<Integer> numbersDigits) {
		int mostEvenDigits = 0;
		for (int numberDigits : numbersDigits) {
			if (haveMoreEvenDigitsThan(numberDigits, mostEvenDigits)) {
				mostEvenDigits = numberDigits;
			}
		}
		return mostEvenDigits;
	}

	// Realice una función que reciba dos valores X e Y, y devuelva el número más
	// alto entre 0 y 1000, que sea
	// múltiplo simultáneamente de X e Y. Si no existe, devolver -1. Por ejemplo si
	// se ingresa 3 y 9, la función debe
	// devolver 999.

	public Boolean isSimultaneousMultiple(int multiple, int x, int y) {
		return multiple % x == 0 && multiple % y == 0;
	}

	public Integer simultaneousMultipleLessThan1000(int x, int y) {
		int simultaneousMultiple = 999;

		while (!isSimultaneousMultiple(simultaneousMultiple, x, y) || simultaneousMultiple == 0) {
			simultaneousMultiple--;
		}
		if (simultaneousMultiple == 0) {
			return -1;
		} else {
			return simultaneousMultiple;
		}
	}
}
