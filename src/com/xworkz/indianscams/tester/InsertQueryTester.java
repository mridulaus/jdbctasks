package com.xworkz.indianscams.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class InsertQueryTester {

	public static void main(String[] args)  {
		
						String username = "root";
						String password = "mradula@96";
						String url = "jdbc:mysql://localhost:3306/indianscams";
						
		              
						try ( Connection connection = DriverManager.getConnection(url, username, password)){
							
							System.out.println(connection);
							
String query3 = "insert into indian_scams values (3,'Jet','misappropriation',2010,'jetairwayscompany',15000000,'ahmedabad','PNB was the first major banking fraud reported in the country, involving a massive amount of around Rs. 15000 crores. ')"; 
//String query2  = "insert into indian_scams values(2,'KLA','corporatefrauds',2009 ,' Vijay Mallya,' 9000,'banglore','The company resorted to borrowing funds by all possible means, including related parties and pledge of Kingfisher brand by over-valuation of brand value. Good times did not last long, and Vijay Malia had to .')";
//String query3 = "insert into indian_scams values(2,'Jet Airways','misappropriation', 2010,'jetairwayscompany',25000000,'mumbai,'Jet had acquired an unassailable position in the industry and was a preferred airline for the business community, top industrialists and CEOs of the country. Its service standards were its USP.') ";
//String query4 = "insert into indian_scams values(4,'PNB','banking fraud',2018,'Niravmodi',15000000,'ahmedabad','PNB was the first major banking fraud reported in the country, involving a massive amount of around Rs. 15000 crores. Fraud was committed by Nirav Modi and Mehul Choksi, (through Gitanjali Gems, a listed company owned by him). Both were in the business of importing rough diamonds and exporting polished diamonds.') ";
//String query5 = "insert into indian_scams values(5,'ILFS','corporate fraud',2017,'IL&FS',91000000,'ILFS fraud was the largest corporate fraud in India and triggered a showdown in the economy, as the company was a key vehicle for infrastructure development of the country.') ";
//String query6 = "insert into indian_scams values(6,'PMCBank','perpetuatedfraud',2011,'PravinRaut',7000000,'Around 70 percent of its total loan book of Rs 8,383 crore as on March 31, 2019, had been taken by real estate firm HDIL.') ";






							Statement statement = connection.createStatement(); 

							statement.execute(query3); //execute  the query
//							statement.execute(query2);
//							statement.execute(query3);
//							statement.execute(query4);
//							statement.execute(query5);
//							statement.execute(query6);
						}  catch (SQLException e) {
							e.printStackTrace();
						} 

					
				

		

}

}
