package lacos_repeticao;

import java.util.Scanner;

public class InternalResearch {

	public static void main(String[] args) {
		int idade, sexo, categoria;
		String continuar="S";
		
		Scanner leia = new Scanner(System.in);

		while(continuar.equals("S")) {
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			System.out.println("Digite o sexo:");
			sexo = leia.nextInt();
			System.out.println("Digite a categoria:");
			idade = leia.nextInt();
			
			System.out.println("Deseja continuar a leitura de dados?");
			continuar = leia.next();
		}
	}

}
