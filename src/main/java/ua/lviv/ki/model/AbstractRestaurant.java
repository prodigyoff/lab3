package ua.lviv.ki.model;

public abstract class AbstractRestaurant {
	protected int caloriesAmount;
	protected int dishPopularityIndex;
	protected int dishPriceInHryvnias;
	protected String dishName;
	protected DishType dishType;

	public AbstractRestaurant() {

	}

	public AbstractRestaurant(int caloriesAmount, int dishPopularityIndex, int dishPriceInUAH, String dishName,
			DishType dishType) {
		this.caloriesAmount = caloriesAmount;
		this.dishPopularityIndex = dishPopularityIndex;
		this.dishPriceInHryvnias = dishPriceInUAH;
		this.dishName = dishName;
		this.dishType = dishType;
	}

	public int getCaloriesAmount() {
		return caloriesAmount;
	}

	public void setCaloriesAmount(final int caloriesAmount) {
		this.caloriesAmount = caloriesAmount;
	}

	public int getDishPopularityIndex() {
		return dishPopularityIndex;
	}

	public int dishPriceInHryvnias() {
		return dishPriceInHryvnias;
	}

	public String getDishName() {
		return dishName;
	}

	public DishType getDishType() {
		return dishType;
	}

	public void setDishPopularityIndex(final int dishPopularityIndex) {
		this.dishPopularityIndex = dishPopularityIndex;
	}

	public void setDishPriceInUAH(final int dishPriceInUAH) {
		this.dishPriceInHryvnias = dishPriceInUAH;
	}

	public void setDishName(final String dishName) {
		this.dishName = dishName;
	}

	public void setDishType(final DishType dishType) {
		this.dishType = dishType;
	}

}
