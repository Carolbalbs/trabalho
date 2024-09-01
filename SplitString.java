package trabalho;

public class SplitString {
	public static String separarStrings(Parametros entrada, String entradaCompleta) {
		String comando = entradaCompleta.substring(0, 3);
		
		if (entradaCompleta.length() >= 7) {
			String temp1 = entradaCompleta.substring(4, 7);
			entrada.setCodigoUm(temp1);
		}
		
		if (entradaCompleta.length() == 11) {
			String temp2 = entradaCompleta.substring(8, 11);
			entrada.setCodigoDois(temp2);
		}
		
		return comando;
	}
}
