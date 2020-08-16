package ua.lviv.ki.model;

public class Salad extends AbstractDishes {

  private int carbohydratesAmountInGrams;

  public Salad(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInHryvnias,
      String dishName, DishType dishType, int carbohydratesAmountInGrams, Integer dishId) {
    super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInHryvnias, dishName, dishType, dishId);
    this.carbohydratesAmountInGrams = carbohydratesAmountInGrams;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "carbohydratesAmountInGrams";
  }

  public String toCSV() {
    return super.toCSV() + "," + "Carbohydrates amount in grams: " + carbohydratesAmountInGrams;
  }

  public int getCarbohydratesAmountInGrams() {
    return carbohydratesAmountInGrams;
  }

  public void setCarbohydratesAmountInGrams(int carbohydratesAmountInGrams) {
    this.carbohydratesAmountInGrams = carbohydratesAmountInGrams;
  }

}
