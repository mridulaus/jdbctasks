package com.xworkz.indianscams.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class UpdateByNameTester {

	public static void main(String[] args)  {
		
						String username = "root";
						String password = "mradula@96";
						String url = "jdbc:mysql://localhost:3306/indianscams";
						
		              
						try ( Connection connection = DriverManager.getConnection(url, username, password)){
							
							System.out.println(connection);
							

String updateQuery = "update indian_scams set s_amount = 850000 where s_name= 'Satyam computer'";




							Statement statement = connection.createStatement(); 

							statement.execute(updateQuery); //execute  the query
							
						}  catch (SQLException e) {
							e.printStackTrace();
						} 

					
				

		

}

}
