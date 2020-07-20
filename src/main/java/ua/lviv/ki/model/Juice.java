package ua.lviv.ki.model;

public class Juice extends AbstractDrinks {

	private JuiceType juiceType;

	public Juice(int portionSizeInMililiters, int caloriesAmount, int dishPriceInUAH, int dishPopularityIndex,
			String dishName, DishType dishType, JuiceType juiceType) {
		super(portionSizeInMililiters, caloriesAmount, dishPriceInUAH, dishPopularityIndex, dishName, dishType);
		this.juiceType = juiceType;
	}

}
