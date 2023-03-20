package vetores_matrizes;

import java.util.Scanner;

public class MatrixFilter {

	public static void main(String[] args) {
		int somaP = 0, somaS = 0;
		
		int num[][] = new int[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println("Entre com os números da matriz: ");
				num[x][y] = leia.nextInt();
			}
		}
		System.out.println("Elementos da Diagonal Principal: ");
		for (int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				if (x == y) {
					System.out.printf("%d ", num[x][y]);
					somaP +=num[x][y];
				}
			}
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				if (x + y == 2) {
					System.out.printf("%d ", num[x][y]);
					somaS +=num[x][y];
				}
			}
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal:\n" + somaP);
		System.out.println("Soma dos Elementos da Diagonal Secundária:\n" + somaS);
	}

}
