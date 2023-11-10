package LacosRepeticao;

import java.util.Scanner;

public class For_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1, num2, x;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = input.nextInt();
		System.out.println("\nDigite o último número do intervalo: ");
		num2 = input.nextInt();
		
		if(num1 >= num2) {
			System.out.println("\nIntervalo inválido!");
		}else {
			System.out.println("\nNo intervalo entre "+num1+" e "+num2+":\n");
			for(x = num1; x <= num2; x++) {
				if(x % 3 == 0 && x % 5 == 0) {
					System.out.println(+x+" é múltiplo de 3 e 5.");
				}
			}
		}
		
	}

}
