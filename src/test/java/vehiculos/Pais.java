package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String nombre;
	private int cantidadAutos = 0;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String pais) {
		this.nombre = pais;
		paises.add(this);
	}
	public void addAutos() {
		cantidadAutos++;
	}
	public Pais() {
		
	}
	
	public static Pais paisMasVendedor() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(Pais pais: paises) {
			lista.add(pais.cantidadAutos);
		}
		int maximo = Collections.max(lista);
		int posicion = lista.indexOf(maximo);
		return paises.get(posicion);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pais) {
		this.nombre = pais;
	}
	
}
