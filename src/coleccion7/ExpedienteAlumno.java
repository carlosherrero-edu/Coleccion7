package coleccion7;

public class ExpedienteAlumno {

	private int nia;
	private String nombreApe;
	private int num_asig;
	private double[] calificaciones;
	private double[] creditos;

	public ExpedienteAlumno(int nia, String nombreApe, int num_asig, double[] creditos)
			throws IllegalArgumentException {

		if (nia > 0 && num_asig > 0 && num_asig == creditos.length)  {
			for (int i = 0; i < creditos.length; i++) {
				if (creditos[i] < 0 || creditos[i] > 100) {
					throw new IllegalArgumentException("Los creditos deben estar comprendidos entre 0-100");
				} 
			} //fin del recorrido de creditos
			//si llegamos hasta aquí, los parámetros son válidos
			this.nia = nia;
			this.nombreApe = nombreApe;
			this.num_asig = num_asig;
			this.creditos = creditos;
		} else {
			throw new IllegalArgumentException("Los valores deben ser positivos");
		}
	}

	public String obtenerDatosAlumno() {

		return this.nia + "  " + this.nombreApe;
	}

	public void asignarCalificaciones(double[] calificaciones) {
		boolean validacion = creditos.length == calificaciones.length ;

		if (validacion) {
			this.calificaciones = calificaciones;
		}

	}

	public boolean apruebaCurso() throws Exception {
		
		//comprobar previamente que hay calificaciones asignadas
			if (this.calificaciones == null) {
					throw new Exception ("No hay calificaciones asignadas");
			}
				
		
		double cargaTotal = 0;
		final int PORCENTAJE_APROBAR = 30;
		
		for (double d : creditos) {
			cargaTotal += d;
		}
		
		int creditos_suspensos=0; 
		//sumamos todos los cŕeditos suspensos
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] < 5 ) {
				creditos_suspensos += creditos[i];		
			} 
		} //fin del recorrido de las calificaciones
		
		
		return  (100.0*(double)creditos_suspensos/(double)cargaTotal <= PORCENTAJE_APROBAR);
	}
	
	
	//Solución de Miguel Rodríguez
	
//	public boolean apruebaCurso() {
//		
//		//comprobar previamente que hay calificaciones asignadas
//		if (this.calificaciones == null) {
//				throw new Exception ("No hay calificaciones asignadas");
//		}
//		
//		boolean aprueba = false;
//		double cargaTotal = 0;
//		double credSus = 0;
//		final int PORCENTAJE = 30;
//		for (double d : creditos) {
//			cargaTotal += d;
//		}
//		
//		for (int i = 0; i < calificaciones.length; i++) {
//			if(calificaciones[i]<5) {
//				credSus += creditos[i];
//				if(credSus>((PORCENTAJE*cargaTotal)/100)) {
//					aprueba = false;
//					break;
//				}
//			}else {
//				aprueba = true;
//			}
//		}
//		
//		return aprueba;
//	}
	

	public double obtenerNotaMedia() {
		//comprobar previamente que hay calificaciones asignadas
		if (this.calificaciones == null) {
			return -1; 
		}
		
		// tener en cuenta en JUnit que puede generarse un NullPointerException
		double notaMedia = 0;
		double cargaTotal = 0;
		//obtenemos la carga total horaria entre todas las asignaturas
		for (double d : creditos) {
			cargaTotal += d;
		}

		//hacemos la suma ponderada de las calificaciones
		for (int i = 0; i < this.calificaciones.length; i++) {

			notaMedia = (this.calificaciones[i] * this.creditos[i]);
		}

		return notaMedia / cargaTotal;

	}

}
