package br.com.softbit.couchmobile.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	private Connection conn = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private String host = "localhost"; //"couch-mobile-db.mysql.uhserver.com";
	private String db = "couch_mobile_db";
	private int port = 3306;
	private String usuario = "elton"; //"eltonmozart";
	private String senha = "123456";//"Mnbvcxz12@";
	private String url = "jdbc:mysql://%s:%d/%s";
	private String driver = "com.mysql.jdbc.Driver";
	
	public Database(){
		
	}
	
	public boolean connect(){
		boolean status = false;
		this.url = String.format(this.url, this.host, this.port, this.db);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, senha);
			statement = conn.createStatement();
			status = true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public ResultSet makeQuery(String query){
		try {
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
}
