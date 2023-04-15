package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	public int defaultInt;

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

//
//4. Examinar las expresiones

//Dado el siguiente código:
//String a = "abc";
//String s = a;
//String t;

//Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:
//● s.length(); ---> 3
//● t.length(); ---> 3
//● 1 + a; ---> "1abc"
//● a.toUpperCase(); ---> "ABC"
//● "Libertad".indexOf("r"); ---> 4
//● "Universidad".lastIndexOf('i'); ---> 7
//● "Quilmes".substring(2,4); ---> "ilm"
//● (a.length() + a).startsWith("a"); ---> False (la primer parte de la expresión devuelve "3abc", que evidentemente no empieza on "a")
//● s == a; ---> True
//● a.substring(1,3).equals("bc") ---> True


//5. Tipos primitivos

//Teniendo en cuenta la documentación oficial de Java:
//1. ¿Qué son los tipos de datos primitivos?
// Es un tipo de dato que ya viene predefinido con el lenguaje.
//
//2. ¿Cuál es la diferencia entre un int y un Integer?
//En primer lugar int es un tipo de dato primitivo e Integer es una clase. 
// Además, un objeto Integer ocupa 16 bytes de memoria, por lo que es mas lento que  un int que solo ocupa 4 bytes.
//
//3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se
//define una de tipo Integer? Haga la prueba en Eclipse.
// El valor predeterminado de un int es 0 y el de un Integer
//
//4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
//instancia se define una variable de método.
//
