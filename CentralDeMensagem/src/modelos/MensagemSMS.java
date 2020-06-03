package modelos;

import javax.swing.JOptionPane;

import interfaces.Mensagem;

public class MensagemSMS implements Mensagem{

	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "SMS: "+mensagem);
	}
	
}
