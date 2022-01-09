package KMs;

import java.util.Scanner;

public class Km {
	static Boolean escolheusair = false;
	static int quilometrototal;
	static int quilometroatual;
	enum Mesas {km1000, km2000, km3000, km3500}
	public static void main(String[] args) 
	{
		menu();	
	}
	
	public static void primeiraparada()
	{
		quilometroatual = 1000;
		quilometrototal = 4000 - quilometroatual  ;
		System.out.println("o quilometro atual é " + quilometroatual +" faltam: " + quilometrototal + " para finalizar a viajem");
	}
	
	public static void segundaparada()
	{
		quilometroatual = 2000;
		quilometrototal = 4000 - quilometroatual  ;
		System.out.println("o quilometro atual é " + quilometroatual +" faltam: " + quilometrototal + " para finalizar a viajem");
		
	}
	
	public static void terceiraparada()
	{
		quilometroatual = 3000;
		quilometrototal = 4000 - quilometroatual  ;
		System.out.println("o quilometro atual é " + quilometroatual +" faltam: " + quilometrototal + " para finalizar a viajem");
		
	}
	
	public static void quartaparada()
	{
		quilometroatual = 4000;
		quilometrototal = 4000 - quilometroatual  ;
		System.out.println("o quilometro atual é " + quilometroatual +" faltam: " + quilometrototal + " para finalizar a viajem");
	}
	
	public static void menu()
	{
		while(!escolheusair) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("digite o destino no qual está: ");
			System.out.println("0-km1000-São Paulo\n1-km2000-Toledo\n2-km3000-Ouro Verde\n3-km4000-Palotina");
			int recebeMesa =  scanner.nextInt();
			
		switch (recebeMesa)
		{
		case 0:
			primeiraparada();
			break;
		case 1:
			segundaparada();
			break;
		
		case 2:
			terceiraparada();
			break;
		case 3:
			quartaparada();
			System.out.println("Você chegou no destino final");
			escolheusair = true;
			break;
		default:
			System.out.println("digite o número de uma mesa valido");
			break;
			}
		}
	}
	
}
