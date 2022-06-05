package br.fag.edu.br.Lanchonete;

public enum EMassas
{
	MassaSalgada("Massa Salgada"), MassaFolhada("Massa Folhada");

	private String descricao;

	EMassas(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
	