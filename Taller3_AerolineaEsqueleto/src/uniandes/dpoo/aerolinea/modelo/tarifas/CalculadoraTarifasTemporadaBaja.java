package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	
	protected static final int COSTO_POR_KM_NATURAL = 600;
	protected static final int COSTO_POR_KM_CORPORATIVO = 900;
	protected static final double DESCUENTO_PEQ = 0.02;
	protected static final double DESCUENTO_MEDIANAS = 0.1;
	protected static final double DESCUENTO_GRANDES = 0.2;
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		int distancia = calcularDistanciaVuelo(vuelo.getRuta());
		
			if (cliente instanceof ClienteCorporativo) {
				return distancia * COSTO_POR_KM_CORPORATIVO;
			}
			else {
				return distancia * COSTO_POR_KM_NATURAL;
			}
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
		double descuento = 0.0;
		
		if (cliente instanceof ClienteCorporativo) {
			ClienteCorporativo corp = (ClienteCorporativo) cliente;
			int tamano = corp.getTamanoEmpresa();
			
			if (tamano == 1) {
				descuento = DESCUENTO_PEQ;
			}
			else if (tamano == 2) {
				descuento = DESCUENTO_MEDIANAS;
			}
			else if (tamano == 3) {
				descuento = DESCUENTO_GRANDES;
			}
					
		
		}
		return descuento;
	}
	
}
