package ua.lviv.ki.model;

public abstract class AbstractDishes extends AbstractRestaurant {

  protected int portionWeightInGrams;

  public AbstractDishes(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInHryvnias,
      String dishName, DishType dishType, Integer dishId) {
    super(caloriesAmount, dishPopularityIndex, dishPriceInHryvnias, dishName, dishType, dishId);
    this.portionWeightInGrams = portionWeightInGrams;
  }
  
  public AbstractDishes() {
    
  }

  public int getPortionWeightInGrams() {
    return portionWeightInGrams;
  }

  public void setPortionWeightInGrams(int portionWeightInGrams) {
    this.portionWeightInGrams = portionWeightInGrams;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "portionWeightInGrams";
  }

  public String toCSV() {
    return super.toCSV() + "," + "Portion weight: " + portionWeightInGrams;
  }

}
