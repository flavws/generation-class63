package lacos_condicionais;

import java.util.Scanner;

public class WageAdjustment {

	public static void main(String[] args) {
		
		int codigoCargo;
		String nomeColaborador, cargo;
		float salario, novoSalario, reajuste;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\n\tCargos\n1 - Gerente\n2 - Vendedor\n3 - Supervisor\n4 - Motorista\n5 - Estoquista\n6 - Técnico de TI");
		
		System.out.println("\nDigite o nome do colaborador: ");
		nomeColaborador = leia.nextLine();
		
		System.out.println("\nDigite o código do cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		switch (codigoCargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.1f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
			break;
		default:
			System.out.println("Código não encontrado na tabela!");
	}
	}

}
