package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String cadena = sc.next();
		System.out.println();
		char[] arrayCadena = cadena.toCharArray();
		for (int i = 0; i < cadena.length() / 2; i++) {
			char aux = arrayCadena[i];
			arrayCadena[i] = arrayCadena[arrayCadena.length - 1 - i];
			arrayCadena[arrayCadena.length - 1 - i] = aux;
		}
		for (char c : arrayCadena) {
			System.out.print(" " + c);
		}
	}
}
