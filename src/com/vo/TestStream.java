package com.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

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
		
//		Stream<Dish> stream = dishList.stream();
//		Stream<Dish> stream1 = stream.filter((Dish d)-> {return d.getCalories()>300;});
//		List<Dish> dish = stream1.collect(Collectors.toList());
//		
//		dish.forEach(System.out::println);
		
		List<String> dishs = dishList.stream().filter((Dish d1) ->  { return d1.getCalories() > 300;}).map((Dish d)->{return d.getName();}).collect(Collectors.toList());
		
		dishs.forEach(System.out::println);
	}

}
