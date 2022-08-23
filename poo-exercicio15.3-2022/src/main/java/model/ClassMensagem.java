package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassMensagem {
	
	public static String mensagem(double valorConvertido) {
		BigDecimal bd = new BigDecimal(valorConvertido).setScale(4, RoundingMode.HALF_EVEN);
		return "Valor convertido: "+Double.toString(bd.doubleValue());
	}

}
