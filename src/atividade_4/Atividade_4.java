package atividade_4;

import java.util.Scanner;

public class Atividade_4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, n4, prod1, prod2, dif;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nDigite o segundo valor: ");
		n2 = ler.nextFloat();
		
		System.out.println("\nDigite o terceiro valor: ");
		n3 = ler.nextFloat();
		
		System.out.println("\nDigite o quarto valor: ");
		n4 = ler.nextFloat();
		
		prod1 = n1 * n2;
		prod2 = n3 * n4;
		dif = prod1 - prod2;
		System.out.printf("\nO produto de %.1f e %.1f é: %.1f", n1, n2, prod1);
		System.out.printf("\nO produto de %.1f e %.1f é: %.1f", n3, n4, prod2);
		System.out.printf("\nA diferença entre os produtos %.1f e %.1f é: %.1f", prod1, prod2, dif);
	}
}
