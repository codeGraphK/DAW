package pack2;

public class Persona {
	
	public String nombre;
	public String apellido;
	protected int peso;
	private double altura;
	
	public Persona(String nombre, String apellido, int peso, double altura) {
		//constructor
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	protected double calcIMC() {
		
		return peso/Math.pow(altura, 2);
		
	}
	
}
