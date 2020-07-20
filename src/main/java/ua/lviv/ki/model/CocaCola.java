package ua.lviv.ki.model;

public class CocaCola extends AbstractDrinks {

	private int sugarAmountInGrams;
	
	public CocaCola(int portionSizeInMililiters, int caloriesAmount, int dishPriceInUAH, int dishPopularityIndex,
			String dishName, DishType dishType,int sugarAmountInGrams) {
		super(portionSizeInMililiters, caloriesAmount, dishPriceInUAH, dishPopularityIndex, dishName, dishType);
		this.sugarAmountInGrams = sugarAmountInGrams;
	}
}
