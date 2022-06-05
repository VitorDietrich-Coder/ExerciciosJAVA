package br.fag.edu.br.Lanchonete;

import java.util.Scanner;

public class Lanches extends Produtos
{
	private String tipoPao;
	private String recheio;
	private String molhos;

	public String getTipoPao()
	{
		return tipoPao;
	}

	public void setTipoPao(String tipoPao)
	{
		this.tipoPao = tipoPao;
	}

	public String getRecheio()
	{
		return recheio;
	}

	public void setRecheio(String recheio)
	{
		this.recheio = recheio;
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

		Lanches lanche = new Lanches();
		Scanner scanner = new Scanner(System.in);

		boolean validarecheiohamburguer = true;
		while (validarecheiohamburguer)
		{
			System.out.println("Digite o valor do recheio de Hamburguer:");
			String valorRecheioHamburguer = scanner.next();
			double valorRecheioHamburguerT = 0.0;
			if (valorRecheioHamburguer.matches("^[0-9]+$"))
			{
				valorRecheioHamburguerT = Double.parseDouble(valorRecheioHamburguer);
				ERecheios.hamburguer.sethamburguer(valorRecheioHamburguerT);
				validarecheiohamburguer = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}
		boolean validaValorLanche = true;
		while (validaValorLanche)
		{
			System.out.println("Digite o valor do lanche:");
			String ValorLanche = scanner.next();

			double ValorLancheT = 0.0;
			if (ValorLanche.matches("^[0-9]+$"))
			{
				ValorLancheT = Double.parseDouble(ValorLanche);
				lanche.setPrecoVenda(ValorLancheT);
				validaValorLanche = false;
			} else
			{
				System.out.println("Valor Inválido, digite um valor correto");
			}
		}

	}

	public String toString()
	{
		return  "\n\nLanche:" + super.toString() + "\nTipo Pão: " + tipoPao + "\nRecheio: " + recheio + "\nMolhos: " + molhos;
	}

}
