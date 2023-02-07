package atividade_pratica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int n1,n2,n3,n4,calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número 1: ");
		n1= leia.nextInt();
		System.out.println("\nEntre com o número 1: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o número 1: ");
		n3 = leia.nextInt();
		System.out.println("\nEntre com o número 1: ");
		n4 = leia.nextInt();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nA diferença do produto é: "+calculo);

	}

}
