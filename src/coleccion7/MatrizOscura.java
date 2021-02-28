package coleccion7;

public class MatrizOscura {

	static final int MINIMO_PIXELES = 36;

	/**
	 * Método estático que determina si una imagen pasada como matriz de pixeles se
	 * considera oscura La imagen se considera oscura si una proporción de sus
	 * pixeles superior o igual al porcentaje indicado tiene un valor de intensidad
	 * inferior al umbral
	 * 
	 * @param imagen     matriz de pixeles que representa una imagan
	 * @param umbral     valor por debajo del cual un pixel se considera oscuro
	 * @param porcentaje porcentaje mínimo de pixeles para que la imagen se
	 *                   considere oscura
	 * @return true/false
	 */
	public static boolean esOscura(int[][] imagen, int umbral, double porcentaje) {
		// paso 1:  calculamos número de pixeles de la imagen

		int num_pixeles = imagen.length * imagen[0].length;

		// Paso 2: validación de parámetros y condiciones de error
		if (num_pixeles < MINIMO_PIXELES)
			throw new IllegalArgumentException("Imagen con una resolución demasiado baja");
		else if (umbral < 0 || umbral > 255)
			throw new IllegalArgumentException("El umbral debe estar entre 0 y 255");
		else if (porcentaje < 0 || porcentaje > 100)
			throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");

	

		// paso 3: recorremos todos los pixeles y contamos los oscuros
		
		int oscuros = 0;

		for (int i = 0; i < imagen.length; i++) {
			for (int j = 0; j < imagen[0].length; j++) {
				if (imagen[i][j] < umbral)
					oscuros++;
			}
		}
		/* Paso 4: Devolvermos resultado
		
		destacar que hay que hacer una conversión explícita integer--> double de los enteros
		para que la división no resulte siempre 0 por el truncamiento de decimales
		*/
		return (double)oscuros / (double)num_pixeles >= porcentaje * 0.01;
		
	}

}
