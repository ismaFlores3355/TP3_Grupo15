package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ListaFrutas = new ArrayList<String>();

		char option;
		do {
			System.out.println("Ingrese nombre de fruta: ");
			String frutas = entrada.next();
			ListaFrutas.add(frutas);

			System.out.println("¿Desea ingresar mas datos? (S/N) ");
			option = entrada.next().charAt(0);

		} while (option == 's' || option == 'S');

		for (int i = 0; i < ListaFrutas.size(); i++) {
			if (i % 2 == 0) {
				System.out.println("indice " + i + ": " + ListaFrutas.get(i));
			}
		}

		int indice;
		System.out.println("Ingrese un numero un numero positivo: ");
		int number = entrada.nextInt();
		if ((number > 0) && (number <= ListaFrutas.size())) {
			ListaFrutas.remove(number);
		} else {
			System.out.println("El numero no es positivo o no esta en la lista");
		}

		// listaActualizada
		for (String e : ListaFrutas) {
			System.out.print(e);
		}
	}

}
