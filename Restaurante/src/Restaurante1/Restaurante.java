package Restaurante1;

import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Restaurante {
	private static Scanner scanner = new Scanner(System.in);
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	private static ArrayList<Products> listar = new ArrayList<Products>();
	private static Queue<Clientes> fila = new LinkedList<Clientes>();
	private static Stack<Armazén> pilha = new Stack<Armazén>();
	private static boolean finalzar = true;
	private static double soma = 0.00;
	private static String nome = "";
	public static void main(String[] args) {
		
		Opções();
		Pilha();
		Inicio();
	}
	private static void Fila() {
		Clientes clientes = new Clientes();
		clientes.setId(fila.size() + 1);
		clientes.setDescricao(nome);
		clientes.setPrice(soma);
		fila.add(clientes);
		System.out.println(" ");
	}
	private static void Pilha() {
		Armazén estoque = new Armazén();
		for (int index = 0; index < 1; index++) {
			estoque = new Armazén();
			estoque.setEstoque(1);
			pilha.push(estoque);
		}
		System.out.println(" ");
	}
	private static void Opções() {
		Products produto = new Products();
		produto.setId(1);
		produto.setDescricao("Hamburguer vegano");
		produto.setPrice(15.00);
		listar.add(produto);
		produto = new Products();
		produto.setId(2);
		produto.setDescricao("X-Hamburguer");
		produto.setPrice(10.50);
		listar.add(produto);
		produto = new Products();
		produto.setId(3);
		produto.setDescricao("Cerveja");
		produto.setPrice(6.50);
		listar.add(produto);
		produto = new Products();
		produto.setId(4);
		produto.setDescricao("Chocolate");
		produto.setPrice(3.00);
		listar.add(produto);
		produto = new Products();
		produto.setId(5);
		produto.setDescricao("Pecanha");
		produto.setPrice(45.00);
		listar.add(produto);
		produto = new Products();
		produto.setId(6);
		produto.setDescricao("Salada");
		produto.setPrice(20.00);
		listar.add(produto);
	}
	private static void Ler() {
		System.out.println(" ");
		for (Products index : listar) {
			System.out.println(index.getId());
			System.out.println(index.getDescricao());
			System.out.println(formatter.format(index.getPrice()));
			System.out.println(" ");
		}
	}
	private static void Ler1() {
		System.out.println(" ");
		for (Clientes index : fila) {
			System.out.println(index.getId());
			System.out.println(index.getDescricao());
			System.out.println(formatter.format(index.getPrice()));
			System.out.println(" ");
		}
	}
	private static void mensagem() {
		System.out.println("1 - Fazer pedido:");
		System.out.println("2 - Ver o Cardapio: ");
		System.out.println("3 - Ver o Estoque: ");
		System.out.println("4 - Ver os Pedidos: ");
		System.out.println("5 - Finalizar");
	}
	private static void mensagem1() {
		System.out.println(" ");
		System.out.println("Escolha os produtos:");
		System.out.println("0 - Finalizar");
	}
	private static void mensagem2() {
		System.out.println(" ");
		System.out.println("Digite seu nome caro cliente:");
	}
	private static void Comandas() {
		int valor = scanner.nextInt();
		switch (valor) {
		case 1:
			soma += listar.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(listar.get(valor - 1).getDescricao());
			System.out.println(formatter.format(listar.get(valor - 1).getPrice()));
			System.out.printf("Valor Total:  %s", formatter.format(soma));
			System.out.println(" ");
			Comandas();
			break;
		case 2:
			soma += listar.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(listar.get(valor - 1).getDescricao());
			System.out.println(formatter.format(listar.get(valor - 1).getPrice()));
			System.out.printf("Valor Total:  %s", formatter.format(soma));
			System.out.println(" ");
			Comandas();
			break;
		case 3:
			soma += listar.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(listar.get(valor - 1).getDescricao());
			System.out.println(formatter.format(listar.get(valor - 1).getPrice()));
			System.out.printf("Valor Total:  %s", formatter.format(soma));
			System.out.println(" ");
			Comandas();
			break;
		case 4:
			if (pilha.size() == 0) {
                System.out.println(" ");
                System.out.println("Estoque Acabou meu amigo, escolha outro produto");
                Comandas();

            } else {
                pilha.pop();
                soma += listar.get(valor - 1).getPrice();
                System.out.println(" ");
                System.out.println(listar.get(valor - 1).getDescricao());
                System.out.println(formatter.format(listar.get(valor - 1).getPrice()));
                System.out.printf("Valor Total:  %s", formatter.format(soma));
                System.out.println(" ");
                Comandas();
            }
            break;
		case 5:
			soma += listar.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(listar.get(valor - 1).getDescricao());
			System.out.println(formatter.format(listar.get(valor - 1).getPrice()));
			System.out.printf("Valor Total:  %s", formatter.format(soma));
			System.out.println(" ");
			Comandas();
			break;
		case 6:
			soma += listar.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(listar.get(valor - 1).getDescricao());
			System.out.println(formatter.format(listar.get(valor - 1).getPrice()));
			System.out.printf("Valor Total:  %s", formatter.format(soma));
			System.out.println(" ");
			Comandas();
			break;
		case 0:
			System.out.println(" ");
			System.out.println("Obrigado pela preferência, tenha um ótimo dia!!");
			System.out.printf("Valor Total:  %s", formatter.format(soma));
			System.out.println(" ");
			System.out.println(" ");
			mensagem();
			break;
		default:
			System.out.println("Valor inválido, digite o código de um produto válido");
			Comandas();
			break;
		}
	}
	private static void Inicio() {
		mensagem();
		while (finalzar) {
			int valor = scanner.nextInt();
			switch (valor) {
			case 1:
				soma = 0.00;
				mensagem2();
				nome = scanner.next();
				mensagem1();
				Comandas();
				Fila();
				break;
			case 2:
				Ler();
				mensagem();
				break;
			case 3:
				System.out.println(" ");
				System.out.println("Estoque de Chocolate:");
				System.out.println(pilha.size());
				break;
			case 4:
				if (fila.size() == 0) {
					System.out.println(" ");
					System.out.println("Sem Pedidos");
				} else {
					Ler1();
				}
				break;
			case 5:
				finalzar = false;
				break;

			default:
				System.out.println("Valor invalido");
				break;
			}
		}
	}
}