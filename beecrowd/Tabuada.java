package beecrowd;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número para visualizar a tabuada: ");
		int n = sc.nextInt();
		int i = 1;
		System.out.println("Tabuada de " + n);

		for (i = 1; i <= 10; i++) {

			int operacao = i * n;

			System.out.println(i + " x " + n + " = " + operacao );

		}
		sc.close();

	}
}
