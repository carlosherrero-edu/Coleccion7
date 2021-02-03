package coleccion7;
import static org.junit.Assert.*;

import org.junit.Test;

import coleccion7.UtilidadesMatrices;


/**
 * Clase de prueba con JUnit para probar los métodos estáticos de la Colección 6- Ejercicio3
 * Se espera que estos métodos estén en una clase Utilidades
 * @author Carlos Herrero
 *
 */
public class MatrizIdentidadTest {
	
	int[][] matriz1 ={ {1}};
	int[][] matriz2 ={ {1, 0, 0},
						{0, 1, 0},
						{0, 0, 1},
					};
	
	@Test ()
	public void testMatrizIdentidad0() {
		
		assertNull(UtilidadesMatrices.obtenerMatrizIdentidad(-1));
	}
	
	@Test ()
	public void testMatrizIdentidad1() {
		int [][] devuelto = UtilidadesMatrices.obtenerMatrizIdentidad(1);
		assertArrayEquals(matriz1, devuelto);
	}
	
	@Test ()
	public void testMatrizIdentidad2() {
		int [][] devuelto = UtilidadesMatrices.obtenerMatrizIdentidad(3);
		assertArrayEquals(matriz2, devuelto);
	}

}
