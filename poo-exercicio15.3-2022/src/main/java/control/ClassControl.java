package control;

import model.ClassConversor;
import model.ClassMensagem;

public class ClassControl {
	
	public static Double converter(double valor, int item) {
		return ClassConversor.conversor(valor, item);
		
	}
	public static String mensagem(double valorConvertido) {
		return ClassMensagem.mensagem(valorConvertido);
	}

}
