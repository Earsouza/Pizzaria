package model;

import controller.ConexaoDAO;

public class Main {

	public static void main(String[] args) {
		ConexaoDAO conexao = new ConexaoDAO();
		if(conexao.estaConectado()) {
			System.out.println("CONECTADO");
		}
		conexao.conectar();
		conexao.listarPedidos();

	}

}
