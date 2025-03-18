package atividade_2;

import java.util.Scanner;

public class Atividade_2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float nota_1, nota_2, nota_3, nota_4, media_final;
		
		System.out.println("Digite sua primeira nota: ");
		nota_1 = ler.nextFloat();
		
		System.out.println("\nDigite sua segunda nota: ");
		nota_2 = ler.nextFloat();

		System.out.println("\nDigite sua terceira nota: ");
		nota_3 = ler.nextFloat();
		
		System.out.println("\nDigite sua quarta nota: ");
		nota_4 = ler.nextFloat();
		
		media_final = (nota_1 + nota_2 + nota_3 + nota_4)/4;
		
		System.out.printf("\nSua média final é: %.1f", media_final);		
	}
}
