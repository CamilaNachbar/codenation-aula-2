package br.com.entidades;

import br.com.exceptions.ValidarLoginException;
import br.com.utils.ValidarCPF;

public class Aluno {

	private String nome;
	private String matricula;
	private String senha;
	private String documento;
	private String login;

	
	
	public Aluno(String documento, String nome, String matricula, String senha) {
		this.documento = documento;
		this.nome = nome;
		this.matricula = matricula;
		this.senha = senha;
	}

	// isolar comportamentos
	public boolean autenticar(String login) {
		return login != null && !login.isEmpty() && login.length() < 20 && login.contains(nome);
	}

	// Caso onde o throws é valido, por que eu quero parar a execução
	public void setLogin() throws ValidarLoginException {
		if (validaDocumento(this.documento)) {
			this.login = nome + "tokenLogin";
			imprimirDados();
			System.out.println("\nautenticado: " + autenticar(login));
		} else {
			throw new ValidarLoginException("Login Invalido");
		}
	}

	public void imprimirDados() {
		System.out.print("Nome: " + this.nome + " matricula: " + this.matricula + " documento: " + this.documento + " token " + this.login);
	}

	public boolean validaDocumento(String documento) {
		return ValidarCPF.isCPF(documento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

}
