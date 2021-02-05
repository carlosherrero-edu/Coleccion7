package coleccion7;
import java.util.Arrays;


public class UtilidadesMatrices {
	
	
	/** M�todo que rellena un array de dos dimensiones de enteros asign�ndole enteros
	 * consecutivos, comenzando en la unidad. El relleno se hace por filas, es decir, se rellena
	 * primero la fila 1, despu�s la fila 2,... etc...
	 * @param tabla: referencia a un array bidimensional de enteros
	 * Corresponde a Colección 7, Ejercicio 1
	 */
	public static void rellenarConsecutivosPorFilas(int[][] tabla){
		

		
		
	} //aquí finaliza el m�todo. No necesitamos devolver nada
	
	
	
	/**Método que rellena un array de dos dimensiones de enteros asign�ndole enteros
	 * consecutivos, comenzando en la unidad. El relleno se hace por columnas, es decir, se rellena
	 * primero la columna 1, despu�s la columna 2,... etc...
	 * @param tabla:  referencia a un array de enteros de 2 dimensiones
	 * Corresponde a Colección 7, Ejercicio 2
	 */
	public static void rellenarConsecutivosPorColumnas(int[][] tabla){
		
		
		
	} //aqu� finaliza el m�todo. No necesitamos devolver nada
	
	
	
	
	

		/** M�todo que construye la matriz cuadrada identidad de una dimensión dada por parámetro
		 * @param dimension entero con la dimensi�n de la matriz
		 * @return  referencia a un array de dos dimensiones con la matriz identidad
		 * Corresponde a Colección 7, Ejercicio 3
		 */
		public static int[][] obtenerMatrizIdentidad(int dimension){
	
				return null;
		} //aqu� finaliza el m�todo. 
		
		
		//Ejercicio4
		/**
		 * Solución para el ejercicio 4 para rellenar una matriz con asteriscos
		 * LA fila inferior estará completa con asteriscos
		 * Cada fila tiene 2 asteriscos menos que la inmediata inferior, en posición centrada
		 * La fila superior tendrá sólo 1 asterisco centrado
		 * @param filas entero con el número de filas que queremos imprimir
		 * @return una matriz de carateres con asteriscos y blancos
		 * Corresponde a Colección 7, Ejercicio 4
		 */
		public static char[][] obtenerMatrizAsteriscos (int filas){
			final char BLANCO=' ';
			final char ASTERISCO= '*';
			
	       return null;

		}
		
		
		/**
		 * Método para sumar 2 matrices de números decimales
		 * @param primera : primera matriz
		 * @param segunda : segunda matriz
		 * @return: referencia a la matriz uma de las dos
		 * devuelve null si las 2 matrices no tienen igual dimensión
		 * Corresponde a Colección 7, Ejercicio 5
		 */
		public static double[][] sumarMatrices (double [][] primera, double [][] segunda){
			return null;
		}
		
		
		

		/**
		 * Método para obtener la matriz traspuesta de una dada
		 * La matriz traspuesta se obtiene intercambiando filas por columnas
		 * @param original matriz -bidimensional- de números decimales
		 * @return matriz bidimensional traspuesta, con sus dimensiones cambiadas
		 * Corresponde a Colección 7, Ejercicio 6
		 */
		 
		public static double[][] trasponerMatriz (double[][] original){
			
			return null;
		}
		
		//Ejercicio 7
		/**
		 * Método para multiplicar 2 matrices de números decimales
		 * @param A : primera matriz
		 * @param B : segunda matriz
		 * @return: referencia a la matriz producto de las dos
		 * devuelve null si El número de columnas de A difiere del número de filas de B  
		 *  Corresponde a Colección 7, Ejercicio 7
		 */
		public  static double[][] multiplicarMatrices (double [][] A , double [][] B)  {
			
			return null;
		}
		
	
			
		/** Método auxiliar utilizado para imprimir una matriz bidimensional de números decimales
		 * @param original matriz a imprimir
		 */
		public static void imprimirMatriz (double[][] original){
			System.out.println( "Contenido de la matriz:  (");
			for (int i=0; i< original.length; i++){
				for (int j=0; j < original[i].length; j++){
					System.out.format("\t%.2f", original[i][j]);
				}
				System.out.println();
			}
			//fin del recorrido del array
			System.out.println(")");
			
		}
		

		
	

}
