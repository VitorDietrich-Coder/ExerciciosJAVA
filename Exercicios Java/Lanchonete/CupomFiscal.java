package br.fag.edu.br.Lanchonete;

public class CupomFiscal
{
	private double valorRecebido;
	private double valorTotal;
	private double troco;
		
	CupomFiscal(double valorRecebido, double valorTotal)
	{
		this.valorRecebido = valorRecebido;
		this.valorTotal = valorTotal;
	}

	public double getValorRecebido()
	{
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido)
	{
		this.valorRecebido = valorRecebido;
	}

	public double getValorTotal()
	{
		return valorTotal;
	}

	public void setValorTotal(double valorTotal)
	{
		this.valorTotal = valorTotal;
	}
 
	public Double CalculaTroco()
	{	
		troco = valorRecebido - valorTotal;
		System.out.println("Seu troco é: " + troco);
		return troco;		
	}
	
	public void ImprimirRecibo()
	{
		Pedido pedido = new Pedido();
		double valortaxa = pedido.getTaxaServico();
		valorTotal += valortaxa;
		System.out.println("Valor recebido:" + valorRecebido);
		System.out.println("Valor total:" + valorTotal);
		CalculaTroco();
	}
}
