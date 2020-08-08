package ua.lviv.ki.model;

public abstract class AbstractDrinks extends AbstractRestaurant {

  protected int portionSizeInMililiters;

  public AbstractDrinks() {
    super();
  }

  public AbstractDrinks(int portionSizeInMililiters, int caloriesAmount, int dishPriceInHryvnias,
      int dishPopularityIndex, String dishName, DishType dishType, Integer dishId) {
    super(caloriesAmount, dishPriceInHryvnias, dishPopularityIndex, dishName, dishType, dishId);
    this.portionSizeInMililiters = portionSizeInMililiters;
  }

  public int getPortionSizeInMililiters() {
    return portionSizeInMililiters;
  }

  public void setPortionSizeInMililiters(int portionSizeInMililiters) {
    this.portionSizeInMililiters = portionSizeInMililiters;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "portionSizeInMililiters";
  }

  public String toCSV() {
    return super.toCSV() + "," + "Portion size in mililiters: " + portionSizeInMililiters;
  }

}
