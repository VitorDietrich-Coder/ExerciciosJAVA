package br.fag.edu.br.Lanchonete;

import java.util.Scanner;

public class Salgadinhos extends Produtos
{
	private String tipo;
	private String massa;
	private String recheio;

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getMassa()
	{
		return massa;
	}

	public void setMassa(String massa)
	{
		this.massa = massa;
	}

	public String getRecheio()
	{
		return recheio;
	}

	public void setRecheio(String recheio)
	{
		this.recheio = recheio;
	}

	public void AlteraValorProduto()
	{
		Salgadinhos salgadinhos = new Salgadinhos();
		Scanner scanner = new Scanner(System.in);

		boolean validarecheio = true;
		while (validarecheio)
		{
			System.out.println("Digite o valor do recheio sabor pizza:");
			String valorRecheioPizza = scanner.next();
			double valorRecheioPizzaT = 0.0;
			if (valorRecheioPizza.matches("^[0-9]+$"))
			{
				valorRecheioPizzaT = Double.parseDouble(valorRecheioPizza);
				ERecheios.pizza.setpizza(valorRecheioPizzaT);
				validarecheio = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validarecheiocarne = true;
		while (validarecheiocarne)
		{
			System.out.println("Digite o valor do recheio sabor carne:");
			String valorRecheioCarne = scanner.next();
			double valorRecheioCarneT = 0.0;
			if (valorRecheioCarne.matches("^[0-9]+$"))
			{
				valorRecheioCarneT = Double.parseDouble(valorRecheioCarne);
				ERecheios.carne.setcarne(valorRecheioCarneT);
				validarecheiocarne = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validasalgado = true;
		while (validasalgado)
		{
			System.out.println("Digite o valor do salgado:");
			String ValorSalgado = scanner.next();
			double valor2 = 0.0;
			if (ValorSalgado.matches("^[0-9]+$"))
			{
				valor2 = Double.parseDouble(ValorSalgado);
				salgadinhos.setPrecoVenda(valor2);
				validasalgado = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}
	}

	public String toString()
	{
		return "\n\nSalgadinhos:"  + super.toString() +  "\nTipo: " + tipo + "\nMassa: " + massa + "\nRecheio: " + recheio;
	}
}
