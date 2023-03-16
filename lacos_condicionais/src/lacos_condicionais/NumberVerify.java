package lacos_condicionais;

import java.util.Scanner;

public class NumberVerify {

	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo");
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é ímpar e positivo");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo");
		} else {
			System.out.println("O número " + numero + " é ímpar e negativo");
		}

	}

}
