package coleccion7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProbarMatrizIdentidad {

	@Test
	@DisplayName("Probando matriz de orden 1")
    void test1() {
        int[][] arrayCreada = UtilidadesMatrices.obtenerMatrizIdentidad(1); 
        int[][] arrayTest = {{1}};
        assertArrayEquals(arrayTest, arrayCreada);
    }
	
	@Test
	@DisplayName("Probando matriz de orden 4")
    void test4() {
        int[][] arrayCreada = UtilidadesMatrices.obtenerMatrizIdentidad(4); 
        int[][] arrayTest = {{1, 0, 0, 0},{0, 1, 0, 0},{0, 0, 1, 0}, {0, 0, 0, 1}};
        assertArrayEquals(arrayTest, arrayCreada);
    }
	
	@Test
	@DisplayName("Probando matriz de orden 0 - Dará nulo")
    void testNulo() {
        int[][] arrayCreada = UtilidadesMatrices.obtenerMatrizIdentidad(0); 
        
       assertNull(arrayCreada);
    }

}
