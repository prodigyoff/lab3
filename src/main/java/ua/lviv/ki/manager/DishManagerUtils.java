package ua.lviv.ki.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.ki.model.AbstractRestaurant;
import ua.lviv.ki.model.SortType;

public class DishManagerUtils {

  private static final DishSorterByPopularity DISH_BY_POPULARITY_SORTER = new DishSorterByPopularity();

  public static void sortByPopularity(final List<AbstractRestaurant> dishes, final SortType sortType) {

    if (sortType == SortType.ASC) {

      dishes.sort(DISH_BY_POPULARITY_SORTER);

    } else if (sortType == SortType.DESC) {

      dishes.sort(DISH_BY_POPULARITY_SORTER.reversed());

    }
  }

  public static void sortByPrice(final List<AbstractRestaurant> dishes, final SortType sortType) {

    if (sortType == SortType.ASC) {

      dishes.sort(new DishManagerUtils().new DishSorterByPrice());

    } else if (sortType == SortType.DESC) {

      dishes.sort(new DishManagerUtils().new DishSorterByPrice().reversed());

    }
  }

  public static void sortByPopularityAndPrice(final List<AbstractRestaurant> dishes, final SortType sortType) {

    Comparator<AbstractRestaurant> comparator = new Comparator<AbstractRestaurant>() {

      @Override
      public int compare(final AbstractRestaurant dish1, final AbstractRestaurant dish2) {

        int popularityComparsionResult = dish1.getDishPopularityIndex() - dish2.getDishPopularityIndex();

        if (popularityComparsionResult != 0) {

          return popularityComparsionResult;

        }

        return dish1.getDishPriceInHryvnias() - dish2.getDishPriceInHryvnias();
      }
    };
    dishes.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  class DishSorterByPrice implements Comparator<AbstractRestaurant> {

    @Override
    public int compare(final AbstractRestaurant dish1, final AbstractRestaurant dish2) {

      return dish1.getDishPriceInHryvnias() - dish2.getDishPriceInHryvnias();
    }
  }

  static class DishSorterByPopularity implements Comparator<AbstractRestaurant> {

    @Override
    public int compare(final AbstractRestaurant dish1, final AbstractRestaurant dish2) {

      return dish1.getDishPopularityIndex() - dish2.getDishPopularityIndex();
    }
  }

  public static void sortByCaloriesUsingLambda(final List<AbstractRestaurant> dishes, final SortType sortType) {

    if (sortType == SortType.ASC) {

      dishes.sort((dish1, dish2) -> dish1.getCaloriesAmount() - dish2.getCaloriesAmount());

    } else if (sortType == SortType.DESC) {

      dishes.sort((dish1, dish2) -> dish2.getCaloriesAmount() - dish1.getCaloriesAmount());

    }
  }
}
