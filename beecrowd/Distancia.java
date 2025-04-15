package beecrowd;

import java.util.Scanner;

public class Distancia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int km = sc.nextInt();
		
		int calculo = km * 2;
		
		System.out.println(calculo + " minutos");
		sc.close();
	}
}
