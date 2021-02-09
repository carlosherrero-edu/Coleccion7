package coleccion7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RellenarConsecutivosPorFilasTest {

	int[][] array2d1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	int[][] arrayConsecutivos1 = new int[3][3];
	///////

	int[][] array2d2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

	int[][] arrayConsecutivos3 = new int[3][4];
	
	int[][] array2d3 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8}, { 9,10,11,12} };

	int[][] arrayConsecutivos2 = new int[4][3];
	
	int[][] arraySolitario= new int[1][1];
	
	int [][] array1f1c= {{1}};

	@Test
	public void test1() {
		UtilidadesMatrices.rellenarConsecutivosPorFilas(arrayConsecutivos1);
		assertArrayEquals(array2d1, arrayConsecutivos1);
	}

	@Test
	public void test2() {
		UtilidadesMatrices.rellenarConsecutivosPorFilas(arrayConsecutivos3);
		assertArrayEquals(array2d3, arrayConsecutivos3);
	}
	
	@Test
	public void test3() {
		UtilidadesMatrices.rellenarConsecutivosPorFilas(arrayConsecutivos2);
		assertArrayEquals(array2d2, arrayConsecutivos2);
	}
	
	@Test
	public void test4() {
		UtilidadesMatrices.rellenarConsecutivosPorFilas(arraySolitario);
		assertArrayEquals(array1f1c, arraySolitario);
	}

}
