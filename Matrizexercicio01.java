import java.util.Scanner;

public class Matrizexercicio01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[4][4];
		int i, j;
		System.out.println("[+] Leitura e impressão de uma matriz 4 x 4...");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("[+] Digite a matriz de: mat[" + i + "][" + j + "]:");
				mat[i][j] = ent.nextInt();
			}
		}

		System.out.println("\n[+] Imprimindo matriz:\n");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}

		System.out.printf("\n[+] Numeros maiores que 10:\n");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (mat[i][j] > 10) {
					System.out.printf("%4d", mat[i][j]);
				}
			}
		}
	}
}