package vehiculos;
import java.util.*;

public class Fabricante  {
	public String nombre;
	public Pais pais;
	static ArrayList <Fabricante> fabrica=new ArrayList <Fabricante>();
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int c=0;
		int m=0;
		Fabricante fabricante=null;
		for (int i=0; i<fabrica.size();i++) {
			for (int j=0; j<fabrica.size();j++) {
				if(fabrica.get(i)==fabrica.get(j)) {
					c++;
				}
			}
			if (c>m) {
				m=c;
				fabricante=fabrica.get(i);
			}
			c=0;
		}
		return fabricante;
		
	}
}
