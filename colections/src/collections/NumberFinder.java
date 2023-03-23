package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberFinder {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Integer valores[] = {2,5,1,3,4,9,7,8,10,6}, num;
		
		Scanner leia = new Scanner(System.in);
		
		Collections.addAll(numeros, valores);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();


		if(numeros.contains(num)) {
			System.out.println("\nO número " + num + " está localizado na posição:\n" + numeros.indexOf(num));
		} else {
			System.out.println("\nO número " + num + " não foi encontrado!");
		}

				
		


		
		
	}
}
