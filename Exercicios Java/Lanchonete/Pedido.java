package br.fag.edu.br.Lanchonete;

import java.util.ArrayList;

 

public class Pedido implements IPedidos
{
	private String nomeCliente;
	private ArrayList<Produtos> itensConsumidos;
	private double taxaServico = 10.0;


	public String getNomeCliente()
	{
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
	}
	public ArrayList<Produtos> getItensConsumidos()
	{
		return itensConsumidos;
	}
	public void setItensConsumidos(ArrayList<Produtos> itensConsumidos)
	{
		this.itensConsumidos = itensConsumidos;
	}
	public Double getTaxaServico()
	{
		return taxaServico;
	}
	public void setTaxaServico(Double taxaServico)
	{
		this.taxaServico = taxaServico;
	}
	
	public void CarregaItens()
	{
		for (Produtos produtofor : itensConsumidos) {
			System.out.println("Descrição Produto:" + produtofor.toString());
		}
	}
	public void CriarPedido()
	{
		Pizzas pizza = new Pizzas();
		System.out.println("Pedido Criado com sucesso!");
		System.out.println("Cliente:" + nomeCliente);
		CarregaItens();
		System.out.println("Taxa Serviço:" + taxaServico + "\n");
		
	}
}
