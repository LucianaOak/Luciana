package br.com;

import java.util.Random;

public class CPF {
	public static void main(String[] args) {
		Random random = new Random();

		Integer n1 = random.nextInt(10);
		Integer n2 = random.nextInt(10);
		Integer n3 = random.nextInt(10);
		Integer n4 = random.nextInt(10);
		Integer n5 = random.nextInt(10);
		Integer n6 = random.nextInt(10);
		Integer n7 = random.nextInt(10);
		Integer n8 = random.nextInt(10);
		Integer n9 = random.nextInt(10);
		

		Integer d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
		d1 = d1 % 11;
		if (d1 >= 10)
			d1 = 0;

		Integer d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
		d2 = d2 % 11;
		if (d2 >= 10)
			d2 = 0;

		String cpfgerado2 = String.format("%s%s%s.%s%s%s.%s%s%s-%s%s", n1,n2,n3,n4,n5,n6,n7,n8,n9,d1,d2);
		System.out.println(cpfgerado2);
		

	}
}
