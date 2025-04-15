package beecrowd;

import java.util.Scanner;

public class DividindoXY {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			int x = entrada.nextInt();
			int y = entrada.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double resultado = (double) x/(y);
				System.out.println("Resultado = " + resultado);
			}

		}
		entrada.close();
	}

}
