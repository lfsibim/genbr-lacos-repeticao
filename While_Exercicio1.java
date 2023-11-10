package LacosRepeticao;

import java.util.Scanner;

public class While_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int idade = 0, contMenor = 0, contMaior = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: \n");
			idade = input.nextInt();
			if(idade < 21 && idade >= 0) {
				contMenor++;
			}else if(idade > 50) {
				contMaior++;
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+contMaior);
	}

}
