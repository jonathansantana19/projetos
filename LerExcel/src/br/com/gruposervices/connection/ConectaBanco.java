package br.com.gruposervices.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBanco {

	//INFORMAÇÕES DE CONEXAO
	private static  String usuario = "importacao_app";
	private static  String senha = "b3z0wr0";
	
	private static  String database = "dba_gruposervices";
	
	
	public static Connection getConectaBanco() {
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String url = "jdbc:sqlserver://db1;databaseName="+database+";user="+usuario+";password="+senha;
			
			conn = DriverManager.getConnection(url);
			
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Erro" + e);
			return null;
		}
		
	}
	
	
}
