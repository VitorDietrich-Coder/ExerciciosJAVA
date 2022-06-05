package br.fag.edu.br.Lanchonete;

public enum ETipos
{
	frita("Frito"), assada("Assado");

	private String descricao;

	ETipos(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
