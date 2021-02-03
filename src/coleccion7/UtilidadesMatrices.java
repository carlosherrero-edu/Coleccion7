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
		

		
		int contador=1;
		
		//recorrer el array primero por filas, después por columnas
		for (int i=0; i< tabla.length; i++) {
			
			for (int j=0; j< tabla[i].length; j++){
				tabla[i][j] = contador++;
				
			} 
		} //fin de los bucles
	} //aquí finaliza el m�todo. No necesitamos devolver nada
	
	
	
	/**Método que rellena un array de dos dimensiones de enteros asign�ndole enteros
	 * consecutivos, comenzando en la unidad. El relleno se hace por columnas, es decir, se rellena
	 * primero la columna 1, despu�s la columna 2,... etc...
	 * @param tabla:  referencia a un array de enteros de 2 dimensiones
	 * Corresponde a Colección 7, Ejercicio 2
	 */
	public static void rellenarConsecutivosPorColumnas(int[][] tabla){
		
		
		int contador=1;
		// recorremos primero por columnas y, dentro de cada columna, por filas
		for (int j=0; j< tabla[0].length; j++) {
			
			for (int i=0; i< tabla.length; i++){
				tabla[i][j] = contador++;
				
			} 
		} //fin de los bucles
	} //aqu� finaliza el m�todo. No necesitamos devolver nada
	
	
	
	
	

		/** M�todo que construye la matriz cuadrada identidad de una dimensión dada por parámetro
		 * @param dimension entero con la dimensi�n de la matriz
		 * @return  referencia a un array de dos dimensiones con la matriz identidad
		 * Corresponde a Colección 7, Ejercicio 3
		 */
		public static int[][] obtenerMatrizIdentidad(int dimension){
			
			if (dimension <=0){
				return null;
			} 
		
			
				int [][] tabla = new int[dimension][dimension];
			
			
				for (int i=0; i< dimension ; i++) {
				
					for (int j=0; j< dimension ; j++){
						if (i==j)
							tabla[i][j] = 1;
						else
							tabla[i][j] = 0;
						
					} 
				} //fin de los bucles
				return tabla;
			
				
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
			
	        int columnas=filas*2-1;
	        char [][] matrizAsteriscos=null;
	        
	        if(filas>0) {
	        	matrizAsteriscos=new char[filas][columnas];
	        	
	        	//inicialmente rellenamos todas las celdas con espacios en blanco
	            for (int i = 0; i < matrizAsteriscos.length; i++) {
	            		//usamos la función fill para rellenar todas las celdas de la fila i
	            		Arrays.fill(matrizAsteriscos[i], BLANCO);
	                  
	                }
	            //ahora rellenamos con asteriscos las filas empezando por la última, y reduciendo 2 asteriscos en cada fila
	            for(int i=matrizAsteriscos.length-1, comienzo=0; i>=0; i--, comienzo++) {
	            	
	            	//Arrays.fill(a, fromIndex, toIndex, val);
	                for(int j=comienzo; j<matrizAsteriscos[i].length-comienzo; j++) {
	          	           matrizAsteriscos[i][j]= ASTERISCO;
	                }	               
	            }
	            
	        }
	        return matrizAsteriscos;

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
			//comprobamos si tienen el mismo tamaño
			 if (primera.length != segunda.length || primera[0].length != segunda[0].length) {
				return null;
			}
			
			//instanciamos la matriz suma con las dimensiones de cualquiera de los sumandos
			
			int num_filas= primera.length;
			int num_columnas= primera[0].length;
			
			double [][] suma = new double [num_filas][num_columnas];
			
			//recorremos y sumamos celda a celda
			for (int i=0; i<num_filas; i++) {
				for (int j=0; j< num_columnas; j++) {
					suma[i][j] = primera [i][j] + segunda[i][j];
				}
			} //fin del recorrido por celdas
			
			return suma;
		}
		
		
		

		/**
		 * Método para obtener la matriz traspuesta de una dada
		 * La matriz traspuesta se obtiene intercambiando filas por columnas
		 * @param original matriz -bidimensional- de números decimales
		 * @return matriz bidimensional traspuesta, con sus dimensiones cambiadas
		 * Corresponde a Colección 7, Ejercicio 6
		 */
		 
		public static double[][] trasponerMatriz (double[][] original){
			
			
			
			//instanciamos la matriz traspuesta invirtiendo sus dimensiones respecto de la original
			double[][] traspuesta = new double [original[0].length][original.length];
			
			//ahora la rellenamos celda a celda
			for (int i=0; i< traspuesta.length; i++){
				for (int j=0; j < traspuesta[i].length; j++){
					traspuesta[i][j] = original [j][i];
				}
			}
			
			return traspuesta;
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
			
			//validamos que ambas matrices cumplan la condición para poder multiplicarlas
			 if (A[0].length != B.length){
				return null;
			}
		
			//instanciamos la matriz producto, cuyas dimensiones son: número de filas de A X número de columnas de B
			int filas_prod= A.length;
			int columnas_prod = B[0].length;
			
			double [][] producto = new double [ filas_prod] [columnas_prod];
			 
			 //rellenamos ahora la matriz producto
			 for (int i =0 ; i< filas_prod; i++){
				 
				 for (int j=0 ; j < columnas_prod; j++){
					 
					 //cada celda se obtiene multiplicando celda a celda la fila i de A con la columna j de B
					 double celda = 0.0;
					 
					 for (int k =0; k < A[0].length; k++){
						  celda = celda+  A[i][k]* B[k][j];
					 }
					 producto [i][j] = celda;
					 
				 }
			 }
			 
			 return producto;
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
		
		
		
	/** Método auxiliar utilizado para imprimir una matriz bidimensional de caracteres
	 * @param original matriz a imprimir
	 */
	public static void imprimirMatriz (char[][] original){
		System.out.println( "Contenido de la matriz:  (");
		for (int i=0; i< original.length; i++){
			for (int j=0; j < original[i].length; j++){
				System.out.format("%2s", original[i][j]);
			}
			System.out.println();
		}
		//fin del recorrido del array
		System.out.println(")");
		
	}

}
