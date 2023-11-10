package LacosRepeticao;

import java.util.Scanner;

public class For_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, x, somaPar = 0, somaImpar = 0;
		
		for(x = 1; x <= 10; x++) {
			System.out.println("Digite o "+x+"º número: \n");
			num = input.nextInt();
			if(num % 2 == 0) {
				somaPar++;				
			}else {
				somaImpar++;
			}
		}
		
		System.out.println("\nTotal de números pares: "+somaPar);
		System.out.println("\nTotal de números ímpares: "+somaImpar);
	}

}
