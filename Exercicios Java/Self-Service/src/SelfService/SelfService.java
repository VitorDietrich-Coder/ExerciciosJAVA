package SelfService;
import java.io.Console;
import java.util.Scanner;

public class SelfService {
	public static float pesoPrato, valorbibida, valorconta;
	
	public static void main(String[] args) 
	{
		
		RecebeValor();
		Calcula();
		exibir();
		
	}
	private static void exibir() 
	{
		 System.out.println("valor do prato é: " + valorconta);
	}
	private static void Calcula() 
	{
		 float valorPrato = 23.59f;
		 valorconta = (valorPrato * pesoPrato) + valorbibida;
	}
	private static void RecebeValor() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o peso do prato");
		pesoPrato = scanner.nextFloat();
		
		System.out.println("digite o valor das birita");
		valorbibida = scanner.nextFloat();
	}
	
}
