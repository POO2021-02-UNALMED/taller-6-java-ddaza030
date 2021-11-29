package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais = new Pais();
	private int cantidadAutos = 0;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
		fabricantes.add(this);
	}
	
	public Fabricante() {
		
	}
	
	public void addAutos() {
		cantidadAutos++;
		pais.addAutos();
	}
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(Fabricante fab: fabricantes) {
			lista.add(fab.cantidadAutos);
		}
		int maximo = Collections.max(lista);
		int posicion = lista.indexOf(maximo);
		return fabricantes.get(posicion);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
