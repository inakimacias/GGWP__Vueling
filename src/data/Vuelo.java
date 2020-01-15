package data;

public class Vuelo {
	
	String id_vuelo;
	String aerolinea;
	String fechaS;
	String fechaLL;
	String origen;
	String destino;
	int plazas;
	int precio;
	
	


	public Vuelo(String id_vuelo, String aerolinea, String fechaS, String fechaLL, String origen, String destino,
			int plazas, int precio) {
		super();
		this.id_vuelo = id_vuelo;
		this.aerolinea = aerolinea;
		this.fechaS = fechaS;
		this.fechaLL = fechaLL;
		this.origen = origen;
		this.destino = destino;
		this.plazas = plazas;
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	
	public String getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(String id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	
	public String getFechaS() {
		return fechaS;
	}
	
	public void setFechaS(String fechaS) {
		this.fechaS = fechaS;
	}

	
	public String getFechaLL() {
		return fechaLL;
	}

	public void setFechaLL(String fechaLL) {
		this.fechaLL = fechaLL;
	}

	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

	
	
	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return id_vuelo + ";" + aerolinea + ";" + fechaS + ";"+ fechaLL + ";" + origen + ";" + destino + ";" + plazas + ";" + precio;
	}

	
	
	
	
	

}
