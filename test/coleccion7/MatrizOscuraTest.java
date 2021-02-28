package coleccion7;

import static org.junit.Assert.*;

import org.junit.Test;

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
	public void testEsImagenOscura1() {
		assertTrue(MatrizOscura.esImagenOscura(imagen1,200,75));
		assertFalse(MatrizOscura.esImagenOscura(imagen1,200,75.01));
		assertTrue(MatrizOscura.esImagenOscura(imagen1,150,50));
		assertFalse(MatrizOscura.esImagenOscura(imagen1,150,50.1));
		assertTrue(MatrizOscura.esImagenOscura(imagen1,51,33.34));
		assertFalse(MatrizOscura.esImagenOscura(imagen1,50,33.34));
		
	}
	
	@Test (expected = RuntimeException.class)
	public void testEsImagenOscura2_1() {
		System.out.println("Debe rechazarlo porque el umbral es > 255");
		assertTrue(MatrizOscura.esImagenOscura(imagen1,256,50));
	}
		
		@Test (expected = RuntimeException.class)
		public void testEsImagenOscura2_2() {
			System.out.println("Debe rechazarlo porque el umbral es <0");
			assertTrue(MatrizOscura.esImagenOscura(imagen1,-1,50));
		
		
	}
	
	@Test (expected = RuntimeException.class)
	public void testEsImagenOscura3_1() {
		System.out.println("Debe rechazarlo porque el porcentaje es > 100");
		assertTrue(MatrizOscura.esImagenOscura(imagen1,256,100.01));
		
		
	}
	
	@Test (expected = RuntimeException.class)
	public void testEsImagenOscura3_2() {
		System.out.println("Debe rechazarlo porque el porcentaje es <0");
		assertTrue(MatrizOscura.esImagenOscura(imagen1,256, -0.0001));
		
		
	}
	
	@Test (expected = RuntimeException.class)
	public void testEsImagenOscura4() {
		System.out.println("Debe rechazarlo porque el array tiene < 36 pixeles");
		assertTrue(MatrizOscura.esImagenOscura(imagen2,150,51));
		
		
	}

}

