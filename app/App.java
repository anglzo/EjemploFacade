
package com.mycompany.app;
import com.mycompany.facade.Facade;
/**
 *
 * @author ANGEL
 */
public class App {
	
	public static void main(String[] args) {
		Facade cliente1 = new Facade();
		cliente1.buscar("02/07/2023", "08/07/2023", "Bogotá", "Panamá");
		
		Facade cliente2 = new Facade();
		cliente2.buscar("02/07/2023", "08/07/2023", "Bogotá", "Quito");
	}

}