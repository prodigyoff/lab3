package ua.lviv.ki.model;

public abstract class AbstractDishes extends AbstractRestaurant {

    protected int portionWeightInGrams;

    public AbstractDishes(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex,
            int dishPriceInHryvnias, String dishName, DishType dishType) {
        super(caloriesAmount, dishPopularityIndex, dishPriceInHryvnias, dishName, dishType);
        this.portionWeightInGrams = portionWeightInGrams;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "portionWeightInGrams";
    }

    public String toCSV() {
        return super.toCSV() + "," + "Portion weight: " + portionWeightInGrams;
    }

}
