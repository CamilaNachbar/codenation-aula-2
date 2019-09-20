package br.com.entidades;

public abstract class Pessoa {
	protected String xNome;

	protected Pessoa() {
		xNome = "Sem nome";
	}

	protected Pessoa(String nome) {
		xNome = nome;
	}

	public String getNome() {
		return xNome;
	}

}
