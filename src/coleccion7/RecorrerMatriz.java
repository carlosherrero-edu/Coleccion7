package coleccion7;

import java.security.SecureRandom;

import java.util.Scanner;

public class RecorrerMatriz {

	static final int dimension = 5;

	static int[][] matriz;

	static Scanner teclado = new Scanner(System.in);

	/**
	 * Objeto statico sr -> SecureRandom();
	 */
	static SecureRandom sr = new SecureRandom();

	/**
	
	 * @param dimensiones
	 * @return array relleno con numeros aleatorios 0-9
	 **/

	public static int[][] rellenarMatriz(int dimensiones) {

		return null;
	}

	/**
	 * Método para solicitar una opción de menú y devolverla al programa
	 * principal
	 * 
	 * @return: entero de 1-7 con la opción elegida
	 */
	static int mostrarMenu() {

		int opcion;

		String[] opciones = { "Mostrar la matriz",
				"Recorrer la diagonal principal",
				"Recorrer la diagonal secundaria", "Recorrer el perímetro",
				"Recorrer en espiral", "Obtener la moda", "Salir" };

		System.out.println("\n\n Menú de opciones");
		System.out.println("_________________");

		for (int i = 0; i < opciones.length; i++) {
			System.out.format("%n Opción %1d : %s ", (i + 1), opciones[i]);
		}

		boolean opcionCorrecta = false;

		do {
			System.out.print("\n Elige una opción \n -->");

			opcion = teclado.nextInt();

			if (opcion < 1 || opcion > 7) {
				System.out
						.println("Has elegido una opción incorrecta . Escríbela de nuevo");

			} else {
				opcionCorrecta = true;
			}
		} while (!opcionCorrecta);

		return opcion;

	} // fin del método mostrarMenú

	/**
	 * @author Talia Imprime una matriz
	 * @param m
	 *            método void
	 */

	public static void mostrarMatriz(int[][] matriz) {

		
		
	} // fin de método

	public static int[] recorrerDiagonal(int[][] matriz, boolean esPrincipal) {

		return null;
	}

	public static int[] recorrerPerimetro(int[][] matriz) {
		return null;

	}

	// hay un metodo para copiar matrices parciales, pero lo escribo a mano
	public static int[] recorrerEspiral(int[][] matriz) {
		return null;
	}

	

	public static int calcularModaArray(int[][] matriz) {



		return 0;

	}

	

	/**
	 * @author Gero Vacia la matriz...
	 **/
	public static void salir() {
		matriz = null;
	}

	static void imprimirListaEnteros(int[] lista) {
		
		
	}

			
	

	public static void main(String[] args) {

		// inicialmente hay que cargar la matriz

		matriz = rellenarMatriz(dimension);

		int opcion;
		int[] listaEnteros;

		do {

			opcion = mostrarMenu();

			switch (opcion) {
			case 1:
				mostrarMatriz(matriz);
				break;
			case 2:
				listaEnteros = recorrerDiagonal(matriz, true);
				System.out.println("La diagonal principal es:");
				imprimirListaEnteros(listaEnteros);
				break;
			case 3:
				listaEnteros = recorrerDiagonal(matriz, false);
				System.out.println("La diagonal secundaria es:");
				imprimirListaEnteros(listaEnteros);
				break;
			case 4:
				listaEnteros = recorrerPerimetro(matriz);

				System.out.println("El perímetro es:");
				imprimirListaEnteros(listaEnteros);
				break;
			case 5:
				listaEnteros = recorrerEspiral(matriz);

				System.out.println("La matriz recorrida en espiral es");
				imprimirListaEnteros(listaEnteros);
				break;
			case 6:
				int moda = calcularModaArray(matriz);
				System.out.println("La moda es : " + moda);
				break;

			}

		} while (opcion != 7);

		// cuando nos salgamos, vaciamos la matriz
		salir();
		teclado.close();

	} // fin del método main

}
