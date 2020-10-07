package vehiculos;

public class Camioneta extends Vehiculo {
	public boolean volco;
	public static int cantCamioneta;
	
	public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco=volco;
		cantCamioneta+=1;
	}
	
	public int getCamioneta() {
		return cantCamioneta;
	}
	public void setCamioneta(boolean volco) {
		this.volco=volco;
	}
	public void setVolco(boolean volco) {
		this.volco=volco;
	}
	
}
