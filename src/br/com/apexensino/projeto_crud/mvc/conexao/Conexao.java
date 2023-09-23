package br.com.apexensino.projeto_crud.mvc.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	// Método de conexão com o banco de dados
	public Connection conectar() {
		// Criando a variável do tipo de retorno da Classe Connection
		Connection retornoConexao = null;
		// Tentativa de conexão
		try {
			// Referenciar o JDBC
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			// Dados do servidor 
			String dadosServidor = "jdbc:sqlserver://localhost:1433;databaseName=projeto_crud;user=sa;password=12345678;encrypt=false";
			
			// Retorno conexão
			retornoConexao = DriverManager.getConnection(dadosServidor);
			
			// Mensagem de sucesso
			System.out.println("Conectado com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha ao conectar " + e.getMessage());

		}
		
		
		// Retorno da Conexão
		return  retornoConexao;
	   
	}

}
