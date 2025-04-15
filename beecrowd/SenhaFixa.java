package beecrowd;

import java.util.Scanner;

public class SenhaFixa {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int senhaValida = 2002;
	
		while (true) {
			System.out.print("Digite a senha:");
			int senha = entrada.nextInt();
			if (senha == senhaValida) {
				System.out.println("Acesso Permitido!");
				break;
			} else {
				System.out.println("Senha Invalida");
			}
		}
		entrada.close();
	}

}
