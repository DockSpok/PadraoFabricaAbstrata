package aplicacao;

import javax.swing.JOptionPane;
import entidade.Moto;
import fabricas.Fabrica;

public class VerificarFabricaAbstrata {
	public static void main(String[] args) {
		while(true) {
			String nomeFabrica = JOptionPane.showInputDialog("Nome do fabricante: ");
			Fabrica fab = Fabrica.getInstance(nomeFabrica);
			if (fab == null) {
				JOptionPane.showMessageDialog(null, "*** FÁBRICA NÃO EXISTE NOS REGISTROS ***");
				break;
			}
			String nomeMoto = JOptionPane.showInputDialog("Nome (classe) da moto: ");
			Moto moto = fab.getMoto(nomeMoto);
			if (moto != null) {
				JOptionPane.showMessageDialog(null
						, "Fabricante: " + fab.getNome() + "\n"
						+ "---------------------------------\n"
						+ "Nome: " + moto.getNome() + "\n"
						+ "Cor: " + moto.getCor() + "\n"
						+ "Cilindrada: " + moto.getCilindrada() + "\n"
						+ "Valor: " + moto.getValor() + "\n"
						);
			} else
				JOptionPane.showConfirmDialog(null, "***A MOTO NÃO EXISTE PARA ESSA FÁBRICA***");
		}
	}
}
