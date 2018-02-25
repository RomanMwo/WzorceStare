package rabaty;

import konfiguracja.Konfiguracja;

public class ObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {

double kwotaRabatu = Konfiguracja.getInstancja().getKwotaRabatu();	
	
	@Override
	public double obliczCenePoRabacie(double cena) {
		cena = Math.abs(cena- kwotaRabatu);
		return cena;
	}

}
