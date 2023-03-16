package lacos_repeticao;

import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		int num, multiplos = 0, contNum = 0;
		float media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero:");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				multiplos = multiplos + num;
				contNum++;
				System.out.println(contNum++);
			}
			
		}while(num != 0);
		media = multiplos / contNum;
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	}

	}


