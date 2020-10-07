package vehiculos;

import java.util.*;
public class Pais {
	public String nombre;
	static ArrayList <Pais> listaPaises = new ArrayList <Pais>();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		listaPaises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		int c=0;
		int m=0;
		Pais pais = null;
		for (int i=0; i<listaPaises.size();i++) {
			for (int j=0; j<listaPaises.size();j++) {
				if(listaPaises.get(i)==listaPaises.get(j)) {
					c++;
				}
			}
			if (c>m) {
				m=c;
				pais=listaPaises.get(i);
			}
			c=0;
		}
		return pais;
		
	}
	
}
