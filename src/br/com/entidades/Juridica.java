package br.com.entidades;

public class Juridica extends Pessoa{
	private String cnpj;

	public Juridica() {
		super();
	}

	public Juridica(String nome) {
		super(nome);
	}

	public String getCNPJ() {
		return cnpj;
	}

	public String getNome() {
		return super.getNome();
	}
}
