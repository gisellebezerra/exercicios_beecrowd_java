package beecrowd;
import java.util.Scanner;

public class CombustivelGasto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		final double KMHORA = 12.0;
		int velocidademedia = sc.nextInt();
		
		double distpercorrida = velocidademedia / KMHORA;
		
		
		System.out.println(String.format("%.5f", distpercorrida));
		
		int tempo = sc.nextInt();
		double combustivelgasto = distpercorrida * tempo;
		
		System.out.println(String.format("%.3f", combustivelgasto));
		
		sc.close();		
		
		
	}

}
