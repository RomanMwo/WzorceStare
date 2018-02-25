package rabaty;

public class ObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		cena = Math.abs(cena-70);
		return cena;
	}

}
