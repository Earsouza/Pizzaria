package model;

public class Cliente extends Pessoa{
	
	private String telefone;

	public Cliente() {
	}
	 
	public Cliente(String nome, String cpf, String telefone) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


}
