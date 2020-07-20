package ua.lviv.ki.model;

public class Salad extends AbstractDishes {

	private int carbohydratesAmountInGrams;

	public Salad(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInUAH,
			String dishName, DishType dishType, int carbohydratesAmountInGrams) {
		super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInUAH, dishName, dishType);
		this.carbohydratesAmountInGrams = carbohydratesAmountInGrams;
	}
}
