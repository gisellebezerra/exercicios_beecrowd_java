package beecrowd;

import java.util.Scanner;

public class MediasPonderadas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i;
		double n = sc.nextDouble();

		for (i = 0; i < n; i++) {

			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double media = ((n * 2) + (n2 * 3) + (n3 * 5)) / 10;
			System.out.println(String.format("%.1f", media));
			sc.close();

		}
	}

}
