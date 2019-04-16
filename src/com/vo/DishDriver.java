package com.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DishDriver {

	public static List<String> filterDishByCalories(List<Dish> dishes){
		
		ArrayList<String> newDishList = new ArrayList<>();
		
		for (Dish dish : dishes) {
		
			if(dish.getCalories() > 300 && dish.isVegetarian()) {
				newDishList.add(dish.getName());
			}
		}
		
		return newDishList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dish> dishList = new ArrayList<>();
		
		dishList.add(new Dish(false,"Pork Fry",800,DishType.MEAT));
		dishList.add(new Dish(false,"Pepper Chicken",700,DishType.MEAT));
		dishList.add(new Dish(false,"BBQ Ribs",600,DishType.MEAT));
		dishList.add(new Dish(true,"French Fries",500,DishType.OTHER));
		dishList.add(new Dish(true,"Double Cheeze Pizza",400,DishType.OTHER));
		dishList.add(new Dish(true,"Season Fruit",120,DishType.OTHER));
		dishList.add(new Dish(false,"Salmon",500,DishType.FISH));
		dishList.add(new Dish(false,"Prawns",300,DishType.FISH));
		dishList.add(new Dish(true,"Rice Pudding",200,DishType.OTHER));
		
//		Comparator<Dish> comparator = (Dish d1,Dish d2) -> {
//			if(d1.getCalories() > d2.getCalories()) {
//				return 1;
//			}else if(d1.getCalories() < d2.getCalories()) {
//				return -1;
//			}
//			
//			return 0;
//		};
//		
//		Collections.sort(dishList,comparator);
//		
//		for (Dish dish : dishList) {
//			System.out.println(dish);
//		}
		
		List<String> dishs = filterDishByCalories(dishList);
		
		for (String dish : dishs) {
			System.out.println(dish);
		}
		

	}

}

