package manejo;

import clases.Circle;
import clases.Persona;

public class Test2_Moderado {

	public static void main(String[] args) {
		Test2_Moderado test = new Test2_Moderado();
		
		// Desbloquee las invocaciones una a una y vaya revisando los resultados.
		
		// test.lanzarPrueba1();
		// test.lanzarPrueba2();
		// test.lanzarPrueba3();
		// test.lanzarPrueba4();
		// test.lanzarPrueba5();
	}
	
	private void lanzarPrueba1() {
		
		System.out.println("::: Prueba 1");
		
		Persona p1 = new Persona("Marcela", 19);
		
		// En este llamado se invoca el método toString de la clase Persona.
		// Si el método no existira se imprimiría la dirección de memoria.
		System.out.println(p1);
		
		// Haga la prueba con Circle.
		Circle c = new Circle(5);
		System.out.println(c);
		
		System.out.println("==================================");
		
	}
	
	private void lanzarPrueba2() {
		
		System.out.println("::: Prueba 2");
		
		Persona p1 = new Persona("Larissa", 21);
		Persona p2 = new Persona("Larissa", 21);
		
		// p1 y p2 son iguales?
		// System.out.println(p1==p2);
		
		// Que sucede si los igualo?
		p1 = p2; // Ahora son iguales?
		// System.out.println(p1==p2);
		
		// Y si cambio los valores de p2, se cambiarán los de p1?
		p2.setEdad(29);
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		// Y si cambio los valores de p2, se cambiarán los de p2?
		p1.setEdad(87);
		//System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		System.out.println("==================================");
	}
	
	private void lanzarPrueba3() {
		
		System.out.println("::: Prueba 3");
		
		Persona p1 = new Persona("Larissa", 21);
		Persona p2 = new Persona("Juanita", 27);
		
		p2 = p1;
		
		// Qué edades se imprimirán?
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		p1 = new Persona("Valentina", 39);
		// Y ahora? Qué edades se imprimirán?
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		p2 = null;
		// Y ahora? Qué edades se imprimirán?
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		p2 = p1;
		// Al asignarlos así, serán iguales?
		// System.out.println(p1==p2);
		
		p1 = new Persona("Valentina", 39);
		p2 = new Persona("Valentina", 39);
		
		// Al asignarlos así, serán iguales?
		// System.out.println(p1==p2);
		
		System.out.println("==================================");
	}
	
	// Lanzar prueba enviando parámetros.
	private void lanzarPrueba4() {
		
		System.out.println("::: Prueba 4");
		
		Persona p1 = new Persona("Larissa", 21);
		
		lanzarSubPrueba4_1(45, "Rafaela");
		// Qué valores se imprimirán de p1?
		// System.out.println(p1);
		
		lanzarSubPrueba4_2(p1);
		// Qué valores se imprimirán de p1?
		// System.out.println(p1);		
		
		System.out.println("==================================");
		
	}
	
	private void lanzarSubPrueba4_1(int edad, String nombre) {
		Persona p1 = new Persona(nombre, edad);
	}
	
	private void lanzarSubPrueba4_2(Persona p1) {
		p1.setEdad(45);
		p1.setNombre("Rafaela");
	}
	
	private void lanzarPrueba5() {
		
		System.out.println("::: Prueba 5");
		
		// Finalmente, pongamos a prueba la comparación.
		
		Persona p1 = new Persona("Valentina", 39);
		Persona p2 = new Persona("Valentina", 39);
		
		// Si los comparamos con ==, qué resultado dará: Verdadero o Falso?
		// System.out.println(p1==p2);
		
		// Ahora probemos con .equals. Este método se implementó en la clase
		// Persona. Si se quiere usar correctamente, deberá implementarse por el 
		// programador para adaptarlo a lo que necesite comparar.
		// Revisar el método en la clase Persona.
		
		p1 = new Persona("Valentina", 39);
		p2 = new Persona("Valentina", 85);
		
		// Si los comparamos con .equals, qué resultado dará: Verdadero o Falso?
		// System.out.println(p1.equals(p2));
		
		System.out.println("==================================");
	}
	
}
