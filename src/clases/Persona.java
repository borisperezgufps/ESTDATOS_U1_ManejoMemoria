package clases;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona() {	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Este m�todo se encarga de imprimir los valores de la clase en la forma 
	 * que se describa. En este caso, se imprime el nombre, luego los ::: y 
	 * finaliza con la edad. Se puede crear cualquier formato deseado, por ejemplo
	 * imprimir primero la edad, o imprimir el nombre y en par�ntesis la edad.
	 */
	@Override
	public String toString() {
		return nombre + " ::: " + edad;
	}
	
	/**
	 * Este m�todo se encarga de comparar los atributos que el programador quiera.
	 * Puede validar la comparaci�n de todos los atributos, o solo de algunos de inter�s.
	 * Debe entenderse que la idea es comparar un objeto de esta clase Persona, contra
	 * el objeto de tipo Persona que se estar� recibiendo como par�metro.
	 * Ejemplo:
	 * 		Persona p1 = new Persona();
	 * 		Persona abc = new Persona();
	 * 		p1.equals(abc);
	 * Entonces se compara a p1 con la informaci�n del objeto abc que se pasa como par�metro.
	 */
	@Override
	public boolean equals(Object obj) {
		// Lo primero es convertir el par�metro Object al tipo de esta clase
		Persona perObj = (Persona) obj;
		
		// Luego se pueden comparar los atributos.
		// Para este caso, se usar� como ejemplo una situaci�n en la cual
		// solo importa comparar los nombres de las personas.
		if(this.getNombre().equals(perObj.getNombre()))
			return true;
		
		// Si se quisiera comparar tambi�n la edad, se deber�a ampliar la condici�n con un &&.
		// if(this.getNombre().equals(perObj.getNombre()) && this.getEdad()==perObj.getEdad())
			
		
		return false;
	}
}
