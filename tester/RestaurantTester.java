package com.xworkz.restaurant.tester;
import com.xworkz.restaurant.constant.RestoType;
import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOImpl;
import com.xworkz.restaurant.dto.*;

import java.util.Collection;

import com.xworkz.restaurant.constant.*;
public class RestaurantTester {

	public static void main(String[] args) {
		
RestaurantDTO dto = new RestaurantDTO("Bake n Shake" ,"Bhatkal" , "freekShake" ,true,RestoType.CAFE);
RestaurantDTO dto1  = new RestaurantDTO("Sensation" ,"Bhatkal" , "Sizzler" ,true,RestoType.KOREAN);
RestaurantDTO dto2 = new RestaurantDTO("Cool Cafe" ,"Jaali" , "Chicken Burger" ,true,RestoType.CAFE);
RestaurantDTO dto3 = new RestaurantDTO("Zatar" ,"Murdeshwara" , "Chicken Mandi" ,true,RestoType.ARABIAN);
RestaurantDTO dto4 = new RestaurantDTO("jos cafe " ,"kumta" , "sandwich" ,true,RestoType.CAFE);
RestaurantDTO dto5  = new RestaurantDTO("machali" ,"Honnavara" , "FishThali" ,true,RestoType.FAST_FOOD);
RestaurantDTO dto6 = new RestaurantDTO("Amruth Hotel" ,"Karwar" , "Tisre Sukha" ,true,RestoType.NONVEG);
RestaurantDTO dto7 = new RestaurantDTO("CCD" ,"Ankola" , "Cappuccino" ,true,RestoType.CAFE);

RestaurantDAO dao = new RestaurantDAOImpl();
dao.save(dto);
dao.save(dto1);
dao.save(dto2);
dao.save(dto3);
dao.save(dto4);
dao.save(dto5);
dao.save(dto6);
dao.save(dto7);

System.out.println(dao.fingByName("machali"));

Collection<RestaurantDTO> collection = dao.findByType(RestoType.CHINESE);
collection.forEach(ref->System.out.println(ref));

System.out.println(dao.updateTypeByName(RestoType.ARABIAN, "Chicken Mandi"));

System.out.println(dao.deletedByTypeAndName(RestoType.NONVEG, "Tisre Sukha"));
	}
	

}
