package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<Alumno> alumnos = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		int a=0;
		int opcion;
		do {
			Alumno alumno = new Alumno();
			
		System.out.println("------------ ");
		System.out.println("1- Nuevo alumno: ");
		System.out.println("2- Eliminar alumno: ");
		System.out.println("3- Modificar notas alumno: ");
		System.out.println("4- Mostrar todos los alumnos: ");
		System.out.println("5- Mostrar los que superan el promedio de 6: ");
		System.out.println("6- Salir: ");
		System.out.println("------------ ");
		
		System.out.println("Ingrese opcion: ");
		opcion = entrada.nextInt();
		
		switch(opcion) {
		case 1: 
			entrada.nextLine();
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
			
			
			for( int k=0; k<alumno.getNotas().length; k++) {
			       
				System.out.println("notaaa: "+alumno.getNotas()[k]);
				
				
				 }
			
			alumnos.add(alumno);
			
			
			
			
			
		break;
		
		case 2: 
			
			// 2 eliminar un alumno
			System.out.println("Ingrese Libreta Universitaria: ");
			Double luborra = entrada.nextDouble();
				alumnos.removeIf(al -> al.getLU()==luborra);
			
			
			
			
			
			break;
			
		case 3: 
			
			System.out.println("Ingrese Libreta Universitaria valida: ");
			int libreta = entrada.nextInt();
			boolean band=true;
			for(int i=0; i<alumnos.size() && band==true;i++) {
				
				if(alumnos.get(i).getLU()==libreta) {
					
					System.out.println("Ingrese 5 notas nuevas para el alumno: ");
					 
					for( int k=0; k<alumno.getNotas().length; k++) {
						  
						System.out.println("Ingrese nota: ");
						Double notaa = entrada.nextDouble();
						alumno.getNotas()[k]=notaa;
						alumno.setNombre(alumnos.get(i).getNombre());
						alumno.setApellido(alumnos.get(i).getApellido());
						alumno.setLU(libreta);
					     }
				   band=false;
				   alumnos.set(i, alumno);
				 }
				   
				}
			
			 if(band==true) {
				 System.out.println("no existe el alumno con esa LU");
			 }
			
			
			
			break;
			
		case 4: 
			System.out.println("Lista de alumnos: ");
			for(Alumno l:alumnos) {
				System.out.println(l);
			}
			
			break;
			
		case 5: 
			//5
			System.out.println("Alumnos que superan el promedio de 6: ");
			for(int i=0; i<alumnos.size();i++) {
				if(alumnos.get(i).promedio(alumnos.get(i).getNotas())>6) {
		
			       System.out.println(alumnos.get(i).toString());
				}
				
			}	
			break;
			
		case 6: 
			
			break;	
		default:
		 System.out.println("opcion incorrecta");
		}
		
		Thread.sleep(2000);
		
		System.out.println("\n");
		
		}while(opcion!=6);	

	}

}
