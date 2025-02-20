package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Iterator;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente {

	public static final String NATURAL = "natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return nombre;
	}
	
	public String getTipoCliente() {
		return NATURAL;
	}

	@Override
	public Iterator<Tiquete> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
