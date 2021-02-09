package coleccion7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RellenarConsecutivosPorColumnasTest {

	int[][] array2d1 = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

	int[][] arrayConsecutivos1 = new int[3][3];
	///////

	int[][] array2d2 = { { 1, 5, 9 }, { 2, 6, 10 }, { 3, 7, 11 }, { 4, 8, 12 } };

	int[][] arrayConsecutivos2 = new int[4][3];
	
	
	
	int[][] arraySolitario= new int[1][1];
	
	int [][] array1f1c= {{1}};

	@Test
	public void test1() {
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(arrayConsecutivos1);
		assertArrayEquals(array2d1, arrayConsecutivos1);
	}

	
	
	@Test
	public void test3() {
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(arrayConsecutivos2);
		assertArrayEquals(array2d2, arrayConsecutivos2);
	}
	
	@Test
	public void test4() {
		UtilidadesMatrices.rellenarConsecutivosPorColumnas(arraySolitario);
		assertArrayEquals(array1f1c, arraySolitario);
	}

}
