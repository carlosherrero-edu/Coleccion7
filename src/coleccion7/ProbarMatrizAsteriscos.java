package coleccion7;

public class ProbarMatrizAsteriscos {

	public static void main(String[] args) {
		char [][] matriz1= UtilidadesMatrices.obtenerMatrizAsteriscos(1);
		UtilidadesMatrices.imprimirMatriz(matriz1);
		
		
		char [][] matriz3= UtilidadesMatrices.obtenerMatrizAsteriscos(3);
		UtilidadesMatrices.imprimirMatriz(matriz3);
		
		char [][] matriz5= UtilidadesMatrices.obtenerMatrizAsteriscos(5);
		UtilidadesMatrices.imprimirMatriz(matriz5);

	}

}
