package konfiguracja;

import rabaty.IObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieKwotowym;
import rabaty.ObliczCenePoRabacieProcentowym;


public class Konfiguracja {
	
	private static Konfiguracja instancja = new Konfiguracja();
	//private IObliczCenePoRabacie rabat; 
	
	private Konfiguracja(){
		
       // rabat = new ObliczCenePoRabacieKwotowym();		
	}
	
	public static Konfiguracja getInstancja(){
		return instancja; 
	}

	public IObliczCenePoRabacie getLiczarkaRabatu() {
		return new ObliczCenePoRabacieProcentowym();
	}
	
	public double getKwotaRabatu() {
		return 1.0;
	}
	
	public double getProcentRabatu() {
		return 10.0;
	}
	
	
}
