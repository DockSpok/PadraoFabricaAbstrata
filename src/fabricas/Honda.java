package fabricas;

import entidade.CBX;
import entidade.Moto;

public class Honda extends Fabrica {
	public Honda () {
		nome = "Fábrica da Honda (São José dos Campos - SP)";
	}
	
	public Moto getMoto(String marca) {
		if(marca == null) {
			return null;
		} else if (marca.equalsIgnoreCase("CBX")) {
			return new CBX();
		} else 
			return null;
	}
}
