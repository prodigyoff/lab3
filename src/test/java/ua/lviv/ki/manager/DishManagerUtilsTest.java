package ua.lviv.ki.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ua.lviv.ki.model.SortType;

public class DishManagerUtilsTest extends BaseDishesManagerTest {

  @Test
  public void testSortByPopularityDescending() {
    DishManagerUtils.sortByPopularity(dishes, SortType.DESC);
    assertEquals(9, dishes.get(0).getDishPopularityIndex());
    assertEquals(8, dishes.get(1).getDishPopularityIndex());
    assertEquals(7, dishes.get(2).getDishPopularityIndex());
  }

  @Test
  public void testSortByPriceDescending() {
    DishManagerUtils.sortByPrice(dishes, SortType.DESC);
    assertEquals(125, dishes.get(0).getDishPriceInHryvnias());
    assertEquals(120, dishes.get(1).getDishPriceInHryvnias());
    assertEquals(70, dishes.get(2).getDishPriceInHryvnias());
  }

  @Test
  public void testSortByPopularityAndPriceDescending() {
    DishManagerUtils.sortByPopularityAndPrice(dishes, SortType.DESC);
    assertEquals(125, dishes.get(0).getDishPriceInHryvnias());
    assertEquals(9, dishes.get(0).getDishPopularityIndex());
    assertEquals(120, dishes.get(1).getDishPriceInHryvnias());
    assertEquals(8, dishes.get(1).getDishPopularityIndex());
    assertEquals(18, dishes.get(2).getDishPriceInHryvnias());
    assertEquals(7, dishes.get(2).getDishPopularityIndex());
  }

  @Test
  public void testSortByCaloriesUsingLambdaAscending() {
    DishManagerUtils.sortByCaloriesUsingLambda(dishes, SortType.ASC);
    assertEquals(50, dishes.get(0).getCaloriesAmount());
    assertEquals(120, dishes.get(1).getCaloriesAmount());
    assertEquals(420, dishes.get(2).getCaloriesAmount());
  }
}
