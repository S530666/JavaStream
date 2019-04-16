package com.vo;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dish> dishList = new ArrayList<>();
		
		Dish d = new Dish(false,"Pork Fry",800,DishType.MEAT);
		dishList.add(new Dish(false,"Pork Fry",800,DishType.MEAT));
		dishList.add(new Dish(false,"Pepper Chicken",700,DishType.MEAT));
		dishList.add(new Dish(false,"BBQ Ribs",600,DishType.MEAT));
		dishList.add(new Dish(true,"French Fries",500,DishType.OTHER));
		dishList.add(new Dish(true,"Double Cheeze Pizza",400,DishType.OTHER));
		dishList.add(new Dish(true,"Season Fruit",120,DishType.OTHER));
		dishList.add(new Dish(false,"Salmon",500,DishType.FISH));
		dishList.add(new Dish(false,"Prawns",300,DishType.FISH));
		dishList.add(new Dish(true,"Rice Pudding",200,DishType.OTHER));
		
		System.out.println(" Size : "+dishList.size());
		
		System.out.println(dishList.contains(d));
	}

}
