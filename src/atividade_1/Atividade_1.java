package atividade_1;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float salario, abono, novo_salario;
		
		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		
		System.out.println("\nDigite o Abono: ");
		abono = ler.nextFloat();
		
		novo_salario = salario + abono;
		
		System.out.printf("Seu salário com o abono é: %.2f", novo_salario);
	}

}
