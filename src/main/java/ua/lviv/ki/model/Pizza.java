package ua.lviv.ki.model;

public class Pizza extends AbstractDishes {

    private int slicesAmount;

    public Pizza(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInHryvnias,
            String dishName, DishType dishType, int slicesAmount) {
        super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInHryvnias, dishName, dishType);
        this.slicesAmount = slicesAmount;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "slicesAmount";
    }

    public String toCSV() {
        return super.toCSV() + "," + "Slices amount: " + slicesAmount;
    }

}
