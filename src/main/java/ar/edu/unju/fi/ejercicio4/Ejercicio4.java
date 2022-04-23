package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int arreglo [] = new int [8];
		
		System.out.println("Ingrese ocho numeros enteros");
		
		for(int i=0; i<8; i++) {
			arreglo[i] = entrada.nextInt();
		}
			
		for(int i=0 ; i<8;i++) {
			if(arreglo[i]%2 == 0) {
				System.out.println(arreglo[i] + " par");
			}else {
				System.out.println(arreglo[i] + " impar");
			}
		}
		
	}

}
