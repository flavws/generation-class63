package vetores_matrizes;

import java.util.Scanner;

public class NumberFilter {

	public static void main(String[] args) {
		int num, soma = 0, par, impar;
		
		float media;
	    
	    int[] vetor = new int[10];
	    
	    
	    Scanner leia = new Scanner(System.in);
	    
	    for(int x=0;x<10;x++){
	        System.out.println("Digite o " + (x+1) + "º número: ");
	        vetor[x] = leia.nextInt();
	        
	        soma += vetor[x];
	    }
	    
	    media = soma / vetor.length;
	    
	    System.out.println("\nElementos nos índices ímpares: ");
	    for (int x=0; x<10; x++) {
	    	if(vetor[x] % 2 != 0 ) {
	        	impar = vetor[x];
	        	
	        	System.out.printf( "%d ", impar);
	        }
	    }
	    
	    System.out.println("\nElementos pares: ");
	    for (int x=0; x<10; x++) {
	    	if(vetor[x] % 2 == 0 ) {
	        	par = vetor[x];
	        	System.out.printf( "%d ", par);
	        }
	    }
	    
	    System.out.println("\nSoma: " + soma);
	    System.out.println("\nMédia: " + media);

	}

}
