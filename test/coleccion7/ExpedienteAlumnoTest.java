package coleccion7;
import static org.junit.Assert.*;


import org.junit.Before;

import org.junit.Test;

import coleccion7.ExpedienteAlumno;

/**
 * Clase para la prueba de la clase ExpedienteAlumno - Ejercicio9, Colección 6
 * @author Carlos Herrero
 * @version 1.0
 *
 */
public class ExpedienteAlumnoTest {
	
	
	double[] notas2 = {  6,  4.5, 5.5, 3.75, 6.25, 9};
	 ExpedienteAlumno un_estu, otro_estu;
	
	@Before
	public  void setUp() throws Exception {
		//se instancian los objetos necesarios para la prueba, antes de cada prueba
		 un_estu= new ExpedienteAlumno (3344, "Carlos Herrero", 6); 
		
	}

	

	@Test (expected = IllegalArgumentException.class)
	public void testExpedienteAlumno1() {
		System.out.println("Probamos que no puede crearse un Expediente con NIA negativo");
		otro_estu= new ExpedienteAlumno(-1000,"Andrés Hurtado", 6 );
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testExpedienteAlumno2() {
		System.out.println("Probamos que no puede crearse un Expediente con 0 materias");
		otro_estu= new ExpedienteAlumno(4455,"Andrés Hurtado", 0 );
	}
	
	@Test
	public void testExpedienteAlumno3() {
		System.out.println("Probamos el constructor");
		assertNotNull(un_estu);
	}
	

	
	@Test
	public void testObtenerDatosAlumno() {
		System.out.println("Probamos el método obtenerDatosAlumno");
		String nombre="Carlos Herrero";
		//si el nombre está contenido en los datos devueltos, indexOf devolverá >=0
		assertTrue(un_estu.obtenerDatosAlumno().indexOf(nombre) >=0 );
	}

	@Test (expected = IllegalArgumentException.class)
	public void testAsignarCalificaciones1() {
		System.out.println("Probamos que no podemos asignar menos calificaciones que asignaturas");
		double[] notas1 = { 4.5, 6, 5.5, 3.75, 6.25};
		un_estu.asignarCalificaciones(notas1);

	}
	
	@Test
	public void testAsignarCalificaciones2() {
		System.out.println("Probamos la asignación de calificaciones");
		double[] notas1 = { 4.5, 6, 5.5, 3.75, 6.25, 8.5};
		un_estu.asignarCalificaciones(notas1);
		// en realidad este método no podemos probarlo, al no haber un getCalificaciones()
	}
	
	@Test
	public void testObtenerNotaMedia1() {
		System.out.println("Probamos la condición de error en cálculo nota media");
		//no tenemos notas asignadas, el objeto se crea sin notas
		assertEquals (-1, un_estu.obtenerNotaMedia(), 0.01);
	}

	@Test
	public void testObtenerNotaMedia2() {
		System.out.println("Probamos el cálculo de la nota media");
		double[] notas1 = { 4.5, 6, 5.5, 3.75, 6.25, 8.5};
		un_estu.asignarCalificaciones(notas1);
		assertEquals (5.75, un_estu.obtenerNotaMedia(), 0.01);
	}

}
