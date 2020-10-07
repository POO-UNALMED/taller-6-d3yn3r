package vehiculos;

public class Vehiculo {
	public String placa;
	public int puertas;
	public int velocidadMaxima;
	public String nombre;
	public int precio;
	public int peso;
	public String traccion;
	public Fabricante fabricante;
	
	public static int cantVehiculos;
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante frabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=frabricante;
		cantVehiculos+=1;
	}
	
	public static int getCantidadVehiculos() {
		return cantVehiculos;
	}
	public static void setCantidadVehiculos(int cantidad) {
		cantVehiculos=cantidad;
	}
	
	public void vehiculosPorTipo() {
		System.out.println("Automoviles: "+Automovil.cantAuto);
		System.out.println("Camionetas: "+Camioneta.cantCamioneta);
		System.out.println("Camiones: "+Camion.cantCamion);
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}
