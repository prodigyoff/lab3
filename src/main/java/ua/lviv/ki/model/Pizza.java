package ua.lviv.ki.model;

public class Pizza extends AbstractDishes {

	private int slicesAmount;

	public Pizza(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInUAH,
			String dishName, DishType dishType,int slicesAmount) {
		super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInUAH, dishName, dishType);
		this.slicesAmount = slicesAmount;
	}
}
