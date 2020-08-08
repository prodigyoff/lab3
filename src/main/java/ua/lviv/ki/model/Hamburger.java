package ua.lviv.ki.model;

public class Hamburger extends AbstractDishes {

  private int cutletsAmount;

  public Hamburger(int portionWeightInGrams, int caloriesAmount, int dishPopularityIndex, int dishPriceInHryvnias,
      String dishName, DishType dishType, int cutletsAmount, Integer dishId) {
    super(portionWeightInGrams, caloriesAmount, dishPopularityIndex, dishPriceInHryvnias, dishName, dishType, dishId);
    this.cutletsAmount = cutletsAmount;
  }
  
  public Hamburger() {
    
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "cutletsAmount";
  }

  public String toCSV() {
    return super.toCSV() + "," + "Cutlets amount: " + cutletsAmount;
  }

  public int getCutletsAmount() {
    return cutletsAmount;
  }

  public void setCutletsAmount(int cutletsAmount) {
    this.cutletsAmount = cutletsAmount;
  }

}
