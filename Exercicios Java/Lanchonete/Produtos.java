package br.fag.edu.br.Lanchonete;

public class Produtos implements IProdutos
{
	private Double precoVenda;
	private String dataValidade;
	private String peso;
	public Double getPrecoVenda()
	{
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda)
	{
		this.precoVenda = precoVenda;
	}
	public String getDataValidade()
	{
		return dataValidade;
	}
	public void setDataValidade(String dataValidade)
	{
		this.dataValidade = dataValidade;
	}
	public String getPeso()
	{
		return peso;
	}
	public void setPeso(String peso)
	{
		this.peso = peso;
	}
	@Override
	public void AlteraValorProduto()
	{
	}
	public String toString()
	{
		return "\nPreço Venda:" + precoVenda + "\nData Validade: " + dataValidade + "\nPeso: " + peso;
		
	}
}

