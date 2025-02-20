package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private Aeropuerto origen;
	private Aeropuerto destino;
	private String horaSalida;
	private String horaLlegada; 
	private String codigoRuta;

	public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
		this.origen = origen;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
	}
    /**
	 * @return the horaLlegada
	 */
	public String getHoraLlegada() {
		return horaLlegada;
	}
	/**
	 * @return the codigoRuta
	 */
	public String getCodigoRuta() {
		return codigoRuta;
	}
	/**
	 * @return the origen
	 */
	public Aeropuerto getOrigen() {
		return origen;
	}
	/**
	 * @return the destino
	 */
	public Aeropuerto getDestino() {
		return destino;
	}
	/**
	 * @return the horaSalida
	 */
	public String getHoraSalida() {
		return horaSalida;
	}
	public double getDistancia() {
		return Aeropuerto.calcularDistancia(origen, destino);
	}
	
	public int getDuracion() {
		int horaSalidaint = getHoras(horaSalida) * 60 + getMinutos(horaSalida);
		int horaLlegadaint = getHoras(horaLlegada) * 60 + getMinutos(horaLlegada);
		
		if (horaLlegadaint < horaSalidaint) {
			horaLlegadaint += 24 *60; 
		}
		return horaLlegadaint - horaSalidaint;
	}
	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
