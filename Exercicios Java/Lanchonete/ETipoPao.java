package br.fag.edu.br.Lanchonete;

public enum ETipoPao
{
	frances("Francês"), bengala("Bengala");


	private String descricao;

	ETipoPao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
