package br.fag.edu.herancabiblioteca;

public class Aluno
{
	private String nome;
	private String cpf;
	private	String endereco;
	private int idade;
	private String sexo;
	private String curso;
	
	public Aluno(String nome, String cpf, String endereco, int idade, String sexo, String curso)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
		this.curso = curso;
	}
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getCpf()
	{
		return cpf;
	}
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	public String getEndereco()
	{
		return endereco;
	}
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	public int getIdade()
	{
		return idade;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	public String toString()
	{
		 return "\nNome: " +  getNome() + "\nCpf: " + getCpf() + "\nEndereco: " +  getEndereco() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo();
	}
}
