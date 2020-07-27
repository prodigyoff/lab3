package ua.lviv.ki.model;

public class CocaCola extends AbstractDrinks {

	private int sugarAmountInGrams;

	public CocaCola(int portionSizeInMililiters, int caloriesAmount, int dishPriceInHryvnias, int dishPopularityIndex,
			String dishName, DishType dishType, int sugarAmountInGrams) {
		super(portionSizeInMililiters, caloriesAmount, dishPriceInHryvnias, dishPopularityIndex, dishName, dishType);
		this.sugarAmountInGrams = sugarAmountInGrams;
	}
}
