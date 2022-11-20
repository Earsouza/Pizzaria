package model;

import java.util.Date;

public class Funcionario extends Pessoa {
	private String funcao;
	private String email;
	private Date dataNascimento;

	Funcionario() {

	}

	public Funcionario(String nome, String cpf, String funcao, String email, Date dataNascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.funcao = funcao;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
