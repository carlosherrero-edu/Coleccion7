package coleccion7;

public class ExpedienteAlumno {

	private int nia;
	private String nombreApe;
	private int num_asig;
	private double[] calificaciones;
	
	

	public ExpedienteAlumno(int nia, String nombreApe, int num_asig) throws IllegalArgumentException {
	
		if (nia >0 && num_asig >0) {
			this.nia=nia;
			this.nombreApe = nombreApe;
			this.num_asig = num_asig;
			
		}  else {
			throw new IllegalArgumentException("Los valores deben ser positivos");
		}
	}

	public String obtenerDatosAlumno() {

		return this.nia +"  "+ this.nombreApe;
	}

	public void asignarCalificaciones(double[] calificaciones) {
		boolean validacion = this.num_asig == calificaciones.length;

		if (validacion) {
			this.calificaciones = calificaciones;
		}

	}

	public double obtenerNotaMedia(){
		
			//tener en cuenta en JUnit que puede generarse un NullPointerException
			double notaMedia = 0;
	
			for (int i = 0; i < this.calificaciones.length; i++) {
	
				notaMedia = this.calificaciones[i] + notaMedia;
			}
	
			return notaMedia/this.num_asig;
		
	}

}
