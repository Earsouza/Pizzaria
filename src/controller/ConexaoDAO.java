package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDAO {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/pizzaria";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());

		}
	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void listarPedidos() {
		try {
			String query = "SELECT * from pedido ORDER BY id";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			while(this.resultset.next()) {
				System.out.println("ID: " + this.resultset.getString("id") + "Descricao: " + this.resultset.getString("descricao"));
			}
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
		}
	}
	
	
}
