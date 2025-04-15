package beecrowd;

import java.util.Scanner;

public class ParesImparesPositivosNegativos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contPar = 0;
		int contImpar = 0;
		int contPositivos = 0;
		int contNegativos = 0;
		int numero;
		
		for (int i = 0; i < 5; i++) {
			numero = sc.nextInt();
			if (numero % 2 == 0)
				contPar++;
			else
				contImpar++;
			if (numero > 0)
				contPositivos++;
			else if (numero < 0)
				contNegativos++;
		}
		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPositivos + " valor(es) positivo(s)");
		System.out.println(contNegativos + " valor(es) negativo(s)");
		
		sc.close();
	}

}
