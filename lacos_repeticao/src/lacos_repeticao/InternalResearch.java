package lacos_repeticao;

import java.util.Scanner;

public class InternalResearch {

	public static void main(String[] args) {
		int idade, sexo, categoria, contBackend = 0, contMulheres = 0, contHomens = 0, contFull = 0;
		char continuar='S';
		
		Scanner leia = new Scanner(System.in);

		while(continuar != 'N') {
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			System.out.println("Digite o sexo:");
			sexo = leia.nextInt();
			System.out.println("Digite a categoria:");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				contBackend++;
			} else if (sexo ==2 && categoria == 2) {
				contMulheres++;
			} else if (sexo == 1 && categoria == 3 && idade > 40) {
				contHomens++;
			} else if (sexo == 2 && categoria == 4 && idade < 30) {
				contFull++;
			}
			
			if(sexo <= 3 && categoria <= 4) {
				System.out.println("Deseja continuar a leitura de dados?");
				continuar = leia.next().charAt(0);
			} else {
				System.out.println("Selecione uma opção válida"); 
			}
			
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + contBackend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + contMulheres);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + contHomens);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + contFull);

	}

}
