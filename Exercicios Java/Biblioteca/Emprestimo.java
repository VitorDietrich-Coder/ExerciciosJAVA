package br.fag.edu.herancabiblioteca;

public class Emprestimo
{
	private int ra;
	private Obra obra;
	private String dataemprestimo;
	private String datadevolucao;
	private int diasdeatraso  = 0;
	

	public String getDataemprestimo()
	{
		return dataemprestimo;
	}

	public void setDataemprestimo(String dataemprestimo)
	{
		this.dataemprestimo = dataemprestimo;
	}

	public float calcularMulta()
	{
	  return (float)diasdeatraso * 4;  
	}
	
	public void emprestar()
	{
		System.out.println("Emprestado");
	}
	
	public void devolver()
	{
		System.out.println("devolvido," + " multa de: " + calcularMulta());
	}
	
	public void renovar()
	{
		System.out.println("renovado");
	}

	public int getRa()
	{
		return ra;
	}

	public void setRa(int ra)
	{
		this.ra = ra;
	}

	public Obra getObra()
	{
		return obra;
	}

	public void setObra(Obra obra)
	{
		this.obra = obra;
	}

	public String getDatadevolucao()
	{
		return datadevolucao;
	}

	public void setDatadevolucao(String datadevolucao)
	{
		this.datadevolucao = datadevolucao;
	}

	public int getDiasdeatraso()
	{
		return diasdeatraso;
	}

	public void setDiasdeatraso(int diasdeatraso)
	{
		this.diasdeatraso = diasdeatraso;
	}
	
	public String toString()
	{
		return "Ra: " + getRa() + "\nObra: " + getObra() +"\nData Emprestimo: " +getDataemprestimo() + "\nData Devolucao: " +  getDatadevolucao();
	}
}
