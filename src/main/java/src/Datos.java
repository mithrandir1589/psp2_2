import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

import javax.swing.JOptionPane;

/**
 * 
 * Clase encargada de la manipulación de los datos, lee el archivo .txt cargado y almacena los datos leídos
 * en una lista
 * @author Miguel Ángel Quintero P.
 * @version 05/03/2017
 * 
 * **/

public class Datos {
	/**Variables de la clase**/
	private LinkedList<Double> lineasPorClase = new LinkedList();
	private LinkedList<Double> cantidadDeMetodos = new LinkedList();
	
	/**
	 * @param ruta. String con la ruta del archivo con la lista de números x e y. 
	 * Metodo que crea las listas de números teniendo en cuenta la ruta recibida.
	 *
	 * **/
	public void obtenerListas(String ruta){//Declaracion metodo
		try {
			BufferedReader bf = new BufferedReader(new FileReader(ruta));
			LinkedList<Double> listaTemporalLPC = new LinkedList();
			LinkedList<Double> listaTemporalCM = new LinkedList();
			String lineaLeida; 
			double lineasPorClaseTemporal;
			double cantidadDeMetodosTemporal;
			String datosTemporal [];
			while ((lineaLeida = bf.readLine()) != null) {
				datosTemporal = lineaLeida.split(",");				
				lineasPorClaseTemporal = Double.parseDouble(datosTemporal[1]);
				
				if(datosTemporal.length == 3){
					cantidadDeMetodosTemporal = Double.parseDouble(datosTemporal[2]);
				}else{
					cantidadDeMetodosTemporal = 1;
				}
				
				listaTemporalLPC.add(lineasPorClaseTemporal);
				listaTemporalCM.add(cantidadDeMetodosTemporal);
			}
			this.lineasPorClase = listaTemporalLPC;
			this.cantidadDeMetodos = listaTemporalCM;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error leyendo la ruta del archivo. Verifique que la ruta ingresada "
					+ "exista o que campo de la ruta no esté vacío");
			System.exit(0);
		}
		
	}
	
	/**
	 * Metodo que retorna la lista de números X
	 * @return lista de númerosX
	 * **/
	public LinkedList<Double> devolverLineasPorClase(){//Declaracion metodo
		return this.lineasPorClase;
	}
	
	/**
	 * Metodo que retorna la lista de números Y
	 * @return lista de númerosY
	 * **/
	public LinkedList<Double> devolverCantidadMetodos(){//Declaracion metodo
		return this.cantidadDeMetodos;
	}
}