package br.com.siberius.vinhos.model;

public enum TipoVinho {

	TINTO("Tinto"),
	BRANCO("Branco"),
	ROSE("Rose");
	
	private String descricao;

	private TipoVinho(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
	
	
	
}
