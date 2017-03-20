import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class Pruebas {

	@Test
	public void devolverLineasPorClase() {
		Datos datos = new Datos();
		datos.obtenerListas("C:\\prueba.txt");
		LinkedList<Double> listaPruebaLOC = new LinkedList();
		
		listaPruebaLOC.add((double)18);
		listaPruebaLOC.add((double)18);
		listaPruebaLOC.add((double)25);
		listaPruebaLOC.add((double)31);
		listaPruebaLOC.add((double)37);
		listaPruebaLOC.add((double)82);
		listaPruebaLOC.add((double)82);
		listaPruebaLOC.add((double)87);
		listaPruebaLOC.add((double)89);
		listaPruebaLOC.add((double)230);
		listaPruebaLOC.add((double)85);
		listaPruebaLOC.add((double)87);
		listaPruebaLOC.add((double)558);
		
		assertEquals(listaPruebaLOC, datos.devolverLineasPorClase());
	}
	
	@Test
	public void devolverCantidadMetodos() {
		Datos datos = new Datos();
		datos.obtenerListas("C:\\prueba.txt");
		LinkedList<Double> listaPruebaCantidadMetodos = new LinkedList();
		
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)5);
		listaPruebaCantidadMetodos.add((double)4);
		listaPruebaCantidadMetodos.add((double)4);
		listaPruebaCantidadMetodos.add((double)4);
		listaPruebaCantidadMetodos.add((double)10);
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)3);
		listaPruebaCantidadMetodos.add((double)10);
		
		assertEquals(listaPruebaCantidadMetodos, datos.devolverCantidadMetodos());
	}
	
	/**
	 * Debido a que los métodos de la clase Calculos encargados de realizar calculos de promedio, desviación, entre otros, son privados
	 * y no retornan ningun valor, se hará la prueba indirecta a estos por medio de la prueba de los métodos getVS, getS, getM, getL, getVL, ya que 
	 * los valores devueltos por estos se obtuvieron haciendo uso de los valores calculados por el resto de métodos
	 */
	@Test
	public void pruebaGetVS(){
		Calculos calculos = new Calculos(); 
		calculos.inicializar("C:\\prueba2.txt");
		assertEquals(6.3375, calculos.getVS(),0.0001);
	}
	
	@Test
	public void pruebaGetS(){
		Calculos calculos = new Calculos(); 
		calculos.inicializar("C:\\prueba2.txt");
		assertEquals(8.4393, calculos.getS(),0.0001);
	}
	
	@Test
	public void pruebaGetM(){
		Calculos calculos = new Calculos(); 
		calculos.inicializar("C:\\prueba2.txt");
		assertEquals(11.2381, calculos.getM(),0.0001);
	}
	
	@Test
	public void pruebaGetL(){
		Calculos calculos = new Calculos(); 
		calculos.inicializar("C:\\prueba2.txt");
		assertEquals(14.9650, calculos.getL(),0.0001);
	}
	
	@Test
	public void pruebaGetVL(){
		Calculos calculos = new Calculos(); 
		calculos.inicializar("C:\\prueba2.txt");
		assertEquals(19.9280, calculos.getVL(),0.0001);
	}
	
}
