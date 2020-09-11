package fabricas;

import entidade.XTZ;
import entidade.Moto;

public class Yamaha extends Fabrica{
	public Yamaha () {
		nome = "Fábrica da Yamaha (São Bernardo do Campo - SP)";
	}
	
	public Moto getMoto(String marca) {
		if (marca == null) {
			return null;
		} else if (marca.equalsIgnoreCase("XTZ")) {
			return new XTZ();
		} else 
			return null;
	}
}

