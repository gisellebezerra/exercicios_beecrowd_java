package beecrowd;

import java.util.Scanner;

public class CrescenteDec {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (true) {

			int x = entrada.nextInt();
			int y = entrada.nextInt();
			
			if (x == y) {
				break;
			} else if (x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
		}
		entrada.close();
	}

}
