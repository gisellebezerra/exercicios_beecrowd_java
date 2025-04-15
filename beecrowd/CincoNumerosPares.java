package beecrowd;

import java.util.Scanner;

public class CincoNumerosPares {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeros;
		int cont = 0;

		for (int i = 0; i < 5; i++) {
			numeros = sc.nextInt();
			if (numeros % 2 == 0)
				cont++;
		}
		System.out.println(cont + " valores pares");
		sc.close();
	}

}