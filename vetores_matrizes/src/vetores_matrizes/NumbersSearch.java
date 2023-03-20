package vetores_matrizes;

import java.util.Scanner;

public class NumbersSearch {
		public static void main(String[] args) {
	    int num, cont=0;
	    
	    int[] vetor = new int[10];
	    
	    Scanner leia = new Scanner(System.in);
	    
	    for(int x=0;x<10;x++){
	        System.out.println("Digite o " + (x+1) + "º número: ");
	        vetor[x] = leia.nextInt();
	    }
	    
	    System.out.println("Digite outro número: ");
	    num = leia.nextInt();
	    
	    for(int x=0; x<10; x++) {
	    	if(vetor[x] == num) {
	    		System.out.println("\nA posição do número dentro do array é " + x);
	    		cont++;
	    	}
	    }
	    
	    if(cont == 0 ) {
	    	System.out.println("\nNúmero não encontrado");
	    }
	    
	}
}

