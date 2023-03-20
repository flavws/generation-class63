package vetores_matrizes;

import java.util.Scanner;

public class GradesMatrix {

	public static void main(String[] args) {
		
		float[][] nota = new float[10][4];
		
		float[] soma = new float[10];
		
		float[] medias = new float[10];
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 4; y++) {
				System.out.println("\nDigite a " + (y+1) + "ª nota do "+ (x+1) +"ª alune: ");
				nota[x][y] = leia.nextFloat();
			}
		}
		
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 4; y++) {
				soma[x] += nota[x][y];
				medias[x] = soma[x] / 4;
			}
		}
		
		System.out.println("\nMédias: ");
		for (int x = 0; x < 10; x++) {
			System.out.printf("%f ", medias[x]);
		}

	}

}
