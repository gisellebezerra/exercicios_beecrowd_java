package beecrowd;
import java.util.Scanner;

public class CoversaoDoTempo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	
		int horas = n / 3600;
		int minutos = (n % 3600) / 60;
		int segundos = (n % 3600) % 60;
		
		
        System.out.println(horas + ":" + minutos + ":" + segundos);
        // System.out.println(horas + ":");
		
        sc.close();
		
		
	}
}
