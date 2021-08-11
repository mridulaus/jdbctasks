package com.xworkz.restaurant.tester;
import com.xworkz.restaurant.constant.RestoType;
import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOImpl;
import com.xworkz.restaurant.dto.*;
import com.xworkz.restaurant.constant.*;
public class RestaurantTester {

	public static void main(String[] args) {
		
RestaurantDTO dto = new RestaurantDTO("Bake n Shake" ,"Bhatkal" , "freekShake" ,true,RestoType.CAFE);
RestaurantDAO dao = new RestaurantDAOImpl();
dao.save(dto);

	}

}
