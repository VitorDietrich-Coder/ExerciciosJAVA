package Petshop;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList; 


public class Petshop {	
	enum Menu {cachorro , gato, sair};
	
	private static  String recebeanimal = "gatoanimal";
	private static  String recebeanimal2 = "cachorroanimal";
	static ArrayList<String> animais = new ArrayList<String>(); 
	static ArrayList<String> gato = new ArrayList<String>(); 
	static ArrayList<String> cachorro = new ArrayList<String>(); 
	
	public static void main(String[] args) 
	{
		colocalista();
		recebevalor();
		exibir();
		exibir1();
	}
	private static void exibir1() {
		
		System.out.println("Tem: " + cachorro.size() + "  cachorros em estoque seu gostoso");
	}
	private static void colocalista() 
	{

		for (int i = 0; i < 10; i++) 
		{
			gato.add(recebeanimal);
		}
		 
		for (int i = 0; i < 10; i++) 
		{
		cachorro.add(recebeanimal2);
		}
		
	}
	private static void exibir() 
	{
		System.out.println("Tem: " + gato.size() + " gatos em estoque seu gostoso");
	
	}
	public static void recebevalor() 
	{
		Boolean escolheusair = false; 
	while(!escolheusair){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o número do animal no qual deseja ver o quantidade:");
		System.out.println("0-cachorro\n1-gato\n2-sair");
		int recebevalor = scanner.nextInt();
		
		switch (recebevalor)
		{
		case 0:
			exibir1();
			break;
		case 1:
			exibir();
			break;
		case 2:
			escolheusair = true;
			System.out.println("você escolheu sair, até mais");
			System.out.close();
			break;
		default:
			System.out.println("Digitou um número inválido");
			break;
			}
	 
		}
	
	}
	
}
