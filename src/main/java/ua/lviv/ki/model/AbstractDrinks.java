package ua.lviv.ki.model;

public abstract class AbstractDrinks extends AbstractRestaurant {

	protected int portionSizeInMililiters;

	public AbstractDrinks() {
		super();
	}

	public AbstractDrinks(int portionSizeInMililiters, int caloriesAmount, int dishPriceInHryvnias, int dishPopularityIndex,
			String dishName, DishType dishType) {
		super(caloriesAmount, dishPriceInHryvnias, dishPopularityIndex, dishName, dishType);
		this.portionSizeInMililiters = portionSizeInMililiters;
	}

}
