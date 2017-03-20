import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase encargada de realizar los calculos necesarios para devolver los valores de tallas dados los datos contenidos en el archivo tratado en la 
 * clase Datos
 * @author Miguel Ángel Quintero 
 * @version 19/03/2017
 * 
 */
public class Calculos {
	/**Variables de la clase **/
	private double vs;
	private double s;
	private double m;
	private double l;
	private double vl;
	private LinkedList<Double> logaritmoNaturalLOC;
	private double promedioLN;
	private LinkedList<Double> lineasPorMetodo;
	private double desviacion;
	
	/**
	 * Metodo que obtiene la ruta del archivo y permite la invocación de los métodos de la clase Datos para obtener la cantidad de lineas 
	 * por método según los valores asignados
	 * @param ruta Ruta del archivo con los datos
	 */
	public void inicializar(String ruta){//Declaracion metodo
		Datos datos = new Datos();
		datos.obtenerListas(ruta);		
		LinkedList<Double> lineasPorClase = new LinkedList();
		LinkedList<Double> cantidadMetodos = new LinkedList();
		
		this.logaritmoNaturalLOC = new LinkedList();
		this.lineasPorMetodo = new LinkedList();
		
		lineasPorClase = datos.devolverLineasPorClase();
		cantidadMetodos = datos.devolverCantidadMetodos();
		double lineasPorMetodoTemp = 0;
		
		for (int i = 0; i < lineasPorClase.size(); i++) {
			lineasPorMetodoTemp = lineasPorClase.get(i) / cantidadMetodos.get(i);
			this.lineasPorMetodo.add(lineasPorMetodoTemp);
		}
		
		this.calcularLogaritmoPromedio();
		this.calcularDesviacion();
		this.calcularTallas();				
	}
	/**Fin del método **/
	
	/**
	 * Calcula el logaritmo natural para cada una de las líneas por método, teniendo en cuenta los datos de las clases ingresadas en el archivo 
	 */
	private void calcularLogaritmoPromedio(){//Declaracion metodo
		double logaritmoTemporal = 0;
		double suma = 0;
		for (int i = 0; i<this.lineasPorMetodo.size();i++){
			logaritmoTemporal = Math.log(this.lineasPorMetodo.get(i));
			this.logaritmoNaturalLOC.add(logaritmoTemporal);
			suma = suma + logaritmoTemporal;			
		}
		this.promedioLN  = suma / this.lineasPorMetodo.size();
	}
	/**Fin del método**/
	
	/**
	 * Calcula la desviacion estándar teniendo en cuenta el arreglo logaritmoNaturalLOC
	 */
	private void calcularDesviacion(){//Declaracion metodo
		double varianza = 0;
		double restaTemporal = 0;
		double numerador = 0;
		double denominador = this.logaritmoNaturalLOC.size() - 1;
		for (int i = 0; i<this.logaritmoNaturalLOC.size(); i++){
			restaTemporal = Math.pow((this.logaritmoNaturalLOC.get(i) - this.promedioLN), 2);
			numerador = numerador + restaTemporal;
		}
		
		varianza = numerador / denominador;
		this.desviacion = Math.sqrt(varianza);
	}
	/**Fin del método **/
	
	/**
	 * Calcula los rangos de tallas	
	 */
	private void calcularTallas(){//Declaracion metodo
		double rangoVS = this.promedioLN - (2 * this.desviacion);
		double rangoS = this.promedioLN - this.desviacion;
		double rangoM = this.promedioLN;
		double rangoL = this.promedioLN + this.desviacion;
		double rangoVL = this.promedioLN + (2 * this.desviacion);
		
		this.vs = Math.pow(Math.E, rangoVS);
		this.s = Math.pow(Math.E, rangoS);
		this.m = Math.pow(Math.E, rangoM);
		this.l = Math.pow(Math.E, rangoL);
		this.vl = Math.pow(Math.E, rangoVL);
	}
	/**Fin del método**/

	/**
	 * Devuelve el valor calculado del rango VS
	 * @return rango VS
	 */
	public double getVS(){//Declaracion metodo
		return this.vs;
	}
	/**Fin del método**/
	
	/**
	 * Devuelve el valor calculado del rango S
	 * @return rango S
	 */
	public double getS(){//Declaracion metodo
		return this.s;
	}
	/**Fin del método**/
	
	/**
	 * Devuelve el valor calculado del rango M
	 * @return rango M
	 */
	public double getM(){//Declaracion metodo
		return this.m;
	}
	/**Fin del método**/
	
	/**
	 * Devuelve el valor calculado del rango L
	 * @return rango L
	 */
	public double getL(){//Declaracion metodo
		return this.l;
	}
	/**Fin del método**/
	
	/**
	 * Devuelve el valor calculado del rango VL
	 * @return rango VL
	 */
	public double getVL(){//Declaracion metodo
		return this.vl;
	}
	/**Fin del método**/
}
