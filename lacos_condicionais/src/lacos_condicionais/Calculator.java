package lacos_condicionais;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int codigo;
		float primeiroNumero, segundoNumero, total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tCalculadora\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		
		System.out.println("\nDigite o 1º número: ");
		primeiroNumero = leia.nextFloat();

		System.out.println("\nDigite o 2º número: ");
		segundoNumero = leia.nextFloat();
		
		System.out.println("\nDigite o código da operação");
		codigo = leia.nextInt();
		
		switch (codigo) {
		case 1 :
			total = primeiroNumero + segundoNumero;
			System.out.println(primeiroNumero + " + " + segundoNumero + " = " + total);
			break;
		case 2:
			total = primeiroNumero - segundoNumero;
			System.out.println(primeiroNumero + " - " + segundoNumero + " = " + total);
			break;
		case 3:
			total = primeiroNumero * segundoNumero;
			System.out.println(primeiroNumero + " * " + segundoNumero + " = " + total);
			break;
		case 4:
			total = primeiroNumero / segundoNumero;
			System.out.println(primeiroNumero + " / " + segundoNumero + " = " + total);
			break;
		default: 
			System.out.println("Operação inválida!");
		}
	}

}
