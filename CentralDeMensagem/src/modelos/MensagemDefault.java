package modelos;

import javax.swing.JOptionPane;

import interfaces.Mensagem;

public class MensagemDefault implements Mensagem{
	
	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "Default: "+mensagem);
	}
}