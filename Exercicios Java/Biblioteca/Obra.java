package br.fag.edu.herancabiblioteca;

public class Obra 
{
	private String titulo;
	private String dataPublicacao;
	private	String idioma;
	private String publicoAlvo;
	
	public Obra(String titulo, String dataPublicacao, String idioma,  String publicoAlvo)
	{
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
		this.idioma = idioma;
		this.publicoAlvo = publicoAlvo;		
	}
	
	
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getDataPublicacao()
	{
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao)
	{
		this.dataPublicacao = dataPublicacao;
	}
	public String getIdioma()
	{
		return idioma;
	}
	public void setIdioma(String idioma)
	{
		this.idioma = idioma;
	}
	public String getPublicoAlvo()
	{
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo)
	{
		this.publicoAlvo = publicoAlvo;
	}
	
	
	public String toString()
	{
		 return "\nTítulo: " + getTitulo() + "\nDataPublicacao: " + getDataPublicacao() + "\nIdioma: " + getIdioma() + "\nPublicoAlvo: " + getPublicoAlvo();
	}
}
