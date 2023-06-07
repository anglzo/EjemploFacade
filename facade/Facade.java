/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.facade;
import com.mycompany.hotel.Hotel;
import com.mycompany.hotel.Vuelo;

/**
 *
 * @author ANGEL
 */
public class Facade {

	private Vuelo vueloNuevo;
	private Hotel hotelNuevo;	
	
	public Facade() {
		vueloNuevo = new Vuelo();
		hotelNuevo = new Hotel();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		vueloNuevo.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelNuevo.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}		
}