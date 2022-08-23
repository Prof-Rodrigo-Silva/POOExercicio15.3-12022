package model;

public class ClassConversor {
	
	public static double conversor(double valor, int item) {
		switch(item) {
		case 0:
			valor = valor / 5.12;
			break;
		case 1:
			valor = valor / 5.10;
			break;
		case 2:
			valor = valor / 0.037;
			break;
		}
		return valor;
	}

}
