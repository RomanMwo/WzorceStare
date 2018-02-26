package rabaty;
//dd
import rabatlosowy.LosowyRabat;

public class AdapterPoKlasie extends LosowyRabat implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		
		return cena - losujRabat();
	}

}
