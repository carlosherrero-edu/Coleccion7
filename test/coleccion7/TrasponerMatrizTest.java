package coleccion7;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import coleccion7.UtilidadesMatrices;


/**
 * Clase de prueba con JUnit para probar los métodos estáticos de la Colección 6- Ejercicio 6
 * Se espera que estos métodos estén en una clase Utilidades
 * @author Carlos Herrero
 *
 */
public class TrasponerMatrizTest {
	
double[][] matriz1d ={ {1}};
	
	double[][] matriz3d ={ { 1,2,3,4}};
	
	double[][] matriz4d ={ { 1} , { 2} , {3}, {4}};
	
	double [][] matriz5d = { { 1, 2, 3},
							{ 4, 5, 6},
								{ 7, 8, 9}
						};
	
	double [][] matriz6d = { { 1, 4, 7},
							{ 2, 5, 8},
							{ 3, 6, 9}
			};
	
	
	double [][] matrizSimetrica = { {10, 9, 8}, {9, 20, 7}, {8,7, 30 }};
	

	@Test
	@DisplayName("Probamos a trasponer una matriz de 1X1")
	public void testTrasponerMatriz1() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz1d);
		assertArrayEquals(traspuesta, matriz1d);
	}
	
	@Test
	@DisplayName("Probamos a trasponer una matriz de 1X4")
	public void testTrasponerMatriz2() {
		
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz3d);
		assertArrayEquals(traspuesta, matriz4d);
	}
	
	@Test
	@DisplayName("Probamos a trasponer una matriz de 4X1")
	public void testTrasponerMatriz3() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz4d);
		assertArrayEquals(traspuesta, matriz3d);
	}
	
	@Test
	@DisplayName("Probamos a trasponer una matriz de 3X3")
	public void testTrasponerMatriz4() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz5d);
		assertArrayEquals(traspuesta, matriz6d);
	}
	
	@Test
	@DisplayName("Probamos a trasponer una matriz simétrica... debe dar la propia matriz")
	public void testTrasponerMatriz5() {
		
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matrizSimetrica);
		assertArrayEquals(traspuesta,matrizSimetrica);
	}

}
