package com.xworkz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class TechnlogyTester {

	public static void main(String[] args) {
		
		

				String username = "root";
				String password = "mradula@96";
				String url = "jdbc:mysql://localhost:3306/transformers";
				String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
               Connection connection = null;
				try {
					Class.forName(fqnOfDriverImpl);// load m reg driver class
					connection = DriverManager.getConnection(url, username, password); // connection
					System.out.println(connection);
					
					
					
					
					String query = "insert into technologies_table values (8,'React JS','Jordan Walke',2013,'no')"; //query/statements

					Statement statement = connection.createStatement(); //cretae

					statement.execute(query); //execute

				} catch (SQLIntegrityConstraintViolationException e) {
					e.printStackTrace();
				} catch (SQLSyntaxErrorException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

			finally {
				
				try {
					connection.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}

	}

}
