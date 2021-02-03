package coleccion7;

/**
	 * @author Carlos Herrero
	 * @version 2.0
	 * Clase Alumno con un array de calificaciones y un método de cálculo de nota media
	 */
public class ExpedienteAlumno2 {
	
		static final double APROBADO=5.0;
		static final double PROMOCION= 0.7;
		
		/**
		 * Propiedades privadas de la clase
		 */
		private int nia;
		private String nombreApe;
		private double[] creditos;
		private double[] calificaciones;
		
		/**
		 * Constructor único de la clase
		 * @param nia : NIa del alumno (debe ser entero positivo)
		 * @param nombreApe: Cadena con su nombre y apellidos
		 * @param creditos: array decimal con los créditos de cada materia. Todos los créditos deben enstar comprendidos entre 0 y 100
		 * Si los parámetros no cumplen alguna regla de validación, se lanza una excepción
		 */
		public ExpedienteAlumno2 (int nia, String nombreApe,  double[] creditos){
			//validación de parámetros
			if (nia <=0 ) {
				throw new IllegalArgumentException ("El NIA debe ser un entero positivo");
		
			} else if ( creditos==null || creditos.length==0) {
				throw new IllegalArgumentException ("El array de créditos no puede estar vacío");
			} else if (! ExpedienteAlumno2.validarCreditos(creditos)) {
				throw new IllegalArgumentException ("El número de créditos en cada materia debe ser mayor de 0 y menor o igual a 100");
			}
			
			//si no hay errores, hacemos la asignación
			this.nia = nia;
			this.nombreApe = nombreApe;

			this.creditos = creditos;
			
		}
		
		
	
		@Override
		public String toString(){
			return "Nombre del Alumno: " + this.nombreApe + " \n Nia de Alumno: " + this.nia + " \n No. de asignaturas: "
					+ this.creditos.length;		
		}
		
		/**
		 * Método que muestra en una cadena el NIA y nombre del alumno
		 * Se apoya en el método toString()
		 * @return: cadena con los datos del alumno
		 */
		public String obtenerDatosAlumno() {
			return this.toString();
		}
			
			
		/**
		 * Método para recoger y guardar las calificaciones del alumno en cada materia
		 * @param notas: array decimal con las calificaciones en cada materia
		 * el array pasado debe tener igual número de elementos que en la propiedad créditos
		 * Si no es cumple esta condición, no se actualizar la propiedad calificaciones
		 */
		public void asignarCalificaciones (double[] notas){
			if (notas.length == this.creditos.length){
			
				this.calificaciones = notas;
			} else {
				
				this.calificaciones = null;
			}
		}
		
		
		 /**
		  * Método no público que calcula los créditos totales cursados por el alumno
		  * sumando los valores de la propiedad cŕeditos
		 * @return: suma de todos los crédtiso
		 */
		double dimeCreditosTotales(){
			double cred_totales=0.0;
			
			for (double carga: this.creditos)
				cred_totales += carga;
			
			return cred_totales;
			
		}
		
		/**
		 * Método que calcula la nota media ponderada del alumno, si ya existen calificaciones
		 * @return: Valor de la nota media ponderada, o -1 si no hay calificaciones
		 */
		public double obtenerNotaMedia(){
			if (calificaciones.length >0){
				double suma= 0.0;
				for (int i=0; i < this.calificaciones.length; i++)
						suma += this.calificaciones[i]*this.creditos[i];
				
				return suma/dimeCreditosTotales();
			} else
				return -1; //condición de error
		}
		
		/**
		 * mÉTODO QUE determina si un alumno puede pasar de curso
		 * El alumno pasa de curso si la suma de los créditos de las materias aprobadas
		 * Es igual o superior al porcentaje mínimo (70%) sobre el total de créditos cursados
		 * @return: Verdadero si alcanza el porcentaje mínimo de créditos superados, Falso en caso contrario
		 */
		public boolean apruebaCurso(){
		
				
				double cred_aprobados = 0.0;
				
				//en este bucle sumamos los créditos de las asignaturas que el alumno tiene aprobadas
				for (int i=0; i < this.calificaciones.length; i++){
					
					if (this.calificaciones[i] >= APROBADO){
						
						cred_aprobados += this.creditos[i];
					}	
				}
				
				//comprobamos si los créditos aprobados suponen al menos la proporción establecida para pasar de curso
				if (  cred_aprobados/dimeCreditosTotales() >= PROMOCION ) {
					return true;
				} else {
					return false;
				}
				
				
		
		}
		
		
		
		 /**
		  * Método no público para validar la lista de crédtidos en que se matricula el alumno
		  * Todos los créditos deben estar comprendidos entre 0 y 100
		 * @param creditos: array con el valor de los créditos
		 * @return: Verdadero si todos los créditos cumplen la confición, Falso en caso contrario
		 */
		static boolean validarCreditos (double[] creditos) {
			 for ( double valor: creditos) {
				 if (valor<=0 || valor>100) {
					 return false;
				 }
			 } //fin del recorrido
			 return true;
		}

}
