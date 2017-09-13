package br.com.gruposervices.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBanco {

	//INFORMAÇÕES DE CONEXAO
	private static  String usuario = "****";
	private static  String senha = "****";
	
	private static  String database = "******";
	
	
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
