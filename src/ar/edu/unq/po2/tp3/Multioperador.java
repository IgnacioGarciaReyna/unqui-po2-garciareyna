package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
//	Programe la clase Multioperador, que permite aplicar las operaciones de suma, resta y multiplicación
//	sobre ArrayLists de enteros. Es decir, poder sumar todos los números que contiene, poder restar todos los
//	números que contiene y poder multiplicar a todos los números que contiene entré si.

	public Integer Sumar(ArrayList<Integer> enteros) {
		Integer suma = 0;

		for (int i = 0; i < enteros.size(); i++) {
			suma += enteros.get(i);
		}

		return suma;
	}

	public Integer Restar(ArrayList<Integer> enteros) {
		Integer resta = 0;

		for (int i = 0; i < enteros.size(); i++) {
			if (i == 0) {
				resta += enteros.get(i);
			} else {
				resta -= enteros.get(i);
			}
		}

		return resta;
	}

	public Integer Multiplicar(ArrayList<Integer> enteros) {
		Integer producto = 0;

		for (int i = 0; i < enteros.size(); i++) {
			if (i == 0) {
				producto += enteros.get(i);
			} else {
				producto *= enteros.get(i);
			}
		}

		return producto;
	}

}
