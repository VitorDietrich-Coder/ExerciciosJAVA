package Reserva;

import java.util.ArrayList;
import java.util.Scanner;

public class MesaReserva {
	static ArrayList<String> mesafumante = new ArrayList<String>(); 
	static Boolean escolheusair = false;
 
	static ArrayList<String> mesanormal = new ArrayList<String>(); 
	public static String recebequantidade;
	enum Mesas {MesaFumante, MesaNormal}
	
	public static void main(String[] args) 
	{
		menu();	
	}
	
	private static void addmesafumante() {
		if (mesafumante.size() <= 25)
		{
			 mesafumante.add(recebequantidade);
			 System.out.println("você adicionou uma mesa");
		}
		else
		{
			System.out.println("As mesas lotaram seu burro você saiu");
			escolheusair = true;

		}
	}
	private static void addmesanormal() {
		
		if (mesanormal.size() <= 25)
		{
			mesanormal.add(recebequantidade);
			System.out.println("você adicionou uma mesa");
		}
		else
		{
			System.out.println("As mesas lotaram seu burro você saiu");
			escolheusair = true;
			
		}
	}
	
	public static void menu()
	{
		while(!escolheusair) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("digite o número da mesa que deseja reservar: ");
			System.out.println("0-MesaFumante\n1-MesaNormal\n2-sair");
			int recebeMesa =  scanner.nextInt();
			
		switch (recebeMesa)
		{
		case 0:
			addmesafumante();
			break;
		case 1:
			addmesanormal();
			break;
		
		case 2:
			System.out.println("você saiu");
			escolheusair = true;
			break;
		default:
			System.out.println("digite o número de uma mesa valido");
			break;
			}
		}
		
	}
}
