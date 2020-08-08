package ua.lviv.ki.model;

public abstract class AbstractRestaurant {
  protected int caloriesAmount;
  protected int dishPopularityIndex;
  protected int dishPriceInHryvnias;
  protected String dishName;
  protected DishType dishType;
  protected Integer dishId;

  public AbstractRestaurant() {

  }

  public AbstractRestaurant(int caloriesAmount, int dishPopularityIndex, int dishPriceInHryvnias, String dishName,
      DishType dishType, Integer dishId) {
    this.caloriesAmount = caloriesAmount;
    this.dishPopularityIndex = dishPopularityIndex;
    this.dishPriceInHryvnias = dishPriceInHryvnias;
    this.dishName = dishName;
    this.dishType = dishType;
    this.dishId = dishId;
  }

  public String getHeaders() {
    return "caloriesAmount,dishPopularityIndex,dishPriceInHryvnias,dishName,dishType";
  }

  public String toCSV() {
    return "Calories amount:" + caloriesAmount + "," + "Popularity index: " + dishPopularityIndex + ","
        + "Price in hryvnias: " + dishPriceInHryvnias + "," + "Dish name: " + dishName + "," + "Dish type: " + dishType;
  }

  public Integer getDishId() {
    return dishId;
  }

  public void setDishId(Integer dishId) {
    this.dishId = dishId;
  }

  public int getCaloriesAmount() {
    return caloriesAmount;
  }

  public void setCaloriesAmount(final int caloriesAmount) {
    this.caloriesAmount = caloriesAmount;
  }

  public int getDishPopularityIndex() {
    return dishPopularityIndex;
  }

  public void setDishPriceInHryvnias(int dishPriceInHryvnias) {
    this.dishPriceInHryvnias = dishPriceInHryvnias;
  }

  public int getDishPriceInHryvnias() {
    return dishPriceInHryvnias;
  }

  public String getDishName() {
    return dishName;
  }

  public DishType getDishType() {
    return dishType;
  }

  public void setDishPopularityIndex(final int dishPopularityIndex) {
    this.dishPopularityIndex = dishPopularityIndex;
  }

  public void setDishName(final String dishName) {
    this.dishName = dishName;
  }

  public void setDishType(final DishType dishType) {
    this.dishType = dishType;
  }

}
