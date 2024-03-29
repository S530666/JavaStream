package com.vo;

public class Dish implements Comparable<Dish> {
	
	private boolean vegetarian;
	private String name;
	private int calories;
	private DishType dishType;
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}

	
	public Dish(boolean vegetarian, String name, int calories, DishType dishType) {
		super();
		this.vegetarian = vegetarian;
		this.name = name;
		this.calories = calories;
		this.dishType = dishType;
	}

	


	@Override
	public int compareTo(Dish d2) {
		// TODO Auto-generated method stub
		
		if(this.getCalories()>d2.getCalories()) {
			return 1;
		}
		else if(this.getCalories()<d2.getCalories()) {
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Dish [vegetarian=" + vegetarian + ", name=" + name + ", calories=" + calories + ", dishType=" + dishType
				+ "]";
	}


	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public DishType getDishType() {
		return dishType;
	}

	public void setDishType(DishType dishType) {
		this.dishType = dishType;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((dishType == null) ? 0 : dishType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (vegetarian ? 1231 : 1237);
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
		Dish other = (Dish) obj;
		if (calories != other.calories)
			return false;
		if (dishType != other.dishType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}

}


