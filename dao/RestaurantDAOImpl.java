package com.xworkz.restaurant.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.xworkz.restaurant.constant.RestoType;
import com.xworkz.restaurant.dto.RestaurantDTO;
import com.xworkz.restaurant.jdbcconstant.*;
import com.xworkz.scamlists.constant.JdbcConstant;
import com.xworkz.scamlists.dto.ScamDTO;

public class RestaurantDAOImpl implements RestaurantDAO {

	@Override
	public int save(RestaurantDTO dto) {
		System.out.println(dto);
		Connection temp = null;
		int alid = 0;
		try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,JdbcConstant.password)) {
			temp = connection;
			connection.setAutoCommit(false);
			
			String query = "insert into restaurants (r_name,r_location,r_special,r_best,r_type) values ('"+dto.getName()+"' , '"+ dto.getLocation()+"' , '"+dto.getSpecialFood()+"', "+dto.isBest()+",' "+dto.getType()+"')";
			Statement statement = connection.createStatement() ;
			statement.execute(query,Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = statement.getGeneratedKeys();
			if(rs.next()) {
				int ref =rs.getInt(1);
				System.out.println(ref);
			}
			connection.commit();
			int ref = 0;
			return ref;
			
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

	@Override
	public RestaurantDTO fingByName(String name) {
		
		try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,JdbcConstant.password)) {

			
			String query = "select * from restaurants where r_name = '"+name+"'";
			Statement stm = connection.createStatement();
			stm.execute(query);
			ResultSet resultset = stm.getResultSet();
		
			if (resultset.next()) {
				System.out.println("row exist");
				 int id = resultset.getInt("r_id");
			     String restoName = resultset.getString("r_name");
     		     String location  = resultset.getString("r_location");
				String special = resultset.getString("r_special");
       		boolean  best = resultset.getBoolean("r_best");
				String rtype = resultset.getString("r_type");
			System.out.println("conver type to enum" + id);
				RestaurantDTO dto1 = new RestaurantDTO(restoName,location,special,best,RestoType.valueOf(rtype)); // param const
			dto1.setId(id);
			return dto1;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public Collection<RestaurantDTO> findByType(RestoType type) {
		Collection<RestaurantDTO> coll = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,JdbcConstant.password)) {

			
			String query = "select * from restaurants where r_type = '"+type+"'";
			Statement stm = connection.createStatement();
			stm.execute(query);
			ResultSet resultset = stm.getResultSet();
		
			while (resultset.next()) {
				System.out.println("row exist");
				 int id = resultset.getInt("r_id");
			     String restoName = resultset.getString("r_name");
     		     String location  = resultset.getString("r_location");
				String special = resultset.getString("r_special");
       		boolean  best = resultset.getBoolean("r_best");
				String restoType = resultset.getString("r_type");
			System.out.println("conver type to enum" + type);
				RestaurantDTO dto2 = new RestaurantDTO(restoName,location,special,best,RestoType.valueOf(restoType)); // param const
			dto2.setId(id);
			coll.add(dto2);
			
			return coll ;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public boolean updateTypeByName(RestoType newType, String name) {

		try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,JdbcConstant.password)) {

			connection.setAutoCommit(false);
			String update = "update restaurants set r_type = '"+newType+"' where r_name = '"+name+"'";
			Statement stm = connection.createStatement();
			stm.execute(update);
			connection.commit();
		
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return false;
	}

	@Override
	public boolean deletedByTypeAndName(RestoType newType, String name) {
		try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,JdbcConstant.password)) {

			connection.setAutoCommit(false);
			System.out.println("print deleted records");
			String delete = "delete from  restaurants where r_type = '"+newType+"' and r_name = '"+name+"'   ";
			Statement stm = connection.createStatement();
			stm.execute(delete);
			connection.commit();
		
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return false;
	}

}
