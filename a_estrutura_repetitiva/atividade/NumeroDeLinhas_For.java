package a_estrutura_repetitiva.atividade;

import java.util.Scanner;

public class NumeroDeLinhas_For {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
		 * ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha,
		 * mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um Limite de Linhas : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

		}

		sc.close();

	}

}
