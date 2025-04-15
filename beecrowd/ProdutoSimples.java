package beecrowd;

import java.util.Scanner;


public class ProdutoSimples {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int multplicar = valor1 * valor2 ;		
		System.out.println("PROD = " + multplicar);
		
		sc.close();	
		
	}

}
