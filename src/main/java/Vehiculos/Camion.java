package vehiculos;

public class Camion extends Vehiculo{
	public int ejes;
	public static int cantCamion;
	
	public Camion(String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X",fabricante);
		this.ejes=ejes;
		cantCamion+=1;
	}
	
	public int getejes() {
		return ejes;
	}
	
	public void setejes(int ejes) {
		this.ejes=ejes;
	}
	
	public int getcantidadCamiones() {
		return cantCamion;
	}
}
