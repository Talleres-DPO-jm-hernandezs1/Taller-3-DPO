package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

		private String fecha;
		private Ruta ruta;
		private Avion avion;
		private List<Tiquete> tiquetes;
		private boolean realizado;
		
		public Vuelo( Ruta ruta, String fecha, Avion avion) {
			this.ruta = ruta;
			this.fecha = fecha;
			this.avion = avion;
			this.tiquetes = new ArrayList<>();
			this.realizado= false;
			
			
		}

		/**
		 * @param realizado the realizado to set
		 */
		public void setRealizado(boolean realizado) {
			this.realizado = realizado;
		}

		/**
		 * @return the tiquetes
		 */
		public List<Tiquete> getTiquetes() {
			return tiquetes;
		}

		/**
		 * @return the realizado
		 */
		public boolean isRealizado() {
			return realizado;
		}

		/**
		 * @return the fecha
		 */
		public String getFecha() {
			return fecha;
		}

		/**
		 * @return the ruta
		 */
		public Ruta getRuta() {
			return ruta;
		}

		/**
		 * @return the avion
		 */
		public Avion getAvion() {
			return avion;
		}
}
