package rabaty;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		cena = Math.abs(70*cena/100);
		return 0;
	}

}
