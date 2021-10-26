package arrayunidimensional;

public class CopiaArray {

	public static void main(String[] args) {
		int[] arrayA = {20,43,51};
		int[] arrayB = new int[3];
		
		
		for (int i=0; i<arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}
		
		for (int i=0; i<arrayB.length; i++) {
			System.out.println(arrayB[i]);
		}

	}

}
