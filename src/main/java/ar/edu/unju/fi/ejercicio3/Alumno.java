package ar.edu.unju.fi.ejercicio3;

//ee
public class Alumno {
	private String nombre;
	private String apellido;
	private int LU;
	private double[] notas = new double [5];
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLU() {
		return LU;
	}
	public void setLU(int lU) {
		LU = lU;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	//metodo para calcular promedio
	
	public int promedio(double[]notas) {
		 int prome=0;
		 double cont=0;
		 for( int k=0; k<notas.length; k++) {
		       
			   cont=cont+notas[k];
			 }
		 prome=(int) (cont/notas.length);
		 
		 
		 
		return prome;
	}
	//metodo para obtener la nota maxima 
		
	public double notamax(double[]notas) {
		double num=0;
		for( int k=0; k<notas.length; k++) {
		        if(notas[k]>num)
			   num=notas[k];
			 }
		return num;
		
		
	}
	
	
	
	
	
}
