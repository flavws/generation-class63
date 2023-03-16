package lacos_condicionais;

import java.util.Scanner;

public class AptitudeDonation {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doou;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("\nPrimeira doaçao de sangue: ");
		doou = leia.nextBoolean();
		
		if (idade >= 18 && idade <=69) {
			if (idade >= 60 && doou == false) {
				System.out.println( nome + " está apto(a) para doar sangue.");
			} else if(idade >= 60 && doou == true){
				System.out.println( nome + " não está apto(a) para doar sangue. ");
			} else {
				System.out.println( nome + " está apto(a) para doar sangue.");
			}
		} else {
			System.out.println( nome + " não está apto(a) para doar sangue.");
		}
	}

}
