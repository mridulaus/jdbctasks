package com.xworkz.scamlists.tester;


	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	import com.xworkz.scamlists.constant.JdbcConstant;
	import com.xworkz.scamlists.dto.*;
	import static com.xworkz.scamlists.constant.JdbcConstant.*;
	public class ScamOldestTester {



		public static void main(String[] args) {
			try (Connection connection = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,
					JdbcConstant.password)) {

				// String query = "select count(s_id) from indian_scams";
				String query = "select * from indian_scams where s_year = (select min(s_year) from indian_scams)";
				Statement stm = connection.createStatement();
				stm.execute(query);
				ResultSet resultset = stm.getResultSet();
				ScamDTO dto = new ScamDTO();

				List<ScamDTO> user = new ArrayList<ScamDTO>(); // to print multiple elements
				while (resultset.next()) {
					System.out.println("row exist");
					ScamDTO users = new ScamDTO(); // default const
					dto.setS_amount(resultset.getInt("s_year")); // we ll get d element which is inside d where condition

					String name = resultset.getString("s_name");
					int id = resultset.getInt("s_id");
					String type = resultset.getString("s_type");
					int year = resultset.getInt("s_year");
					String by = resultset.getString("s_by");
					int amount = resultset.getInt("s_amount");
					String location = resultset.getString("s_location");

					ScamDTO dto1 = new ScamDTO(name, id, type, year, by, amount, location); // param const
					System.out.println(dto1);
					user.add(dto);
					System.out.println("print result   " + user.add(dto));

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
