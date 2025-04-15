package beecrowd;

import java.util.Scanner;

public class ValidacaoNota {
	public static void main(String[] args) {

		
	     Scanner scanner = new Scanner(System.in);
	        double nota1 = -1, nota2 = -1;
	        
	        while (nota1 == -1 || nota2 == -1) {
	            double nota = scanner.nextDouble();
	            
	            if (nota >= 0 && nota <= 10) {
	                if (nota1 == -1) {
	                    nota1 = nota;
	                } else {
	                    nota2 = nota;
	                }
	            } else {
	                System.out.println("nota invalida");
	            }
	        }
	        
	        double media = (nota1 + nota2) / 2;
	        System.out.printf("media = %.2f\n", media);
	        scanner.close();

	}

}
