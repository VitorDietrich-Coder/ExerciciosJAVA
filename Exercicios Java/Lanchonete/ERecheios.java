package br.fag.edu.br.Lanchonete;

public enum ERecheios
{
	frango(2.00), calabresa(3.50), queijo(4.50), strogonoffCarne(4.00), pizza(3.00), carne(5.00), hamburguer(4.00);
	
	private Double valor;

	ERecheios(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
	
	public double setfrango(Double valor)
	{
		return this.frango.valor = valor;
	}
	
	public double setcalabresa(Double valor)
	{
		return this.calabresa.valor = valor;
	}
	public double setqueijo(Double valor)
	{
		return this.queijo.valor = valor;
	}
	
	public double setstrogonoffCarne(Double valor)
	{
		return this.strogonoffCarne.valor = valor;
	}
	
	public double setpizza(Double valor)
	{
		return this.pizza.valor = valor;
	}
	public double setcarne(Double valor)
	{
		return this.carne.valor = valor;
	}
	
	public double sethamburguer(Double valor)
	{
		return this.hamburguer.valor = valor;
	}
}
