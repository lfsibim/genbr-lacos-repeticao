package LacosRepeticao;

import java.util.Scanner;

public class DoWhile_Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		float media, somaMultiplo = 0, qtdNum = 0;
		
		do {
			System.out.println("Digite um número: \n");
			num = input.nextInt();
			if(num % 3 == 0 && num != 0) {
				somaMultiplo += num;
				qtdNum++; 
			}
		}while(num != 0);
		
		media = somaMultiplo / qtdNum;
		System.out.println("\nA média de todos os números múltiplos de 3 é: "+media);
		
	}

}
