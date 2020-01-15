package services;

import java.util.ArrayList;
import java.util.List;

import dao.DataAccessObject;
import data.Vuelo;

public class VuelingService {

	public static VuelingService instance = null;
	
	public static VuelingService getInstance(){
		if( instance == null){
			instance = new VuelingService();
		}
		return instance;
	}
	
	public VuelingService(){}
	
	public synchronized String buscarVuelo(String origen, String destino){
		System.out.println(" - ValidationService - Attempting to search flights");
		List<Vuelo> vuelos = new ArrayList<>();
		vuelos = DataAccessObject.getInstance().getListaVuelos(origen,destino);
		
		return vuelos.toString();
	}
	
	
	public String reservarVuelo(String v, int p){
		System.out.println(" - ValidationService - Attempting to book flight");
		List<Vuelo> vuelos = new ArrayList<>();
		vuelos = DataAccessObject.getInstance().getListaVuelos();
		int i = 0;		
		while(!(vuelos.get(i).getId_vuelo().equals(v))){
			i++;
		}
		vuelos.get(i).setPlazas(vuelos.get(i).getPlazas()-p);
		DataAccessObject.getInstance().setListaVuelos(vuelos);
		return "Vuelo "+v+" reservado con exito";
	}
}
