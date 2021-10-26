package arrayunidimensional;

public class ForEach {

	public static void main(String[] args) {
		int[] valores = {1, 30, 21, 40};
		for(int i=0; i<valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		System.out.println();
		
		for (int elemento: valores) {
			System.out.println(elemento);
		}
	}

}
