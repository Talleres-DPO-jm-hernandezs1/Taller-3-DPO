package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	protected int COSTO_POR_KM = 1000;
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		int distancia = calcularDistanciaVuelo(vuelo.getRuta());
		
		return distancia * COSTO_POR_KM;
		
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
		double descuento = 0.0;
		
		if (cliente instanceof ClienteCorporativo) {
			ClienteCorporativo corp = (ClienteCorporativo) cliente;
			int tamano = corp.getTamanoEmpresa();
			
			if (tamano == 1) {
				descuento = 0.02;
			}
			else if (tamano == 2) {
				descuento = 0.1;
			}
			else if (tamano == 3) {
				descuento = 0.2;
			}
					
		
		}
		return descuento;
	}
	
}
