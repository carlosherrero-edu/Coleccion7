package coleccion7;

import java.security.SecureRandom;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RecorrerMatriz {

	/**
	 * matriz se define como estático para que tenga el mismo valor durante toda la
	 * clase
	 */
	static int[][] matriz;

	/**
	 * 
	 * @param dimensiones
	 * @return array relleno con numeros aleatorios 0-9
	 * Alfredo Puerta
	 **/

	static int[][] rellenarMatriz(int dimensiones) {

		int[][] matrizRellena = new int[dimensiones][dimensiones];

		for (int i = 0; i < matrizRellena.length; i++) {
			for (int j = 0; j < matrizRellena[i].length; j++) {
				matrizRellena[i][j] = generarValor();
			}
		}
		return matrizRellena;
	}

	/**
	 * Alfredo Puerta
	 * @return
	 */
	static int generarValor() {
		SecureRandom secureRandom = new SecureRandom();
		return secureRandom.nextInt(10);
	}

	/**
	 * Método para solicitar una opción de menú y devolverla al programa principal
	 * 
	 * @return: entero de 1-7 con la opción elegida 
	 * Mauricio Rodríguez
	 */
	static int mostrarMenu() {

		int eleccion;
		do {
			System.out.println("Listado de opciones: ");
			System.out.println("1 - Mostrar Matriz.");
			System.out.println("2 - Obtener diagonal principal.");
			System.out.println("3 - Obtener diagonal secundaria.");
			System.out.println("4 - Obtener perimetro.");
			System.out.println("5 - Obtener moda.");
			System.out.println("6 - Recorrer espiral.");
			System.out.println("7 - Salir");
			System.out.println("Elige una opción. 7 para Salir:");
			Scanner scanner = new Scanner(System.in);
			eleccion = scanner.nextInt();
		} while (eleccion < 1 || eleccion > 7);

		return eleccion;

	} // fin del método mostrarMenú

	/**
	 * Alfredo Puerta
	 * @param matriz
	 */
	static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.format("%3d", matriz[i][j]);
			}
		}
	} // fin de método

	/**
	 * Luis Monzón
	 * @param matriz
	 * @return
	 */
	static int[] obtenerModa(int[][] matriz) {

		int[] moda = new int[3];
		int[] frecuenciasModa = new int[10];

		// Recorrer matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				frecuenciasModa[matriz[i][j]]++;
			}

		}

		for (int i = 0; i < frecuenciasModa.length; i++) {
			for (int j = frecuenciasModa.length; j >= 0; j--) {
				if (frecuenciasModa[i] < frecuenciasModa[j]) {
					moda[0] = frecuenciasModa[j];

				} else {
					moda[0] = frecuenciasModa[i];
				}
			}
		}

		return moda;

	}

	/**
	 * Mauricio Rodríguez
	 * @param matriz
	 * @return
	 */
	static int[] obtenerDiagonalPrincipal(int[][] matriz) {

		int[] diagonalPrincipal = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					diagonalPrincipal[i] = matriz[i][j];
				}
			}
		}

		return diagonalPrincipal;
	}

	/**
	 * Mauricio Rodríguez
	 * @param matriz
	 * @return
	 */
	static int[] obtenerDiagonalSecundaria(int[][] matriz) {

		int[] diagonalSecundaria = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i + j == matriz.length - 1) {
					diagonalSecundaria[i] = matriz[i][j];
				}
			}
		}

		return diagonalSecundaria;
	}
	
	/**
	 * Luis Monzón
	 * @param matriz
	 * @return
	 */

	static int[] obtenerPerimetro(int[][] matriz) {

		int[] perimetro = new int[matriz.length * 2 + (2 * (matriz.length - 2))];

		// Recorrer la primera fila
		for (int i = 0; i < matriz.length; i++) {
			perimetro[i] = matriz[0][i];
		}

		// Recorrer ultima columna
		for (int i = 0; i < matriz.length; i++) {
			perimetro[i] = matriz[i][matriz.length - 1];
		}
		// Recorrer la ultima fila
		for (int i = matriz.length; i >= 0; i--) {
			perimetro[i] = matriz[matriz.length - 1][i];
		}

		// Recorrer primera columna
		for (int i = matriz.length; i >= 0; i--) {
			perimetro[i] = matriz[i][0];
		}

		return perimetro;

	}

	static int[] recorrerEspiral(int[][] matriz) {

		return null;
	}
	
	static void recorrerLista (int [] lista, String mensaje) {
		
		System.out.println(mensaje);
		System.out.println();
		for (int valor: lista) {
			System.out.format(" %2d ", valor);
		}
		System.out.println();
		
		
		
	}

	public static void main(String[] args) {

		//inicialmente trabajaremos con una matriz constante
				int dimension = 0;
				
				//bucle para la validación de las dimensiones introducidas por teclado (@author AlfredoPuerta)
				while(dimension < 3) {
					dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la dimensión de la matriz: "));

					if(dimension >= 3) {
						matriz = rellenarMatriz(dimension);
					} else {
						System.out.println("Se necesita un número mayor o igual a 3. Pruebe de nuevo");
					}
				}
				mostrarMatriz(matriz);

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
				recorrerLista(listaEnteros, "Elementos de la diagonal principal");

				break;

			case 3:
				listaEnteros = obtenerDiagonalSecundaria(matriz);
				recorrerLista(listaEnteros, "Elementos de la diagonal secundaria");

				break;

			case 4:

				listaEnteros = obtenerPerimetro(matriz);
				recorrerLista(listaEnteros, "Elementos del perímetro");

				break;
			case 5:
				listaEnteros = obtenerModa(matriz);
				recorrerLista(listaEnteros, "Moda de la matriz de elementos");

				break;
			case 6:
				// este método es un bonus. Si no se desarrolla, no se tendrá en el menú
				System.out.println("Lo siento, pero esta función está aún en desarrollo");
				break;

			}

		} while (opcion != 7);

	} // fin del método main

}
