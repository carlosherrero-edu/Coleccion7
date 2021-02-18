package coleccion7;

public class ExpedienteAlumno2 {
	
	final int CREDITOS_MIN=0;
	final int CREDITOS_MAX=0;

	private int nia;
	private String nombreApe;
	private double[] creditos;
	private double[] calificaciones;
	
	
	
	boolean validarCreditos (double [] creditos) {
		
		
		
		boolean validado=true;
		
		//recorro todos los créditos y compruebo si alguno incumple la condición de validación
		for (double valor: creditos) {
			
			if (valor<=CREDITOS_MIN || valor>CREDITOS_MAX) {
				validado=false;
			}
		}
		
		return validado;
	}

	public ExpedienteAlumno2(int nia, String nombreApe, double[] creditos) throws IllegalArgumentException {
	
		if (nia <=0) {
			throw new IllegalArgumentException("El NIA debe ser positivo");
			
		}
		
		if (!validarCreditos(creditos)) {
			throw new IllegalArgumentException("La carga horaria de cada crédito debe estar entre "+ CREDITOS_MIN +" y "+  CREDITOS_MAX);
			
		}
		
		// si llego a este punto, todo es correcto e instancio el objeto
			this.nia=nia;
			this.nombreApe = nombreApe;
			this.creditos = creditos;
			
		
	}

	public String obtenerDatosAlumno() {

		return this.nia +"  "+ this.nombreApe;
	}
	
	

	public void asignarCalificaciones(double[] calificaciones) {
		boolean validacion = (this.creditos.length == calificaciones.length);

		if (validacion) {
			this.calificaciones = calificaciones;
		}

	}

	public double obtenerNotaMedia(){
		
			return 0;
		
	}
	
	public boolean pasaCurso() {
		return true;
	}

}
