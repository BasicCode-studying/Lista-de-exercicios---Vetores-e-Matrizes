import java.util.Scanner;

public class Matrizexercicio18 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int v[] = new int[3];
		int i, j;
		
		System.out.println("[+] Leitura e impress�o de uma matriz 3 x 3...");
		for(i=0; i<v.length; i++) { v[i] = 0; }
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("[+] Digite a matriz: mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
				v[j] += mat[i][j];
			}
		}
		
		System.out.println("\n[+] Matriz 3x3 na tela:\n");
		for ( i=0; i<3; i++) {
			for ( j=0; j<3; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\n[+] Vetor com a soma das colunas:");
		for ( i=0; i<v.length; i++) {
			System.out.printf("%4d", v[i]);
		}	
	}
}