package vehiculos;

public class Camioneta extends Vehiculo {
	private Boolean volco;
	private static int cantidadCamionetas = 0;
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,Boolean volco) {
		// velocidad maxima y tracci�n
		super(placa,puertas, 90,nombre,precio,peso, "4X4",fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	public Boolean isVolco() {
		return volco;
	}

	public void setVolco(Boolean volco) {
		this.volco = volco;
	}
	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}
	
}
