package lacos_condicionais;

import java.util.Scanner;

public class AnimalClassification {

	public static void main(String[] args) {
		
		String primeiraCaracteristica, segundaCaracteristica, terceiraCaracteristica;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira característica: ");
		primeiraCaracteristica = leia.nextLine();
		System.out.println("Digite a segunda característica: ");
		segundaCaracteristica = leia.nextLine();
		System.out.println("Digite a terceira característica: ");
		terceiraCaracteristica = leia.nextLine();

		if(primeiraCaracteristica.equalsIgnoreCase("vertebrado")) {
			if (segundaCaracteristica.equalsIgnoreCase("ave")) {
				if (terceiraCaracteristica.equalsIgnoreCase("carnívoro")) {
					System.out.println("É uma águia");
				}else {
					System.out.println("É uma pomba");
				}
			}else {
				if (terceiraCaracteristica.equalsIgnoreCase("onívoro")) {
					System.out.println("É um ser humano.");
				}else {
					System.out.println("É uma vaca.");
				}
			}
		} else {
			if(segundaCaracteristica.equalsIgnoreCase("inseto")) {
				if (terceiraCaracteristica.equalsIgnoreCase("hematófago")) {
					System.out.println("É uma pulga.");
				} else {
					System.out.println("É uma lagarta.");
				}
			} else {
				if (terceiraCaracteristica.equalsIgnoreCase("hematófago")) {
					System.out.println("É uma sanguessuga.");
				} else {
					System.out.println("É uma minhoca.");
				}
			}
		}
	}

}
