package lacos_condicionais;

import java.util.Scanner;

public class TotalPurchasePrice {

	public static void main(String[] args) {
		
		int codigo, qtde;
		float preco, total;
		String produto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tLista de produtos\n1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Bauru\n5 - Refrigerante\n6 - Suco de Laranja");
		
		System.out.println("Digite o código do produto desejado: ");
		codigo = leia.nextInt();
		
		System.out.println("\nDigite a quantidade comprada: ");
		qtde = leia.nextInt();
		
		switch (codigo) {
			case 1:
				preco = 10.0f;
				produto = "Cachorro Quente";
				total = qtde * preco;
				System.out.println("Produto: " + produto + "\nValor total: " + total);
				break;
			case 2:
				preco = 15.0f;
				produto = "X-Salada";
				total = qtde * preco;
				System.out.println("Produto: " + produto + "\nValor total: " + total);
				break;
			case 3:
				preco = 18.0f;
				produto = "X-Bacon";
				total = qtde * preco;
				System.out.println("Produto: " + produto + "\nValor total: " + total);
				break;
			case 4:
				preco = 12.0f;
				produto = "Bauru";
				total = qtde * preco;
				System.out.println("Produto: " + produto + "\nValor total: " + total);
				break;
			case 5:
				preco = 8.0f;
				produto = "X-Bacon";
				total = qtde * preco;
				System.out.println("Produto: " + produto + "\nValor total: " + total);
				break;
			case 6:
				preco = 13.0f;
				produto = "Suco de Laranja";
				total = qtde * preco;
				System.out.println("Produto: " + produto + "\nValor total: " + total);
				break;
			default:
				System.out.println("Código não encontrado na tabela!");
		}
		
		

	}

}
