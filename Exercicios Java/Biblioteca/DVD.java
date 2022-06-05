package br.fag.edu.herancabiblioteca;

public class DVD extends Obra

{
	private String duracao ;
	private String produtora;
	private String genero;


	private int numeroClassificacao;
	public DVD(String titulo, String dataPublicacao, String idioma, String publicoAlvo, String duracao, String produtora, String genero, int numeroClassificacao)
	{
		super(titulo, dataPublicacao, idioma, publicoAlvo);
		this.duracao = duracao;
		this.produtora = produtora;
		this.genero = genero;	 
		this.numeroClassificacao = numeroClassificacao;
	}
	public String getDuracao()
	{
		return duracao;
	}
	public void setDuracao(String dvd)
	{
		this.duracao = dvd;
	}
	public String getProdutora()
	{
		return produtora;
	}
	public void setProdutora(String produtora)
	{
		this.produtora = produtora;
	}
	public String getGenero()
	{
		return genero;
	}
	public void setGenero(String genero)
	{
		this.genero = genero;
	}
	
	public int getNumeroClassificacao()
	{
		return numeroClassificacao;
	}
	public void setNumeroClassificacao(int numeroClassificacao)
	{
		this.numeroClassificacao = numeroClassificacao;
	}
	public String toString()
	{
		
		return super.toString() + "\nDuracao: "  + getDuracao() + "\nProdutora: " + getProdutora() + "\nGenero: " + getGenero() + "\nNumero Classificacao: " + getNumeroClassificacao();
	}

	
	
}
