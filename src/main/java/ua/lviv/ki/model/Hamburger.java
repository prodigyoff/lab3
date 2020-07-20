package ua.lviv.ki.model;

public class Hamburger extends AbstractDishes {

	private int cutletsAmount;

	public Hamburger(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInUAH,
			String dishName, DishType dishType, int cutletsAmount) {
		super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInUAH, dishName, dishType);
		this.cutletsAmount = cutletsAmount;
	}

	@Override
	public String toString() {
		return "Hamburger [cutletsAmount=" + cutletsAmount + ", portionWeightInGrams=" + portionWeightInGrams
				+ ", caloriesAmount=" + caloriesAmount + ", dishPopularityIndex=" + dishPopularityIndex
				+ ", dishPriceInUAH=" + dishPriceInUAH + ", dishName=" + dishName + ", dishType=" + dishType
				+ ", getCaloriesAmount()=" + getCaloriesAmount() + ", getDishPopularityIndex()="
				+ getDishPopularityIndex() + ", getDishPriceInUAH()=" + getDishPriceInUAH() + ", getDishName()="
				+ getDishName() + ", getDishType()=" + getDishType() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
