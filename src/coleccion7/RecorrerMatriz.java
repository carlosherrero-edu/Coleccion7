package coleccion7;

import java.security.SecureRandom;

import java.util.Scanner;

public class RecorrerMatriz {

	/**
	 * matriz se define como estático para que tenga el mismo valor durante toda la
	 * clase
	 */
	static int[][] matriz = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 3, 5, 7, 9 }, { 4, 6, 8, 0 } };

	/**
	 * 
	 * @param dimensiones
	 * @return array relleno con numeros aleatorios 0-9
	 **/

	static int[][] rellenarMatriz(int dimensiones) {

		return null;
	}

	static int generarValor() {
		return 0;
	}

	/**
	 * Método para solicitar una opción de menú y devolverla al programa principal
	 * 
	 * @return: entero de 1-7 con la opción elegida
	 */
	static int mostrarMenu() {

		return 0;

	} // fin del método mostrarMenú

	static void mostrarMatriz(int[][] matriz) {

	} // fin de método

	static int[] obtenerModa(int[][] matriz) {

		return null;

	}

	static int[] obtenerDiagonalPrincipal(int[][] matriz) {

		return null;
	}

	static int[] obtenerDiagonalSecundaria(int[][] matriz) {

		return null;
	}

	static int[] obtenerPerimetro(int[][] matriz) {

		return null;

	}

	static int[] recorrerEspiral(int[][] matriz) {

		return null;
	}

	public static void main(String[] args) {

		// inicialmente trabajaremos con una matriz constant

		// matriz = rellenarMatriz(dimension);

		int opcion;
		int[] listaEnteros;

		do {

			opcion = mostrarMenu();

			switch (opcion) {
			case 1:
				mostrarMatriz(matriz);
				break;

			case 2:
				listaEnteros = obtenerDiagonalPrincipal(matriz);

				break;

			case 3:
				listaEnteros = obtenerDiagonalSecundaria(matriz);

				break;

			case 4:

				listaEnteros = obtenerPerimetro(matriz);

				break;
			case 5:
				listaEnteros = obtenerModa(matriz);

				break;
			case 6:
				// este método es un bonus. Si no se desarrolla, no se tendrá en el menú
				listaEnteros = recorrerEspiral(matriz);
				break;

			}

		} while (opcion != 7);

	} // fin del método main

}
