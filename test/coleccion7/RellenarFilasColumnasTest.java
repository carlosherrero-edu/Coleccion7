package coleccion7;
import static org.junit.Assert.*;


import org.junit.Test;

import coleccion7.UtilidadesMatrices;


/**
 * Clase de prueba con JUnit para probar los métodos estáticos de la Colección 6- Ejercicios 1-2
 * Se espera que estos métodos estén en una clase Utilidades
 * @author Carlos Herrero
 *
 */
public class RellenarFilasColumnasTest {
	
	int[][] matriz1 ={ {1}};
	int[][] matriz2 ={ {1, 0, 0},
						{0, 1, 0},
						{0, 0, 1},
					};
	int[][] matriz3 ={ { 1,2,3,4}};
	
	int[][] matriz4 ={ { 1} , { 2} , {3}, {4}};
	
	int [][] matriz5 = { { 1, 2, 3},
						{ 4, 5, 6},
						{ 7, 8, 9}
						};
	

	int [][] matriz6 = { { 1, 4, 7},
						{ 2, 5, 8},
						{ 3, 6, 9}
						};
	
	
	
	@Test
	public void testRellenarConsecutivosPorFilas1() {
		int[][] matrizPrueba= new int[1][1];
		UtilidadesMatrices.rellenarConsecutivosPorFilas(matrizPrueba);
		assertArrayEquals (matriz1, matrizPrueba);
	}
	
	
	
	@Test
	public void testRellenarConsecutivosPorFilas2() {
		int[][] matrizPrueba= new int[1][4];
		UtilidadesMatrices.rellenarConsecutivosPorFilas(matrizPrueba);
		assertArrayEquals (matriz3, matrizPrueba);
	}
	
	@Test
	public void testRellenarConsecutivosPorFilas3() {
		int[][] matrizPrueba= new int[4][1];
		UtilidadesMatrices.rellenarConsecutivosPorFilas(matrizPrueba);
		assertArrayEquals (matriz4, matrizPrueba);
	}
	
	@Test
	public void testRellenarConsecutivosPorFilas4() {
		int[][] matrizPrueba= new int[3][3];
		UtilidadesMatrices.rellenarConsecutivosPorFilas(matrizPrueba);
		assertArrayEquals (matriz5, matrizPrueba);
	}
	
	@Test
	public void testRellenarConsecutivosPorColumnas1() {
		int[][] matrizPrueba= new int[1][1];
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(matrizPrueba);
		assertArrayEquals (matriz1, matrizPrueba);
	}
	

	
	@Test
	public void testRellenarConsecutivosPorColumnas2() {
		int[][] matrizPrueba= new int[1][4];
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(matrizPrueba);
		assertArrayEquals (matriz3, matrizPrueba);
	}
	
	@Test
	public void testRellenarConsecutivosPorColumnas3() {
		int[][] matrizPrueba= new int[4][1];
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(matrizPrueba);
		assertArrayEquals (matriz4, matrizPrueba);
	}
	
	@Test
	public void testRellenarConsecutivosPorColumnas4() {
		int[][] matrizPrueba= new int[3][3];
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(matrizPrueba);
		assertArrayEquals (matriz6, matrizPrueba);
	}


}
