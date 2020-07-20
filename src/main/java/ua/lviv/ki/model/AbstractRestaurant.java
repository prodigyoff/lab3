package ua.lviv.ki.model;

public abstract class AbstractRestaurant {
	protected int caloriesAmount;
	protected int dishPopularityIndex;
	protected int dishPriceInUAH;
	protected String dishName;
	protected DishType dishType;
	
	
	public AbstractRestaurant() {
		
	}
	
	public AbstractRestaurant(int caloriesAmount, int dishPopularityIndex, int dishPriceInUAH, String dishName,
			DishType dishType) {
		this.caloriesAmount = caloriesAmount;
		this.dishPopularityIndex = dishPopularityIndex;
		this.dishPriceInUAH = dishPriceInUAH;
		this.dishName = dishName;
		this.dishType = dishType;
	}

	public int getCaloriesAmount() {
		return caloriesAmount;
	}

	public void setCaloriesAmount(int caloriesAmount) {
		this.caloriesAmount = caloriesAmount;
	}

	public int getDishPopularityIndex() {
		return dishPopularityIndex;
	}

	public int getDishPriceInUAH() {
		return dishPriceInUAH;
	}

	public String getDishName() {
		return dishName;
	}

	public DishType getDishType() {
		return dishType;
	}

	public void setDishPopularityIndex(int dishPopularityIndex) {
		this.dishPopularityIndex = dishPopularityIndex;
	}

	public void setDishPriceInUAH(int dishPriceInUAH) {
		this.dishPriceInUAH = dishPriceInUAH;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public void setDishType(DishType dishType) {
		this.dishType = dishType;
	}
	
}
