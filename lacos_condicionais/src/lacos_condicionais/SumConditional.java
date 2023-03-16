package lacos_condicionais;

import java.util.Scanner;

public class SumConditional {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		System.out.println("\nDigite o número B: ");
		numeroB = leia.nextInt();
		System.out.println("\nDigite o número C: ");
		numeroC = leia.nextInt();
		
		if(numeroA + numeroB > numeroC) {
			System.out.println("A soma de A + B é maior que C");
		} else {
			if(numeroA + numeroB < numeroC){
			System.out.println("A soma de A + B é menor que C");
			} else {
			System.out.println("A soma de A + B é igual a C");
			}
		}

	}

}
