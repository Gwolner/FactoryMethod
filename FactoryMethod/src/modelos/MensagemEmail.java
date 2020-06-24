package modelos;

import javax.swing.JOptionPane;

import interfaces.Mensagem;

public class MensagemEmail implements Mensagem{
	
	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "E-mail: "+mensagem);
	}
}
