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
							
String scam = "insert into indian_scams values(10,'Karvy Scam','StockBroking','2020-11-22',' Karvy',2000,'Hydrebad','On November 22, the SEBIpassed an ex parte ad interim order against Karvy Stock Broking')";
String scam1 = "insert into indian_scams values(20,'PNB Scam','jeweller anddesigner','1969-7-19','PNB',11356.84,'Mumbai','The PNB Fraud Case relates tofraudulent letter of undertaking worth 11,356.84 crore')";
 String scam2 = "insert into indian_scams values(30,'DHFL Scam','Fake accountlending','2018-6-22','DHFL',14000,'Banglore',' DHFL Directors Conned Over Rs14,000 Crore in 2 Lakh Fake Loan Accounts Under PM Housing Fund')";
String scam3 = "insert into indian_scams values(40,'Reruitmentscam','Reciting','2021-2-28','VKPurohit',2000,'Delhi','Input received about the alleged involment of servingpersonnel in accepting bribes')";
String scam4 = "insert into indian_scams values(50,'KeralaGoldSmuggling','GoldSmuggling','2020-6-22','Kerala govt',10000,'Kerala','Customer official at airport carring baggage from dubai')";
String scam5 = "insert into indian_scams values(60,'TRP scam','TRP','2020-11-10','national tv',10000,'Mumbai','Files Charge sheet against National Republic tv')";
String scam6 = "insert into indian_scams values(70,'Roshini land Scam','Land scam','2020-11-4','Roshini',25000,'JammuKashmir','Accuried land givrn to homless of J&K')";
String scam7 = "insert into indian_scams values(80,'Amarapali Adya scam','Trading Scam','2019=8-2','Amrapali',200000,'India','It fraud investors by using their shares')";
String scam8 = "insert into indian_scams values(90,'SandalWoodDrugScam','Drug scam','2019-9-5','KannadaCinemaIndustry',100000,'Karnata','Kannada Film indystry is segment dedicated to the production')";
String scam9 = "insert into indian_scams values (100,'Jet','misappropriation',2010,'jetairwayscompany',15000000,'ahmedabad','PNB was the first major banking fraud reported in the country, involving a massive amount of around Rs. 15000 crores. ')"; 
String scam10  = "insert into indian_scams values(101,'KLA','corporatefrauds',2009 ,' Vijay Mallya,' 9000,'banglore','The company resorted to borrowing funds by all possible means, including related parties and pledge of Kingfisher brand by over-valuation of brand value. Good times did not last long, and Vijay Malia had to .')";
String scam11 = "insert into indian_scams values(102,'Jet Airways','misappropriation', 2010,'jetairwayscompany',25000000,'mumbai,'Jet had acquired an unassailable position in the industry and was a preferred airline for the business community, top industrialists and CEOs of the country. Its service standards were its USP.') ";
String scam12 = "insert into indian_scams values(103,'PNB','banking fraud',2018,'Niravmodi',15000000,'ahmedabad','PNB was the first major banking fraud reported in the country, involving a massive amount of around Rs. 15000 crores. Fraud was committed by Nirav Modi and Mehul Choksi, (through Gitanjali Gems, a listed company owned by him). Both were in the business of importing rough diamonds and exporting polished diamonds.') ";String query5 = "insert into indian_scams values(5,'ILFS','corporate fraud',2017,'IL&FS',91000000,'ILFS fraud was the largest corporate fraud in India and triggered a showdown in the economy, as the company was a key vehicle for infrastructure development of the country.') ";
String scam13 = "insert into indian_scams values(104,'PMCBank','perpetuatedfraud',2011,'PravinRaut',7000000,'Around 70 percent of its total loan book of Rs 8,383 crore as on March 31, 2019, had been taken by real estate firm HDIL.') ";


String scam14="insert into indian_scams values(105,' Coalgate Scam ',' Coalgate',2012,'UPA government',186000,'UP',' is a political scandal that surfaced in 2012 when the UPA government was in power')";
String scam15="insert into scam values(106,'2G Spectrum scam','2G',2008,' Raja',176000,'india',' Supreme Court and led to the cancellation of over 120 licenses.')";
String scam16="insert into scam values(107,'Commonwealth Games scam','game',2010,'Suresh Kalmadi',70000,'india','the Commonwealth Games held in India made more headlines for the controversies')";

String scam17="insert into scam values(108,'BOFORS scandal','weapon',1986,'Rajiv Gandhi',64,'india','This is a major weapons contract scandal that took place between India and Sweden')";

String scam18="insert into scam values(109,'AgustaWestland chopper scam','AgustaWestland chopper',2010  ,'UPA government ', 3600 ,'UP' ,'some politicians and defence officials received bribes')";
String scam19="insert into scam values(110,'Satyam scam','corporate',2009  ,'B Ramalinga Raju ',14000  ,'india' ,'in front of its board, stock exchanges, investors and other stakeholders. ')";
String scam20="insert into scam values(111,'Hawala scam ','black money', 1990 ,'Hawala brothers',18  ,'india' ,'black money were done by these politicians through the brothers.  ')";





							Statement statement = connection.createStatement(); 

							statement.execute(scam); //execute  the query
							statement.execute(scam1);
							statement.execute(scam2);
						statement.execute(scam3);
						statement.execute(scam4);
						statement.execute(scam5);
						statement.execute(scam6);
						statement.execute(scam7);
					statement.execute(scam8);
					statement.execute(scam9);
					statement.execute(scam10);
					statement.execute(scam11);
					statement.execute(scam12);
				statement.execute(scam13);
				statement.execute(scam14);
				statement.execute(scam15);
				statement.execute(scam16);
				statement.execute(scam17);
				statement.execute(scam18);
				statement.execute(scam19);
				statement.execute(scam20);
						}  catch (SQLException e) {
							e.printStackTrace();
						} 

					
				

		

}

}
