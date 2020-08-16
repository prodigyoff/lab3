package ua.lviv.ki.model;

public class Juice extends AbstractDrinks {

  private JuiceType juiceType;

  public Juice(int portionSizeInMililiters, int caloriesAmount, int dishPriceInHryvnias, int dishPopularityIndex,
      String dishName, DishType dishType, JuiceType juiceType, Integer dishId) {
    super(portionSizeInMililiters, caloriesAmount, dishPriceInHryvnias, dishPopularityIndex, dishName, dishType, dishId);
    this.juiceType = juiceType;
  }

  public String getHeaders() {
    return super.getHeaders() + "," + "juiceType ";
  }

  public String toCSV() {
    return super.toCSV() + "," + "Juice type: " + juiceType;
  }

  public JuiceType getJuiceType() {
    return juiceType;
  }

  public void setJuiceType(JuiceType juiceType) {
    this.juiceType = juiceType;
  }

}
