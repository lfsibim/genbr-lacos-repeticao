package LacosRepeticao;

import java.util.Scanner;

public class While_Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0, genero = 0, cargo = 0, somaIdade = 0, participantes = 0, devBack = 0, mCisTransFront = 0, hCisTransMob40 = 0, naoBinFull30 = 0;
		String continuar = "S";
		float mediaIdade = 0;
		
		while(continuar.equalsIgnoreCase("s")) {
			
			System.out.println("Digite a sua idade: ");
			idade = input.nextInt();
			
					
			System.out.println("Selecione seu gênero\n");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			genero = input.nextInt();
			
			System.out.println("\nSelecione seu cargo\n");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			cargo = input.nextInt();
			
			// Pessoas dev backend
			
			if(cargo == 1) {
				devBack++;
			}
			
			// Mulheres Cis/Trans Frontend
			
			if((genero == 1 || genero == 4) && cargo == 2) {
				mCisTransFront++;
			}
			
			// Homens Cis/Trans Mobile > 40
			
			if((genero == 2 || genero == 5) && cargo == 3 && idade > 40) {
				hCisTransMob40++;
			}
			
			// Não binários FullStack < 30
			
			if(genero == 3 && cargo == 4 && idade < 30) {
				naoBinFull30++;
			}
			
			// Total respostas pesquisa
			
			participantes++;
			
			// Media idade participantes
			
			somaIdade += idade;
			mediaIdade = (float)somaIdade / participantes;
			

			System.out.println("\nDeseja continuar? (S/N)");
			continuar = input.next();
		}
		
		System.out.println("\n\n\tResultados da Pesquisa:");
		System.out.println("\nPessoas desenvolvedoras Backend: "+devBack);
		System.out.println("\nMulheres Cis e Trans desenvolvedoras Frontend: "+mCisTransFront);
		System.out.println("\nHomens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+hCisTransMob40);
		System.out.println("\nNão Binários desenvolvedores FullStack menores de 30 anos: "+naoBinFull30);
		System.out.println("\nTotal de pessoas que responderam à pesquisa: "+participantes);
		System.out.printf("\nMédia de idade das pessoas que responderam à pesquisa: %.2f",mediaIdade);
		

	}

}
