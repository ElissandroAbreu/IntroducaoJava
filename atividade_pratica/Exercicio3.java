package atividade_pratica;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salariobruto,adicnot,horaextra,descontos,salarioliq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o salário: ");
		salariobruto = leia.nextFloat();
		System.out.println("\nEntre com o Adicional Noturno: ");
		adicnot = leia.nextFloat();
		System.out.println("\nEntre com as Horas Extras: ");
		horaextra = leia.nextFloat();
		System.out.println("\nEntre com os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioliq = salariobruto + adicnot + (horaextra * 5)- descontos;
		
		System.out.println("\nO salário líquido do trabalhado é: "+salarioliq);

	}

}
