import java.util.*;
import java.util.Scanner;

public class somarDoisNumeros {
	
	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero 01:");
		num1 = input.nextInt();
		System.out.println("Digite o numero 02:");
		num2 = input.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Resposta:");
		System.out.println(soma);
		
		
		
		
	}
	
}

