package lacos_repeticao;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num, impar=0, par=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(int x = 1; x <=10; x++) {
			System.out.println("Digite o " + x + "º número:");
			num = leia.nextInt();
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Total número de pares: " + par);
		System.out.println("Total número de ímpares: " + impar);

	}

}
