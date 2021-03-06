package ua.lviv.ki.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.ki.model.AbstractRestaurant;

public class DishManager {

  private List<AbstractRestaurant> dishes = new LinkedList<>();

  public List<AbstractRestaurant> findWithCaloriesAmountGreaterThan(final int calories) {
    List<AbstractRestaurant> result = new LinkedList<>();
    for (AbstractRestaurant dish : dishes) {
      if (dish.getCaloriesAmount() > calories) {
        result.add(dish);
      }
    }
    return result;
  }

  public void addDishes(final List<AbstractRestaurant> dishes) {
    this.dishes.addAll(dishes);
  }

  public void addDish(final AbstractRestaurant dish) {
    this.dishes.add(dish);
  }
}
