package br.com;

import br.com.entidades.Aluno;
import br.com.exceptions.ValidarLoginException;

public class MainClass {

	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("000.000.000-000", "camila", "62106", "284655");
			aluno.setLogin();
			System.out.println("PASSOU AQUI");
			
		} catch (ValidarLoginException e) {
			e.printStackTrace();
		}
		
	}

}
