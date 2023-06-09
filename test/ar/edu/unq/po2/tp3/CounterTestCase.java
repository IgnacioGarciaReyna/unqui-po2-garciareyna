package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;

	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	/**
	 * Verifica la cantidad de impares
	 */
	@Test
	public void testOddNumbers() {
// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	/**
	 * Verifica la cantidad de múltiplos de un número
	 */
	@Test
	public void testMultiplesOfOcurrences() {
// Getting the multiples occurrences
		int amount = counter.getMultiplesOfOcurrences(3);
// I check the amount is the expected one
		assertEquals(amount, 2);
	}
	
	
	/**
	 * Verifica la cantidad de múltiplos de un número
	 */
	@Test
	
	public void testMostEvenDigits() {
		ArrayList<Integer> numbersDigits = new ArrayList<Integer>(Arrays.asList(11,1242,22334455,1111,22446688,1,231)) ;
// Getting the multiples occurrences
		int mostEvenDigits = counter.getMostEvenDigits(numbersDigits);
// I check the amount is the expected one
		assertEquals(mostEvenDigits, 22446688);
	}
	
	/**
	 * Verifica el múltiplo simultaneo menor a 1000 y mayor a 0 entre x e y
	 */
	@Test
	
	public void testSimultaneousMultipleLessThan1000() {
// Getting the multiples occurrences
		int simultaneousMultiple = counter.simultaneousMultipleLessThan1000(-2,99);
// I check the amount is the expected one
		assertEquals(simultaneousMultiple, 396);
	}
}