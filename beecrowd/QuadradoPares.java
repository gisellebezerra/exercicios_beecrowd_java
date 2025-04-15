package beecrowd;

import java.util.Scanner;

public class QuadradoPares {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i;
		
		for(i = 2; i <= n; i = i+2) {
			
			int operacao = i * i;
			System.out.println(i +"^2 = " + operacao);
			sc.close();
		}

		
	}

}
