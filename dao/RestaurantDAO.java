package com.xworkz.restaurant.dao;

import java.util.Collection;

import com.xworkz.restaurant.constant.RestoType;
import com.xworkz.restaurant.dto.RestaurantDTO;

public interface RestaurantDAO {
	
public int save(RestaurantDTO dto);

RestaurantDTO fingByName(String name);

Collection<RestaurantDTO> findByType(RestoType type);

boolean updateTypeByName(RestoType newType,String name);
boolean deletedByTypeAndName(RestoType newType,String name);

}
