package vehiculos;

public class Automovil extends Vehiculo{
	public int puestos;
	public static int cantAuto;
	
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		cantAuto+=1;
	}
	
	 public int getPuestos() {
		 return puestos;
	 }
	 public void setPuestos(int puestos) {
		 this.puestos=puestos;
	 }
	 
	 public int setAutomoviles() {
			return cantAuto;
		}
	 
	
}