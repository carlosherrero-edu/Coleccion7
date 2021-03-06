package coleccion7;

import java.util.Arrays;

public class UtilidadesMatrices {

	/*
	 * Método que asigna el valor entero 1 en la posición 0.0 de un array de 2D que
	 * se pasa por parámetro. Asismismo, va incrementando el valor en "1" de
	 * izquierda a derecha y de arriba a abajo (primero filas y luego columnas)
	 */

	static void rellenarConsecutivosPorFilas(int[][] matrizEnteros) {

		/**
		 * @param incremento Esta variable es necesaria puesto que el valor de los
		 *                   índices del array (1) no se corresponde con el del
		 *                   incremento de valores deseado.
		 */
		int incremento = 1;

		// System.out.println("La matriz queda configurada así:" + "\n");

		for (int i = 0; i < matrizEnteros.length; i++) {

			// System.out.println("");

			for (int k = 0; k < matrizEnteros[i].length; k++) {

				matrizEnteros[i][k] = incremento;

				// System.out.print(matrizEnteros[i][k] + " ");

				incremento += 1;

			}

		}
	}

	/**
	 * Método que rellena un array de dos dimensiones de enteros asign�ndole enteros
	 * consecutivos, comenzando en la unidad. El relleno se hace por columnas, es
	 * decir, se rellena primero la columna 1, despu�s la columna 2,... etc...
	 * 
	 * @param tabla: referencia a un array de enteros de 2 dimensiones Corresponde a
	 *               Colección 7, Ejercicio 2
	 */
	public static void rellenarConsecutivosPorColumnas(int[][] matrizEnteros) {

		// creamos un contador para ir rellenando las celdas de la matriz en este caso
		// lo inicializamos a 1
		int contador = 1;

		// creamos antes del bucle la variable que contará las filas
		int i = 0;

		for (int j = 0; j < matrizEnteros[0].length; j++) {
			for (i = 0; i < matrizEnteros.length; i++) {
				matrizEnteros[i][j] = contador++;
			}

		}

	}

	/**
	 * M�todo que construye la matriz cuadrada identidad de una dimensión dada por
	 * parámetro
	 * 
	 * @param dimension entero con la dimensi�n de la matriz
	 * @return referencia a un array de dos dimensiones con la matriz identidad
	 *         Corresponde a Colección 7, Ejercicio 3
	 */
	public static int[][] obtenerMatrizIdentidad(int dimension) {

		int[][] matrizIdentidad;
		int filas, columnas;
		filas = dimension;
		columnas = dimension;
		matrizIdentidad = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {
				if (i == j) {
					matrizIdentidad[i][j] = 1;
				} else {
					matrizIdentidad[i][j] = 0;
				}
			}

		}

		return dimension > 0 ? matrizIdentidad : null;
	}

	// Ejercicio4
	/**
	 * Solución para el ejercicio 4 para rellenar una matriz con asteriscos LA fila
	 * inferior estará completa con asteriscos Cada fila tiene 2 asteriscos menos
	 * que la inmediata inferior, en posición centrada La fila superior tendrá sólo
	 * 1 asterisco centrado
	 * 
	 * @param filas entero con el número de filas que queremos imprimir
	 * @return una matriz de carateres con asteriscos y blancos Corresponde a
	 *         Colección 7, Ejercicio 4
	 * @author Alberto del Pozo
	 * @see MatrizAsteriscosTest
	 */
	

	public static char[][] obtenerMatrizAsteriscos(int filas) {

		int columnas = 2 * filas - 1;

		boolean validarFilas = false;

		if (filas > 0) {
			validarFilas = true;
		} else {
			System.out.println("El número de filas que debe introducir debe ser impar");
			return null;
		}

		char matriz[][] = new char[filas][columnas];

		int mitad = matriz[0].length / 2;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if ((i + j) >= mitad && (j - i) <= mitad) {
					matriz[i][j] = '*';
				} else {
					matriz[i][j] = ' ';
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		return matriz;
	}

	/**
	 * Método para sumar 2 matrices de números decimales
	 * 
	 * @param primera : primera matriz
	 * @param segunda : segunda matriz
	 * @return: referencia a la matriz uma de las dos devuelve null si las 2
	 *          matrices no tienen igual dimensión Corresponde a Colección 7,
	 * @author Irene Cárdenas
	 * @throws Exception 
	 */
	public static double[][] sumarMatrices(double[][] primera, double[][] segunda)  {
		double[][] matrizResultado;
		int filasA = primera.length;
		int columnasA = primera[0].length;

		int filasB = segunda.length;
		int columnasB = segunda[0].length;



		if (filasA == filasB && columnasB == columnasA) {

			matrizResultado = new double[filasA][columnasA];
			for (int i = 0; i < filasA; i++) {
				for (int j = 0; j < columnasA; j++) {
					matrizResultado[i][j] = primera[i][j] + segunda[i][j];
				}
			}

		} else {
			throw new RuntimeException("Las matrices deben tener la misma cantidad de filas que columnas");
		
		}
		return matrizResultado;
	}

	/**
	 * Método para obtener la matriz traspuesta de una dada La matriz traspuesta se
	 * obtiene intercambiando filas por columnas
	 * 
	 * @param original matriz -bidimensional- de números decimales
	 * @return matriz bidimensional traspuesta, con sus dimensiones cambiadas
	 *         Corresponde a Colección 7, Ejercicio 6
	 * @author Ruba Mulla
	 * 
	 */


	public static double[][] trasponerMatriz(double[][] Original) 
	{

		double[][] resultado = new double[Original[0].length][Original.length];

		for (int j = 0; j < Original.length; j++) 
		{
			for (int i = 0; i < Original[j].length; i++)
			{
				resultado[i][j] = Original[j][i];
			}
		}
		return resultado;
	}

	// Ejercicio 7
	/**
	 * Método para multiplicar 2 matrices de números decimales
	 * 
	 * @param A : primera matriz
	 * @param B : segunda matriz
	 * @return: referencia a la matriz producto de las dos devuelve null si El
	 *          número de columnas de A difiere del número de filas de B Corresponde
	 *          a Colección 7, Ejercicio 7
	 * @author Rodrigo Matatoros
	 */
	public static double[][] multiplicarMatrices(double[][] matriz1, double[][] matriz2) {

		double[][] matrizNueva = new double[matriz1.length][matriz2[0].length];

		if (matriz1.length != matriz2[0].length) {
			matrizNueva = null;
		} else {
			for (int i = 0; i < matriz1.length; i++) {

				for (int j = 0; j < matriz2[0].length; j++) {

					for (int k = 0; k < matriz1[0].length; k++) {

						matrizNueva[i][j] += (matriz1[i][k] * matriz2[k][j]);
					}

				}

			}
		}

		return matrizNueva;
	}

	/**
	 * Método auxiliar utilizado para imprimir una matriz bidimensional de números
	 * decimales
	 * 
	 * @param original matriz a imprimir
	 */
	public static void imprimirMatriz(double[][] original) {
		System.out.println("Contenido de la matriz:  (");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				System.out.format("\t%.2f", original[i][j]);
			}
			System.out.println();
		}
		// fin del recorrido del array
		System.out.println(")");

	}

}
