package beecrowd;

import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		double consumo = x/y;
		
		System.out.println(String.format("%.3f",consumo) + " km/l");
		
		sc.close();
	}
}
