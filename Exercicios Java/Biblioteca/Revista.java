package br.fag.edu.herancabiblioteca;

public class Revista extends Obra
{
	private String tema;
	private String editora;
	private int quantidadePagina;

	public Revista(String titulo, String dataPublicacao, String idioma, String publicoAlvo, String tema, String editora,
			int quantidadePagina)
	{
		super(titulo, dataPublicacao, idioma, publicoAlvo);
		this.tema = tema;
		this.editora = editora;
		this.quantidadePagina = quantidadePagina;
	}

	public String getTema()
	{
		return tema;
	}

	public void setTema(String tema)
	{
		this.tema = tema;
	}

	public String getEditora()
	{
		return editora;
	}

	public void setEditora(String editora)
	{
		this.editora = editora;
	}

	public int getQuantidadePagina()
	{
		return quantidadePagina;
	}

	public void setQuantidadePagina(int quantidadePagina)
	{
		this.quantidadePagina = quantidadePagina;
	}

	public String toString()
	{
		return super.toString() + "\nTema:" + getTema() + "\nEditora: " + getEditora() + "\nQuantidade de Paginas: " + getQuantidadePagina();
	}
}
