package br.fag.edu.br.Lanchonete;

import java.util.Scanner;

public class Pizzas extends Produtos
{

	private String recheio;
	private String bordas;
	private String molhos;

	public String getRecheio()
	{
		return recheio;
	}

	public void setRecheio(String recheio)
	{
		this.recheio = recheio;
	}

	public String getBordas()
	{
		return bordas;
	}

	public void setBordas(String bordas)
	{
		this.bordas = bordas;
	}

	public String getMolhos()
	{
		return molhos;
	}

	public void setMolhos(String molhos)
	{
		this.molhos = molhos;
	}

	public void AlteraValorProduto()
	{
		Pizzas pizza = new Pizzas();
		Scanner scanner = new Scanner(System.in);

		boolean validaBordaCaturpiry = true;
		while (validaBordaCaturpiry)
		{
			System.out.println("Digite o valor da borda de Catupiry:");
			String valorBordacatupiry = scanner.next();
			double valorBordacatupiryT = 0.0;
			if (valorBordacatupiry.matches("^[0-9]+$"))
			{
				valorBordacatupiryT = Double.parseDouble(valorBordacatupiry);
				EBordasPizza.catupiry.setCatupiry(valorBordacatupiryT);
				validaBordaCaturpiry = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validaBordaCheddar = true;
		while (validaBordaCheddar)
		{
			System.out.println("Digite o valor da borda de Cheddar:");
			String valorBordaCheddar = scanner.next();
			double valorBordaCheddarT = 0.0;
			if (valorBordaCheddar.matches("^[0-9]+$"))
			{
				valorBordaCheddarT = Double.parseDouble(valorBordaCheddar);
				EBordasPizza.cheddar.setcheddar(valorBordaCheddarT);
				validaBordaCheddar = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}

		}

		boolean validaBordaChocolate = true;
		while (validaBordaChocolate)
		{
			System.out.println("Digite o valor da borda de Chocolate:");
			String valorBordaChocolate = scanner.next();
			double valorBordaChocolateT = 0.0;
			if (valorBordaChocolate.matches("^[0-9]+$"))
			{
				valorBordaChocolateT = Double.parseDouble(valorBordaChocolate);
				EBordasPizza.chocolate.setChocolate(valorBordaChocolateT);
				validaBordaChocolate = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validarecheioCalabresa = true;
		while (validarecheioCalabresa)
		{
			System.out.println("Digite o valor do recheio de Calabresa :");
			String valorRecheioCalabresa = scanner.next();
			double valorRecheioCalabresaT = 0.0;
			if (valorRecheioCalabresa.matches("^[0-9]+$"))
			{
				valorRecheioCalabresaT = Double.parseDouble(valorRecheioCalabresa);
				ERecheios.calabresa.setcalabresa(valorRecheioCalabresaT);
				validarecheioCalabresa = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validarecheioFrango = true;
		while (validarecheioFrango)
		{
			System.out.println("Digite o valor do recheio de Frango:");
			String valorRecheioFrango = scanner.next();
			double valorRecheioFrangoT = 0.0;
			if (valorRecheioFrango.matches("^[0-9]+$"))
			{
				valorRecheioFrangoT = Double.parseDouble(valorRecheioFrango);
				ERecheios.frango.setfrango(valorRecheioFrangoT);
				validarecheioFrango = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validarecheioStrogonoff = true;
		while (validarecheioStrogonoff)
		{
			System.out.println("Digite o valor do recheio Strogonoff de Carne:");
			String valorRecheioStrogonoff = scanner.next();
			double valorRecheioStrogonoffT = 0.0;
			if (valorRecheioStrogonoff.matches("^[0-9]+$"))
			{
				valorRecheioStrogonoffT = Double.parseDouble(valorRecheioStrogonoff);
				ERecheios.strogonoffCarne.setstrogonoffCarne(valorRecheioStrogonoffT);
				validarecheioStrogonoff = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validarecheioQueijo = true;
		while (validarecheioQueijo)
		{
			System.out.println("Digite o valor do recheio de Queijo:");
			String valorRecheioQueijo = scanner.next();
			double valorRecheioQueijoT = 0.0;
			if (valorRecheioQueijo.matches("^[0-9]+$"))
			{
				valorRecheioQueijoT = Double.parseDouble(valorRecheioQueijo);
				ERecheios.queijo.setqueijo(valorRecheioQueijoT);
				validarecheioQueijo = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

		boolean validaValorPizza = true;
		while (validaValorPizza)
		{
			System.out.println("Digite o valor da pizza:");
			String ValorPizza = scanner.next();

			double ValorPizzaT = 0.0;
			if (ValorPizza.matches("^[0-9]+$"))
			{
				ValorPizzaT = Double.parseDouble(ValorPizza);
				pizza.setPrecoVenda(ValorPizzaT);
				validaValorPizza = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}
	}

	public String toString()
	{
		return "\n\nPizza:" + super.toString() + "\nRecheio:" + recheio + "\nBordas: " + bordas + "\nMolhos: " + molhos;
	}
}
