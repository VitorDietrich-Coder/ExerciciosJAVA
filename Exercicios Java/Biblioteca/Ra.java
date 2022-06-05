package br.fag.edu.herancabiblioteca;

public class Ra extends Aluno
{
	private int id;
	public Ra(int id,String nome, String cpf, String endereco, int idade, String sexo, String curso)
	{
		super(nome, cpf, endereco, idade, sexo, curso);
		this.id = id;
	
	}
	public int getRa()
	{
		return id;
	}
	public void setRa(int id)
	{
		this.id = id;
	}
	
	public String toString()
	{
		 return "Ra: " + getRa() + " " + super.toString();
	}
}
