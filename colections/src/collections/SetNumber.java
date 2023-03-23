package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetNumber {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		
		Integer valores[] = {2,5,1,3,4,9,7,8,10,6}, num;
		
		Scanner leia = new Scanner(System.in);
		
		Collections.addAll(numeros, valores);
	
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if(numeros.contains(num)) {
			System.out.println("\nO número " + num + " foi encontrado!");
		} else {
			System.out.println("\nO número " + num + " não foi encontrado!");
		}
	}
}
