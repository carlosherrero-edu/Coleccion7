package coleccion7;

import static org.junit.Assert.*;

import org.junit.Test;

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
	
	double [][] matriz7d = { { 1, 2, 3, 4},
							{ 5, 6, 7, 8}
							};
	
	double [][] matriz8d = { { 1, 5}, { 2,6} , {3, 7} ,   {4,8}};
	

	@Test
	public void testTrasponerMatriz1() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz1d);
		assertArrayEquals(traspuesta, matriz1d);
	}
	
	@Test
	public void testTrasponerMatriz2() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz3d);
		assertArrayEquals(traspuesta, matriz4d);
	}
	
	@Test
	public void testTrasponerMatriz3() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz4d);
		assertArrayEquals(traspuesta, matriz3d);
	}
	
	@Test
	public void testTrasponerMatriz4() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz5d);
		assertArrayEquals(traspuesta, matriz6d);
	}
	
	@Test
	public void testTrasponerMatriz5() {
		double[][] traspuesta = UtilidadesMatrices.trasponerMatriz(matriz7d);
		assertArrayEquals(traspuesta, matriz8d);
	}

}
