

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i; // i serão os índices do vetor
		int v[] = new int[10]; // declaração de um vetor em Java
		System.out.println("Vetor v, de 6 elementos...");
		System.out.println("Leitura do vetor V: ");
		for(i=0;i<v.length;i++) {
			System.out.println("Digite v["+i+"]:");
			v[i] = ent.nextInt(); // Leitura via nextInt

		}
		System.out.println("\n\nVetor original: ");
		for(i=0;i<v.length;i++) {
			System.out.printf("%3d", v[i]);		

		}
		System.out.println("\n\nVetor original invertido: ");
		for(i = v.length  - 1 ;i>=0;i--) {
			System.out.printf("%3d", v[i]);	
		}
	}
}
