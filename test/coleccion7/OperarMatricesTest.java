package coleccion7;
import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import coleccion7.UtilidadesMatrices;


/**
 * Clase de prueba con JUnit para probar los métodos estáticos de la Colección 6- Ejercicios de suma
 * Se espera que estos métodos estén en una clase Utilidades
 * @author Carlos Herrero
 *
 */
public class OperarMatricesTest {
	

	

	
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
	
	
	
	@Test ( )
	@DisplayName("Suma de 2 matrices de diferente dimensión")
	public void sumarMatricesTest1(){
	
		assertNull(UtilidadesMatrices.sumarMatrices(matriz5d, matriz7d));
	}
	
	@Test
	@DisplayName("Suma de 2 matrices de dimensión 1X1")
	public void sumarMatricesTest2(){
		double[][] A = { {1}};
		double[][] B = { {2}};
		double[][] suma = { {3}};
		assertArrayEquals (suma, UtilidadesMatrices.sumarMatrices(A, B));
	}
	
	@Test@DisplayName("Suma de 2 matrices de dimensión 3X3")
	public void sumarMatricesTest3(){
		
		double[][] suma = { {2, 6, 10} , {6, 10, 14}, {10, 14, 18}};
		assertArrayEquals (suma, UtilidadesMatrices.sumarMatrices(matriz5d, matriz6d));
	}
	


}
