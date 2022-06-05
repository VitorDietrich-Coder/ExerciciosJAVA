package br.fag.edu.br.Lanchonete;

public enum EMolhos
{
	molhocompimenta("Molho com pimenta"), branco("Branco"), tomate("Tomate"), molhodacasa("Molho da casa");


	private String descricao;

	EMolhos(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
