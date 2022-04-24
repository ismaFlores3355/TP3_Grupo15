package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;
//a
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Alumno alumno = new Alumno();
      
      
      
      
		
      Scanner entrada = new Scanner(System.in);
		 //agrega datos de un alumno 
      
		System.out.println("Ingrese nombre del alumno: ");
		String Nombre = entrada.nextLine();
		alumno.setNombre(Nombre);
		
		System.out.println("Ingrese apellido del alumno: ");
		String Apellido = entrada.nextLine();
		alumno.setApellido(Apellido);
		
		System.out.println("Libreta Universitaria: ");
		int legajo = entrada.nextInt();
		alumno.setLU(legajo);
		
		System.out.println("Ingrese 5 notas para el alumno: ");
		 
		for( int k=0; k<alumno.getNotas().length; k++) {
			  
			System.out.println("Ingrese nota: ");
			Double notaa = entrada.nextDouble();
			alumno.getNotas()[k]=notaa;
			
			 }
		
		//muestra notas
		for( int k=0; k<alumno.getNotas().length; k++) {
		       
			System.out.println("notaaa: "+alumno.getNotas()[k]);
			
			
			 }
		
		//muestra los datos del alumno
		System.out.println("Nombre : " + alumno.getNombre());
		System.out.println("Apellido: " + alumno.getApellido());
		System.out.println("Libreta Universitaria: " + alumno.getLU());
		System.out.println("Notas: ");
		for( int k=0; k<alumno.getNotas().length; k++) {
		       
			System.out.println(alumno.getNotas()[k]);
			
			
			 }
		
		//muestra los metodos promedio, y nota maxima
		System.out.println("Promedio : " + alumno.promedio(alumno.getNotas()));
		System.out.println("Nota Maxima : " + alumno.notamax(alumno.getNotas()));
	}

}
