package manejo;

import clases.Circle;

public class Test1_Basico {

	public static void main(String[] args) {
		
		Test1_Basico t = new Test1_Basico();
		
		// Desbloquee las invocaciones una a una y vaya revisando los resultados.
		
//		t.lanzarPrueba1();
//		t.lanzarPrueba2();
//		t.lanzarPrueba3();
//		t.lanzarPrueba4();
//		t.lanzarPrueba5();
		
	}
	
	private void lanzarPrueba1() {
		
		System.out.println("::: Prueba 1");
		
		String texto1 = "Este es mi texto";
		String texto2 = "Este es mi texto";
		
		System.out.println(texto1==texto2);
		// Qué resultado arrojó la comparación?
		// Entiende por qué sucedió?
		// Cómo podría cambiarlo para que compare correctamente?
		
		System.out.println("==================================");
	}
	
	private void lanzarPrueba2() {
		
		System.out.println("::: Prueba 2");
		
		String texto1 = "Este es mi texto";
		int valor = 45;
		
		lanzarSubPrueba2_1(texto1, valor);
		
		System.out.println(texto1 + " ::: " + valor);
		// Los valores cambiaron? Por qué?
		
		System.out.println("==================================");
	
	}
	
	private void lanzarSubPrueba2_1(String texto1, int valor) {
		texto1 = "Ahora es otro texto";
		valor = 95;
	}
	
	private void lanzarPrueba3() {
		
		System.out.println("::: Prueba 3");
		
		
		Circle c1; // Es lo mismo que hacer c1 = null;
		Circle c2 = new Circle(8);
		
		// Esta linea genera error. Por qué? y cómo corregirlo?
		// System.out.println(c1==c2);
		
		System.out.println("==================================");
	}
	
	private void lanzarPrueba4() {
		
		System.out.println("::: Prueba 4");
		
		
		Circle c1 = new Circle(5); 
		Circle c2 = new Circle(8);
		
		// Analice la siguiente salida. Tenga presente los valores impresos.
		System.out.println(c1.getRadius() + " ::: " + c2.getRadius());
		
		c1.setRadius(9);
		
		// Algo cambió? Qué cambió y por qué?
		System.out.println(c1.getRadius() + " ::: " + c2.getRadius());
		
		c1 = c2;
		
		// Qué pasó en este escenario? Hubo cambios? Explique el comportamiento.
		System.out.println(c1.getRadius() + " ::: " + c2.getRadius());
		
		c1.setRadius(15);
		
		// Qué sucedió acá?
		System.out.println(c1.getRadius() + " ::: " + c2.getRadius());
		
		c2 = new Circle(2);
		
		// Analice y sugiera cuál sería la salida de la siguiente impresión. Se afecta c1?
		// System.out.println(c1.getRadius() + " ::: " + c2.getRadius());
		
		c2.setRadius(63);
		// Analice y sugiera cuál sería la salida de la siguiente impresión. Se afecta c1?
		// System.out.println(c1.getRadius() + " ::: " + c2.getRadius());
		
		System.out.println("==================================");
		
	}
	
	private void lanzarPrueba5() {
		
		System.out.println("::: Prueba 5");
		
		
		Circle c1 = new Circle(5); 
		Circle c2 = new Circle(5);
		
		// Sugiera la salida de la siguiente impresión por consola. Falso o Verdadero?
		// Comprenda las razones del resultado.
		// System.out.println(c1==c2);
		
		c1 = c2;
		
		// Sugiera la salida de la siguiente impresión por consola. Falso o Verdadero?
		// Comprenda las razones del resultado.
		// System.out.println(c1==c2);
		
		// Hubo cambios o se mantuvo? Por qué?
	}
	
}
