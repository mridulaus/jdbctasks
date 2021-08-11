package com.xworkz.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.restaurant.dto.RestaurantDTO;
import com.xworkz.restaurant.jdbcconstant.*;

public class RestaurantDAOImpl implements RestaurantDAO {

	@Override
	public int save(RestaurantDTO dto) {
		System.out.println(dto);
		Connection temp = null;
		
		try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,JdbcConstant.password)) {
			temp = connection;
			connection.setAutoCommit(false);
			
			String query = "insert into restauranT_table values (5,'"+dto.getName()+"' , '"+ dto.getLocation()+"' , '"+dto.getSpecialFood()+"', "+dto.isBest()+",' "+dto.getType()+"')";
			Statement statement = connection.createStatement() ;
			statement.execute(query);
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				temp.rollback();
			}catch(SQLException e1) {
			e1.printStackTrace();	
			}
		}
		return 0;
	}

}
