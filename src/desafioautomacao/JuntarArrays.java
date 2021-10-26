package desafioautomacao;

import java.util.Arrays;

public class JuntarArrays {

	public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4 };
        int[] array2 = new int[] { 5, 6, 7, 8 };
        int[] juntararrays = new int[8];



        for (int i = 0; i < array1.length; i++) {
            juntararrays[i] = array1[i];
        }

        for (int i = 4; i < juntararrays.length; i++) {
            juntararrays[i] = array2[i - 4];
        }
        
        System.out.println(Arrays.toString(juntararrays));
    }
}
	

	

