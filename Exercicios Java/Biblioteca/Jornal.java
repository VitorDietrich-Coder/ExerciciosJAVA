package br.fag.edu.herancabiblioteca;

public class Jornal extends Obra
	
{
	private int quantidadePagina;
	private String editora;
	
	public Jornal(String titulo, String dataPublicacao, String idioma, String publicoAlvo, int quantidadePagina, String editora)
	{
		super(titulo, dataPublicacao, idioma, publicoAlvo);
		this.setQuantidadePagina(quantidadePagina);
		this.setEditora(editora);
	}

	public int getQuantidadePagina()
	{
		return quantidadePagina;
	}

	public void setQuantidadePagina(int quantidadePagina)
	{
		this.quantidadePagina = quantidadePagina;
	}

	public String getEditora()
	{
		return editora;
	}

	public void setEditora(String editora)
	{
		this.editora = editora;
	}
		
	public String toString()
	{
		return super.toString() + "\nQuantidade de Paginas: " + getQuantidadePagina() + "\nEditora: " + getEditora();
	}
}
