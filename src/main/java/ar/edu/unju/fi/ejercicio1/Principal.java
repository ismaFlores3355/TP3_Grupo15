package ar.edu.unju.fi.ejercicio1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arreglo = new int[5];
		int[] arreglo1 = new int[5];
		
		int i=0;
		
		//primer arreglo
		while(arreglo.length>i) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese 5 numeros para el primer arreglo: ");
		 int num= sc.nextInt();
		arreglo[i]=num;
		i++;
		}
		
		 i=0;
		//segundo arreglo
		while(arreglo.length>i) {
			Scanner sc = new Scanner(System.in);
			 System.out.print("Ingrese 5 numeros para el segundo arreglo: ");
			 int num= sc.nextInt();
			arreglo1[i]=num;
			i++;
			}
		
		for( int k=0; k<arreglo.length; k++) {
		       
			System.out.println("numero: " + arreglo[k]);
			
		}
		
		//llama al metodo pare donde esta la division entre los 2 arreglos
		Principal divi = new Principal();
		divi.pare(arreglo, arreglo1);
		
	}
	
	
	public void pare(int[] arreglo,int[] arreglo1){
		 int resultado=0;
		for( int k=0; k<arreglo.length; k++) {    
			resultado=arreglo[k]/arreglo1[k];
			System.out.println("resultado de division: " + resultado + "\n");
			
		}
		}

}
