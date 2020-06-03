package main;

import javax.swing.JOptionPane;

import factory.MensagemFactory;
import interfaces.Mensagem;

public class CentralDeMensagem {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = MensagemFactory.getMensagem("sms");
		mensagem.enviar(texto);
	}

}
