package coleccion7;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class MatrizOscuraTest {

	int [][] imagen1= {{0, 0, 50, 50, 100, 100},
			{0, 0, 50, 50, 100, 100},
			{0, 0, 50, 50, 100, 100},
			{150, 150, 150, 200, 200, 200},
			{150, 150, 150, 200, 200, 200},
			{150, 150, 150, 200, 200, 200} };
	
	
	int [][] imagen2= {{0, 0, 50, 50, 100 },
			{0, 0, 50, 50, 100},
			{0, 0, 50, 50, 100},
			{150, 150, 150, 200, 200},
			{150, 150, 150, 200, 200},
			{150, 150, 150, 200, 200} };

	@Test
	@DisplayName("Probando con distintos umbrales y métodos")
	public void testEsImagenOscura1() throws Exception {
		Assertions.assertAll(
				()->assertTrue(MatrizOscura.esOscura(imagen1,200,75)),
				()->assertFalse(MatrizOscura.esOscura(imagen1,200,75.01)),
				()->assertTrue(MatrizOscura.esOscura(imagen1,150,50)),
				()->assertFalse(MatrizOscura.esOscura(imagen1,150,50.01)),
				()->assertTrue(MatrizOscura.esOscura(imagen1,51,100/3)),
				()->assertFalse(MatrizOscura.esOscura(imagen1,50,100/3))
				);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	@DisplayName("Generando excepción para umbral >255")
	public void testEsImagenOscura2_1() {
		System.out.println("Debe rechazarlo porque el umbral es > 255");
		assertTrue(MatrizOscura.esOscura(imagen1,256,50));
	}
		
		@Test (expected = IllegalArgumentException.class)
		@DisplayName("Generando excepción para umbral <0")
		public void testEsImagenOscura2_2() {
			System.out.println("Debe rechazarlo porque el umbral es <0");
			assertTrue(MatrizOscura.esOscura(imagen1,-1,50));
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	@DisplayName("Generando excepción para porcentaje >100")
	public void testEsImagenOscura3_1() {
		System.out.println("Debe rechazarlo porque el porcentaje es > 100");
		assertTrue(MatrizOscura.esOscura(imagen1,256,100.01));
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	@DisplayName("Generando excepción para porcentaje < 0")
	public void testEsImagenOscura3_2() {
		System.out.println("Debe rechazarlo porque el porcentaje es <0");
		assertTrue(MatrizOscura.esOscura(imagen1,256, -0.0001));
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testEsImagenOscura4() {
		System.out.println("Debe rechazarlo porque el array tiene < 36 pixeles");
		assertTrue(MatrizOscura.esOscura(imagen2,150,51));
		
		
	}

}

