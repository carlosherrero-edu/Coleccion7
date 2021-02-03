package coleccion7;

import java.security.SecureRandom;
import java.util.Arrays;
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
	 * @author Gero
	 * @param dimensiones
	 * @return array relleno con numeros aleatorios 0-9
	 **/

	public static int[][] rellenarMatriz(int dimensiones) {

		int[][] array = new int[dimensiones][dimensiones];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sr.nextInt(10);
			}
		}

		return array;
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

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.format("%1d  ", matriz[i][j]);
			}
			System.out.println();
		}
	} // fin de método

	public static int[] recorrerDiagonal(int[][] matriz, boolean esPrincipal) {

		/**
		 * @author David recorre diagonal de una matriz
		 * @param matriz
		 *            y si es principal o secundaria método int[]
		 */

		int[] diagonal = new int[matriz.length];
		if (esPrincipal) {
			for (int i = 0; i < matriz.length; i++) {
				diagonal[i] = matriz[i][i];
			}
		} else {
			for (int i = 0; i < matriz.length; i++) {
				diagonal[i] = matriz[i][matriz.length - 1 - i];
			}
		}
		return diagonal;
	}

	public static int[] recorrerPerimetro(int[][] matriz) {

		if (matriz.length == 1) {

			int[] resultado1 = new int[1];
			resultado1[0] = matriz[0][0];
			return resultado1;
		}

		else {

			int cont = 0;
			int[] resultado = new int[(2 * matriz[0].length)
					+ (matriz.length - 2) * 2];
			
			//recorremos fila superior
			for (int i = 0; i < matriz.length; i++) {

				resultado[i] = matriz[0][i];
				cont++;

			}
			
			//recorremos lado izquierdo
			for (int i = 1; i < matriz.length; i++) {

				resultado[cont] = matriz[i][matriz.length - 1];
				cont++;
			}
			
			//recorremos fila inferior, en sentido inverso
			for (int i = matriz.length - 2; i > 0; i--) {

				resultado[cont] = matriz[matriz.length - 1][i];
				cont++;

			}

			//recorremos para terminar el lado derecho
			for (int i = matriz.length - 1; i > 0; i--) {

				resultado[cont] = matriz[i][0];
				cont++;
			}

			return resultado;
		}

	}

	// hay un metodo para copiar matrices parciales, pero lo escribo a mano
	public static int[] recorrerEspiral(int[][] matriz) {
		int[] espiral = new int[matriz.length * matriz.length];
		int t = 0;
		for (int desplazamiento = 0; desplazamiento < matriz.length / 2.; desplazamiento++) {
			int[][] subArrayActual = new int[matriz.length - 2 * desplazamiento][matriz.length
					- 2 * desplazamiento];
			for (int i = desplazamiento, count = 0; i < matriz.length
					- desplazamiento; i++, count++) {
				subArrayActual[count] = Arrays.copyOfRange(matriz[i],
						desplazamiento, matriz.length - desplazamiento);
			}
			for (int n : recorrerPerimetro(subArrayActual)) {
				espiral[t] = n;
				t++;
			}
		}
		return espiral;
	}

	

	public static int calcularModaArray(int[] lista) {



		int[] listaOrdenada = Arrays.copyOf(lista, lista.length);
		Arrays.sort(listaOrdenada);

		int racha = 0;
		int moda = 0;
		int rachaMax = 0;

		for (int i = 0; i < listaOrdenada.length; i++) {

			if (i != 0) {

				if (listaOrdenada[i] == listaOrdenada[i - 1]) {

					racha++;
				} else {

					if (racha > rachaMax) {

						moda = listaOrdenada[i - 1];
						rachaMax = racha;
					}

					racha = 0;
				}

			}

		}

		if (racha > rachaMax) {

			moda = listaOrdenada[listaOrdenada.length - 1];
			rachaMax = racha;
		}

		return moda;

	}

	public static int calcularModa(int[][] matriz) {

		// Lucas

		int[] listaMatriz = new int[matriz.length * matriz.length];
		int A = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				listaMatriz[A] = matriz[i][j];

				A++;

			}

		}

		int moda = calcularModaArray(listaMatriz);

		return moda;

	}

	/**
	 * @author Gero Vacia la matriz...
	 **/
	public static void salir() {
		matriz = null;
	}

	static void imprimirListaEnteros(int[] lista) {
		{

			for (int i = 0; i < lista.length - 1; i++) {
				System.out.format("%1d -", lista[i]);

			}
			// imprimir el último elemento
			System.out.format("%1d ", lista[lista.length - 1]);

		}

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
				int moda = calcularModa(matriz);
				System.out.println("La moda es : " + moda);
				break;

			}

		} while (opcion != 7);

		// cuando nos salgamos, vaciamos la matriz
		salir();
		teclado.close();

	} // fin del método main

}
