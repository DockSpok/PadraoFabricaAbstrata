package fabricas;

import entidade.Moto;

public abstract class Fabrica {
	protected String nome;
	
	public abstract Moto getMoto(String marca);
	
	public static Fabrica getInstance(String fabrica) {
		if (fabrica.equalsIgnoreCase("Honda")) {
			return new Honda();
		}
		else if (fabrica.equalsIgnoreCase("Yamaha")) {
			return new Yamaha();
		}
		else if (fabrica.equalsIgnoreCase("Suzuki")) {
			return new Suzuki();
		}
		else return null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
