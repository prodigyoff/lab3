package ua.lviv.ki.model;

public abstract class AbstractDishes extends AbstractRestaurant {
	
	protected int portionWeightInGrams;


	public AbstractDishes(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInUAH, String dishName,
			DishType dishType) {
		super(caloriesAmount, dishPopularityIndex, dishPriceInUAH, dishName, dishType);
		this.portionWeightInGrams = portionWeightInGrams;
	}
	
	

}
