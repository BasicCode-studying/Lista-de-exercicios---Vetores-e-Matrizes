import java.util.Scanner;
public class Matrizexercicio05 {
//feito
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[5][5];
		int i, j;
		int x = 0;
		char verificador;
		verificador = 'n';
		int linha = 0;
		int coluna = 0;		
		
		System.out.println("[+] Leitura e impress�o de uma matriz 5 x 5...");
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.println("[+] Digite a matriz de: mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
			}
		}
		
		System.out.println("\n[+] Matriz de 5x5 na tela:\n");
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\n[+] Entre com o n�mero a ser procurado["+x+"]:");
		x = ent.nextInt();
	    for(i = 0; i < 5 ; i++){
	        for(j = 0; j < 5 ; j++){
	            if(mat[i][j] == x){
                   x = mat[i][j];	       
	               linha = i;
	               coluna = j;
	               verificador = 's';
	            }
	        }
	    }
	    
	    if(verificador == 's'){
	        System.out.printf("[+] N�mero %d encontrado na linha %d e na coluna %d ", x , linha, coluna);
	       
	    }else{
	       System.out.println("[+] N�mero n�o encontrado");
	    }
	}
}