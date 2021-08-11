package com.xworkz.restaurant.dto;

import java.io.Serializable;

import com.xworkz.restaurant.constant.RestoType;

public class RestaurantDTO implements Serializable {
	private String name;
	private String location;
	private String specialFood;
	private boolean best;
	private RestoType type;
	public RestaurantDTO(String name, String location, String specialFood, boolean best, RestoType type) {
	
		this.name = name;
		this.location = location;
		this.specialFood = specialFood;
		this.best = best;
		this.type = type;
	}
	public RestaurantDTO() {
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((specialFood == null) ? 0 : specialFood.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestaurantDTO other = (RestaurantDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (specialFood == null) {
			if (other.specialFood != null)
				return false;
		} else if (!specialFood.equals(other.specialFood))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RestaurantDTO [name=" + name + ", location=" + location + ", specialFood=" + specialFood + ", best="
				+ best + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSpecialFood() {
		return specialFood;
	}
	public void setSpecialFood(String specialFood) {
		this.specialFood = specialFood;
	}
	public boolean isBest() {
		return best;
	}
	public void setBest(boolean best) {
		this.best = best;
	}
	public RestoType getType() {
		return type;
	}
	public void setType(RestoType type) {
		this.type = type;
	}
	
	
	

}
