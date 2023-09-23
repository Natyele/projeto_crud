package br.com.apexensino.projeto_crud.principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.apexensino.projeto_crud.mvc.conexao.Conexao;

public class Principal {

	public static void main(String[] args) throws SQLException {
		// Instanciar um objeto da classe Conexão
		Conexao conexao = new Conexao();
		String sql = "SELECT * FROM tabela";
		Statement createStatement = conexao.conectar().createStatement();

	}

	public static void createStatement() {
		// Criar um objeto da classe de conexão
		Conexao conexao = new Conexao();

		// Comandos SQL
		String sql = "SELECT * FROM tabela";
		try {
			// Objeto contendo a ação de seleção
			Statement createStatement = conexao.conectar().createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void createPreparedStantementWithResultSet() {
		Conexao conexao = new Conexao();
		// Comando SQL
		String sql = "SELECT * FROM tabela WHERE coluna = ?";
		try {
			// PreparedStatement
			PreparedStatement preparedStatement = conexao.conectar().prepareStatement(sql);
			int parametro = 1;
			// Passagem do parâmetro
			preparedStatement.setInt(1, parametro);
			ResultSet executeQuery = preparedStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void createPreparedStantement() {
		Conexao conexao = new Conexao();
		// Comando SQL

		String sql = "SELECT * FROM tabela WHERE coluna = ?";
		try {
			// PreparedStatement
			PreparedStatement preparedStatement = conexao.conectar().prepareStatement(sql);
			int parametro = 1;
			// Passagem do parâmetro
			preparedStatement.setInt(1, parametro);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}