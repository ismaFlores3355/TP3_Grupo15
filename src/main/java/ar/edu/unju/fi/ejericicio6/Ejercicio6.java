package ar.edu.unju.fi.ejericicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[] = new int[10];
		Scanner entrada = new Scanner(System.in);

		int ban;
		do {
			try {
				ban = 0;
				System.out.println("Llenar el arreglo");
				for (int i = 0; i < arreglo.length; i++) {
					System.out.println("Posicion" + "|" + (i + 1) + "|" + " Digite un numero: ");
					arreglo[i] = entrada.nextInt();
				}
				System.out.println("\nLos numeros ingresados son: ");
				for (int j = 0; j < arreglo.length; j++) {
					System.out.println("|" + arreglo[j] + "|");
				}
				System.out.println("\nLos numeros en orden inverso son: ");
				int j = 9;
				while (j >= 0) {
					System.out.print("|" + arreglo[j] + "|");
					j--;
				}
			} catch (Exception e) {
				System.out.println("El caracter no es valido vuelva a intentarlo ");
				ban = 1;
				entrada.nextLine();
			}

		} while (ban != 0);
	}

}
