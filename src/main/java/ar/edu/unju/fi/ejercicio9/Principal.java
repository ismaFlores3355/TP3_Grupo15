package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {
	// InterruptedException para hacer una pausa de 2 segundos para mostrar productos
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		List<Producto> productos = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		int cont=0;
		int opcion;
		do {
			
			
		System.out.println("------------ ");
		System.out.println("1- Nuevo producto: ");
		System.out.println("2- Mostrar todos los productos: ");
		System.out.println("3- Incrementar precio a todos los productos: ");
		System.out.println("4- Monto total de todos los productos: ");
		System.out.println("5- Fin: ");
		System.out.println("------------ ");
		
		System.out.println("Ingrese opcion: ");
		opcion = entrada.nextInt();
		
		switch(opcion){
		
		
		case 1: 
			entrada.nextLine();
			if(cont==0) {
				Producto producto = new Producto(1,"yogur",10,"letche");
			 	productos.add(producto);
			}
			else
			{ if(cont==1) {
				Producto producto = new Producto(1,"carne",20,"rica");
			 	productos.add(producto);
			}
			else {
				if(cont==2) {
					Producto producto = new Producto(1,"maiz",30,"riquisimo");
				 	productos.add(producto);
				}
				else {
					Producto producto = new Producto(1,"jugo",40,"tank");
				 	productos.add(producto);
				}
			}
				
			}
			cont++;
				
		break;
		
		case 2: 
			
			// 2 mostrar
			for(Producto l:productos) {
				System.out.println(l);
				
			}
			
			break;
			
		case 3: 
			
			
			double inc=100.25;
			for(Producto l:productos) {
				System.out.println(l);
				l.setPrecio(l.getPrecio()+inc);
			}
			
				
			break;
			
		case 4: 
			//4
			double monto=0;
			for(Producto l:productos) {
			monto=l.getPrecio()+monto;	
                        }
			
			System.out.println("monto total : "+ monto);
			break;
			
		case 5: 
			break;	
		default:
		 System.out.println("opcion incorrecta");
		}
		
		Thread.sleep(2000);
		
		System.out.println("\n");
		
		}while(opcion!=5);
		
		

	}

}
