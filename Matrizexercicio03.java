
public class Matrizexercicio03 {
//feito
	public static void main(String[] args) {
		int mat[][] = new int[4][4];
		int i=0;
		int j=0;
		
		System.out.println("[+] Leitura e impressão da matriz 5x5");
		System.out.println("[+] Carregando a matriz 4 x 4...");
		
		System.out.println("\n[+] Matriz de 4x4 na tela:\n");
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				mat[i][j] = (i+1)*(j+1);
				System.out.printf("%4d",mat[i][j]);
			}
			System.out.printf("\n");
		}
			
	}
}