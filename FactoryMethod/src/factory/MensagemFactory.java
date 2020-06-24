package factory;

import interfaces.Mensagem;
import modelos.MensagemDefault;
import modelos.MensagemEmail;
import modelos.MensagemSMS;

public class MensagemFactory {
	
	public static Mensagem getMensagem(String tipoDeMensagem) {
		if(tipoDeMensagem == "sms") {
			return new MensagemSMS();
		}else if(tipoDeMensagem == "email") {
			return new MensagemEmail();
		}else {
			return new MensagemDefault();
		}
	}
}
