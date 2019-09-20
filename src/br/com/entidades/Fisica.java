package br.com.entidades;

public class Fisica extends Pessoa {
	private String cpf;

	public Fisica(String nome) {
		super(nome);
	}

	public String getCPF() {
		return cpf;
	}
}
