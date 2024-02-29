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
		
		// En este llamado se invoca el m�todo toString de la clase Persona.
		// Si el m�todo no existira se imprimir�a la direcci�n de memoria.
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
		
		// Y si cambio los valores de p2, se cambiar�n los de p1?
		p2.setEdad(29);
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		// Y si cambio los valores de p2, se cambiar�n los de p2?
		p1.setEdad(87);
		//System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		System.out.println("==================================");
	}
	
	private void lanzarPrueba3() {
		
		System.out.println("::: Prueba 3");
		
		Persona p1 = new Persona("Larissa", 21);
		Persona p2 = new Persona("Juanita", 27);
		
		p2 = p1;
		
		// Qu� edades se imprimir�n?
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		p1 = new Persona("Valentina", 39);
		// Y ahora? Qu� edades se imprimir�n?
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		p2 = null;
		// Y ahora? Qu� edades se imprimir�n?
		// System.out.println(p1.getEdad() + " ::: " + p2.getEdad());
		
		p2 = p1;
		// Al asignarlos as�, ser�n iguales?
		// System.out.println(p1==p2);
		
		p1 = new Persona("Valentina", 39);
		p2 = new Persona("Valentina", 39);
		
		// Al asignarlos as�, ser�n iguales?
		// System.out.println(p1==p2);
		
		System.out.println("==================================");
	}
	
	// Lanzar prueba enviando par�metros.
	private void lanzarPrueba4() {
		
		System.out.println("::: Prueba 4");
		
		Persona p1 = new Persona("Larissa", 21);
		
		lanzarSubPrueba4_1(45, "Rafaela");
		// Qu� valores se imprimir�n de p1?
		// System.out.println(p1);
		
		lanzarSubPrueba4_2(p1);
		// Qu� valores se imprimir�n de p1?
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
		
		// Finalmente, pongamos a prueba la comparaci�n.
		
		Persona p1 = new Persona("Valentina", 39);
		Persona p2 = new Persona("Valentina", 39);
		
		// Si los comparamos con ==, qu� resultado dar�: Verdadero o Falso?
		// System.out.println(p1==p2);
		
		// Ahora probemos con .equals. Este m�todo se implement� en la clase
		// Persona. Si se quiere usar correctamente, deber� implementarse por el 
		// programador para adaptarlo a lo que necesite comparar.
		// Revisar el m�todo en la clase Persona.
		
		p1 = new Persona("Valentina", 39);
		p2 = new Persona("Valentina", 85);
		
		// Si los comparamos con .equals, qu� resultado dar�: Verdadero o Falso?
		// System.out.println(p1.equals(p2));
		
		System.out.println("==================================");
	}
	
}
