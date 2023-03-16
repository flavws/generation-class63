package lacos_condicionais;

import java.util.Scanner;

public class BankAccountOperation {

	public static void main(String[] args) {
		
		int codigo;
		float valor, novoSaldo, saldo = 1000.00f;
		String operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tOperações bancárias\n1 - Saldo\n2 - Saque\n3 - Depósito");
		
		System.out.println("\nDigite o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			operacao = "Saldo";
			System.out.println("Operação - " + operacao);
			System.out.println("Saldo: R$ " + saldo);
			break;
		case 2:
			System.out.println("\nDigite o valor do saque: ");
			valor = leia.nextFloat();
			
			if (saldo > valor) {
				novoSaldo = saldo - valor;
				operacao = "Saque";
				System.out.println("Operação - " + operacao);
				System.out.println("Novo saldo: R$ " + novoSaldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			
			break;
		case 3:
			System.out.println("\nDigite o valor do depósito: ");
			valor = leia.nextFloat();
			operacao = "Depósito";
			novoSaldo = saldo + valor;
			
			System.out.println("Operação - " + operacao);
			System.out.println("Saldo: R$ " + novoSaldo);
			break;
		default: 
			System.out.println("Operação inválida!");
		}
		
	}

}
