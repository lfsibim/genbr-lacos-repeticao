package LacosRepeticao;

import java.util.Scanner;

public class DoWhile_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, somaPositivo = 0;
		
		do {
			System.out.println("Digite um número: \n");
			num = input.nextInt();
			if(num > 0) {
				somaPositivo += num;
			}
		}while(num != 0);
		
		System.out.println("\nA soma dos números positivos é: "+somaPositivo);
		
	}

}
