package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DataList {
	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		Integer num[] = new Integer[10];
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite 10 números não repetidos: ");
		for (int x = 0; x < 10; x++) {
			num[x] = leia.nextInt();
		}
		
		Collections.addAll(numeros, num);
		
		for(Integer n : numeros) {
			System.out.println(n);
		}
		
		Iterator<Integer> i = numeros.iterator();
		
		System.out.println("\nListar dados do Set Iterator: ");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
