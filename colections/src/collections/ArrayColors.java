package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayColors {
	
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		
		String cor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite cinco cores:");
		for (int x = 0 ; x < 5 ; x++) {
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores:");
		for (String c : cores) {
			System.out.println(c);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores:");
		for (String c : cores) {
			System.out.println(c);
		}
		
		
	}
}

