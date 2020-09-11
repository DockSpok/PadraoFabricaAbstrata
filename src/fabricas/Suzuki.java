package fabricas;

import entidade.DRZ;
import entidade.Moto;

public class Suzuki extends Fabrica{
	public Suzuki () {
		nome = "Fábrica da Suzuki (Ribeirão Preto - SP)";
	}
	
	public Moto getMoto(String marca) {
		if (marca == null) {
			return null;
		} else if (marca.equalsIgnoreCase("DRZ")) {
			return new DRZ();
		} else 
			return null;
	}
}
