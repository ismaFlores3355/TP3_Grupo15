package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String continuar ="";
		  int[] mult= {0,1,2,3,4,5,6,7,8,9,10};
		  Scanner scanner=new Scanner(System.in);
		  
		  System.out.println("----TABLA DE MULTIPLICAR----");
		  
		  do{
			  System.out.println("INGRESE UN NUMERO ENTRE [1,9]");
			  int numero=scanner.nextInt();
			  
			  if(numero>=1 & numero<=9) {
				  
			  System.out.println("Tabla de Multiplicar del:"+ numero);
			  for(int i=0; i<mult.length ;i++) { 
				  mult[i]=numero*i;
				  System.out.println(numero+"x"+i+"="+mult[i]);
				  
			  }
		   }else {
			  System.out.println("El numero ingresado esta fuera del rango [1,9]");
		  }
			  System.out.println("Decea ingresar otro numero(s/n)");
			   scanner.nextLine();
			   continuar=scanner.nextLine();
			  
		  }while(continuar. equals("s")); 
		  System.out.println("-----Fin del Programa-----");
	}

}
