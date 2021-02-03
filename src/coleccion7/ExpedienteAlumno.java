package coleccion7;

public class ExpedienteAlumno {

	/**
	 * @author Saquib
	 * @version 1.0 Clase Alumno con un array de calificaciones y un método de
	 *          cálculo de nota media
	 */

	private int nia;
	private String nombreApe;
	private int num_asig;
	private double[] calificaciones;

	public ExpedienteAlumno(int nia, String nombreApe, int num_asig) {

		if (nia > 0 && num_asig > 0) {

			this.nia = nia;
			this.nombreApe = nombreApe;
			this.num_asig = num_asig;

		} else
			throw new IllegalArgumentException("Los valores pasados no son  validos");
	}

	public String obtenerDatosAlumno() {
		return "Nombre del Alumno: " + this.nombreApe + " \n Nia de Alumno: " + this.nia + " \n No. de asignaturas: "
				+ this.num_asig;
	}

	public void asignarCalificaciones(double[] calificaciones) {
		if (calificaciones.length == this.num_asig) {
			this.calificaciones = calificaciones;
		} else
			this.calificaciones = null;
	}

	public double obtenerNotaMedia() {

		if (this.calificaciones != null) {
			double notaMedia = 0;

			for (int i = 0; i < this.calificaciones.length; i++) {
				notaMedia += calificaciones[i];
			}
			return notaMedia / this.calificaciones.length;
		}
		// si no tengo aún calificaciones
		return -1;
	}

} // fin de la clase
