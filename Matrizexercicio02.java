
public class Matrizexercicio02{
//feito
	public static void main(String[] args) {
		int mat[][] = new int[5][5];
		int i, j;
		System.out.println("impress�o de uma matriz 5 x 5...");
		
		for ( i=0; i<5; i++) {
			for ( j=0; j<5; j++) {
				if( i==j) {
					mat[i][j] = 1;
				}
			}
		}

		for ( i=0; i<5; i++) {
			for ( j=0; j<5; j++) {
				System.out.printf("  %d  ", mat[i][j]);
			}
			System.out.printf("\n");
		  }
		}	
	}	