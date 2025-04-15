package beecrowd;

public class SequenciaIjUm {
	public static void main(String[] args) {
		
		int i = 1; // Inicializa I com 1
        int j = 60; // Inicializa J com 60
        
        // Laço que vai até J ser 0
        while (j >= 0) {
            // Imprime o valor de I e J
            System.out.println("I=" + i + " J=" + j);
            
            // Atualiza I e J para a próxima iteração
            i += 3; // I aumenta 3
            j -= 5; // J diminui 5
        }
		
		
	}
	
	

}
