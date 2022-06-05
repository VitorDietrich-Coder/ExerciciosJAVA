package br.fag.edu.herancabiblioteca;

public class Livro extends Obra
{
	
	private String genero;
	private int quantidadePagina;
	private String subtitulo;
	private String editora;
	private String autor;
	private int numeroClassificado;
	
	
	public Livro(String titulo, String dataPublicacao, String idioma, String publicoAlvo, String genero, int quantidadePagina, String subtitulo, String editora, String autor, int numeroClassificado)
	{
		super(titulo, dataPublicacao, idioma, publicoAlvo);
		 this.genero = genero;
		 this.quantidadePagina = quantidadePagina;
		 this.subtitulo = subtitulo;
		 this.editora = editora;
		 this.autor = autor;
		 this.numeroClassificado = numeroClassificado;
	}


	public String getGenero()
	{
		return genero;
	}


	public void setGenero(String genero)
	{
		this.genero = genero;
	}


	public int getQuantidadePagina()
	{
		return quantidadePagina;
	}


	public void setQuantidadePagina(int quantidadePagina)
	{
		this.quantidadePagina = quantidadePagina;
	}


	public String getSubtitulo()
	{
		return subtitulo;
	}


	public void setSubtitulo(String subtitulo)
	{
		this.subtitulo = subtitulo;
	}


	public int getNumeroClassificado()
	{
		return numeroClassificado;
	}


	public void setNumeroClassificado(int numeroClassificado)
	{
		this.numeroClassificado = numeroClassificado;
	}
	
	
	public String getEditora()
	{
		return editora;
	}


	public void setEditora(String editora)
	{
		this.editora = editora;
	}


	public String getAutor()
	{
		return autor;
	}


	public void setAutor(String autor)
	{
		this.autor = autor;
	}


	public String toString()
	{
		return super.toString() + "\nGenero: "  + getGenero() + "\nQuantidade de Paginas: " + getQuantidadePagina() + "\nSubtitulo: " + getSubtitulo() + "\nEditora: " + getEditora() +  "\nAutor: " + getAutor() + "\nNumero Classificacao: " + getNumeroClassificado();
	}

	
	 
}
