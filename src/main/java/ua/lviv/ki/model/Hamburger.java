package ua.lviv.ki.model;

public class Hamburger extends AbstractDishes {

    private int cutletsAmount;

    public Hamburger(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInHryvnias,
            String dishName, DishType dishType, int cutletsAmount) {
        super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInHryvnias, dishName, dishType);
        this.cutletsAmount = cutletsAmount;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "cutletsAmount";
    }

    public String toCSV() {
        return super.toCSV() + "," + "Cutlets amount: " + cutletsAmount;
    }

}
