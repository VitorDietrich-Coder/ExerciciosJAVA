package br.fag.edu.br.Lanchonete;

public enum EBordasPizza
{
	catupiry(2.00), cheddar(3.50), chocolate(4.50);


	private Double valor;

	EBordasPizza(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public double setCatupiry(Double valor)
	{
		return this.catupiry.valor = valor;
	}
	
	public double setcheddar(Double valor)
	{
		return this.cheddar.valor = valor;
	}
	public double setChocolate(Double valor)
	{
		return this.chocolate.valor = valor;
	}
}
