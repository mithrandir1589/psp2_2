import javax.swing.JOptionPane;
/**
 * Clase encargada de construir y mostrar la interfaz de la aplicación. 
 * @author Miguel Ángel Quintero
 * @version 20/03/2017 
 *
 */
public class Interfaz {
	/**
	 * Se utiliza para mostrar el mensaje que pide la ruta dle archivo y muestra el resultado en consola
	 * @param args
	 */
	public static void main(String[] args) {//Declaracion metodo
		Calculos calculos = new Calculos();
		String rutaArchivo = JOptionPane.showInputDialog("Ingrese la ruta del archivo");
		
		if(rutaArchivo == null || rutaArchivo.isEmpty()){
			JOptionPane.showMessageDialog(null, "Debe ingresar una ruta en el campo de texto");
			System.exit(0);
		}
		
		calculos.inicializar(rutaArchivo);
		
		System.out.println("VS= " + calculos.getVS() + " | S= " + calculos.getS() + " | M= " + calculos.getM() + " | L= " + calculos.getL() + " | VL= " + calculos.getVL() );

	}
	/**Fin del método**/
}
