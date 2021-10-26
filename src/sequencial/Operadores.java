package sequencial;

public class Operadores {

	public static void main(String[] args) {
		int a=2, b=9, c=1, y=6, resultadoInt;
		double resultadoReal;
		boolean resultado;
		boolean b1 = true;
		
		resultadoInt = b%a;
		System.out.println("ResultadoInt= " + resultadoInt);

		resultadoReal = (double) 9/a;
		System.out.println("ResultadoReal= " + resultadoReal);
		
		resultado = (!(b>a) && b1) || ((c<y) && (b!=2));
		System.out.println("resultado = " + resultado);
		
	}

}