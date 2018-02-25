package rabaty;

import konfiguracja.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

	double procent = Konfiguracja.getInstancja().getProcentRabatu();
	
	@Override
	public double obliczCenePoRabacie(double cena) {
		cena = cena - Math.abs(this.procent*cena/100);
		return cena;
	}

}
