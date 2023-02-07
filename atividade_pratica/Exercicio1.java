package atividade_pratica;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario,abono,novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("\nNovo salário é: "+novosalario);
	}

}
