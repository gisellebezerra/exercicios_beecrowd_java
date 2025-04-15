package beecrowd;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int i = 0;

		for (i = 0; i < 6; i++) {

			double numero = sc.nextDouble();
			if (numero > 0) {

				cont++;

			}
			sc.close();

		}
		System.out.println(cont + " valores positivos");
	}
	
	
}

//		double[] numeros =  {-7, -5, 6, -3.4, 4.6, 12}; 
//		
//		int contador = 0;
//		
//		for(int i = 0; i < numeros.length; i++) {
//			
//			if(numeros[i] > 0) {
//				
//				contador = contador + 1;
//			}
//		}
//		System.out.println(contador + " valores positivos");