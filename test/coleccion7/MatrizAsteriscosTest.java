package coleccion7;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import coleccion7.UtilidadesMatrices;


/**
 * Clase de prueba con JUnit para probar los métodos estáticos de la Colección 6- Ejercicio 4
 * Se espera que estos métodos estén en una clase Utilidades
 * @author Carlos Herrero
 *
 */
public class MatrizAsteriscosTest {

	final char BLANCO=' ';
	final char ESTRELLA='*';
	
	@Test 
	@DisplayName("Probando con una entrada no válida")
	public void testMatrizAsteriscos1() {
		assertNull(UtilidadesMatrices.obtenerMatrizAsteriscos(-10));
	}
	
	@Test
	@DisplayName("Probando con matriz de 1 fila")
	public void testMatrizAsteriscos2() {
		char[][] resultado= UtilidadesMatrices.obtenerMatrizAsteriscos(1);
		char[][] esperado = { {ESTRELLA}};
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	@DisplayName("Probando con matriz de 3 filas")
	public void testMatrizAsteriscos3() {
		char[][] resultado= UtilidadesMatrices.obtenerMatrizAsteriscos(3);
		char[][] esperado = { {BLANCO, BLANCO, ESTRELLA, BLANCO, BLANCO},
							{BLANCO, ESTRELLA, ESTRELLA, ESTRELLA, BLANCO},
							{ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA}};
		
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	@DisplayName("Probando con matriz de 4 filas")
	public void testMatrizAsteriscos4() {
		char[][] resultado= UtilidadesMatrices.obtenerMatrizAsteriscos(4);
		char[][] esperado = { {BLANCO, BLANCO, BLANCO, ESTRELLA, BLANCO, BLANCO, BLANCO},
				{BLANCO, BLANCO, ESTRELLA, ESTRELLA, ESTRELLA,BLANCO, BLANCO},
				{BLANCO,ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA, BLANCO},
				{ESTRELLA,ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA, ESTRELLA}
				};
		assertArrayEquals(esperado, resultado);
	}

	

}
