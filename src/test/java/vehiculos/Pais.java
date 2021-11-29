package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String pais;
	private int cantidadAutos = 0;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String pais) {
		this.pais = pais;
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
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
