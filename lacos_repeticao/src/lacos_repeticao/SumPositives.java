package lacos_repeticao;

import java.util.Scanner;

public class SumPositives {

	public static void main(String[] args) {
		
		int num, positivos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero:");
			num = leia.nextInt();
			
			if(num > 0) {
				positivos = num + positivos;
			}
		}while(num != 0);
		
		System.out.println("A soma dos números positivos é: " + positivos);
	}

}
