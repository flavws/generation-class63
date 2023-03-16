package lacos_repeticao;

import java.util.Scanner;

public class NumericalRanges {

	public static void main(String[] args) {
		
		int primeiroNumero, segundoNumero, x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = leia.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		segundoNumero = leia.nextInt();
		if(primeiroNumero < segundoNumero){	
			for (x = primeiroNumero; x < segundoNumero; x++) {
				if(x % 3 == 0 && x % 5 == 0) {
					System.out.println( x + " é multiplo de 3 e 5");
				}	
			} 
		}else {
			System.out.println("Intervalo inválido!");
		}
	}

}
