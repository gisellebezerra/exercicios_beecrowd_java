package beecrowd;

import java.util.Scanner;

public class Lanche {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
						
		int codigo = sc.nextInt();
		
		double[] produtos = new double[] {4.0, 4.5, 5.0, 2.0, 1.5};
		
		
		int qtd = sc.nextInt();
		
		System.out.println(produtos);
		double preco = produtos[codigo - 1]* qtd;
		
		System.out.println("Total: "+ "R$ " + String.format("%.2f", preco));		
		
		sc.close();
		
	}
	
}
