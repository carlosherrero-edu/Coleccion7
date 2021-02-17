package coleccion7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpedienteAlumnoTest {
	
	ExpedienteAlumno alumno1;

	@Test
	void testExpedienteAlumnoOK() {
		alumno1=new ExpedienteAlumno(123456,"Carlos Herrero",6);
		assertNotNull(alumno1);
	}
	
	@Test
	void testExpedienteAlumnoKO() {
		//comprobamos que se lanza la excepción
		assertThrows(IllegalArgumentException.class, () -> {
			alumno1=new ExpedienteAlumno(123456,"Carlos Herrero",0);
		    }
		);
		//comprobamos que no se instancia el objeto
		assertNull(alumno1);	
		
	}

	@Test
	void testObtenerDatosAlumno() {
		alumno1=new ExpedienteAlumno(123456,"Carlos Herrero",6);
		assertTrue(alumno1.obtenerDatosAlumno().contains("Carlos Herrero"));
	}

	@Test
	void testObtenerNotaMedia() {
		double [] calificaciones= {6, 7, 8, 4, 5};
		alumno1=new ExpedienteAlumno(123456,"Carlos Herrero",5);
		alumno1.asignarCalificaciones(calificaciones);
		assertEquals( 6.0, alumno1.obtenerNotaMedia(), 0.05);
	}

}
