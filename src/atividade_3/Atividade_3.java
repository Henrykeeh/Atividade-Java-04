package atividade_3;

import java.util.Scanner;

public class Atividade_3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float salario_bruto, adicional_noturno, horas_extras, descontos, salario_liquido;
		
		System.out.println("Digite o salário bruto: ");
		salario_bruto = ler.nextFloat();
		
		System.out.println("\nDigite o adicional noturno: ");
		adicional_noturno = ler.nextFloat();
		
		System.out.println("\nDigite as horas extras: ");
		horas_extras = ler.nextFloat();
		
		System.out.println("\nDigite os descontos: ");
		descontos = ler.nextFloat();
		
		salario_liquido = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		
		System.out.printf("O salário líquido é: %.2f", salario_liquido);
		
	}
}
