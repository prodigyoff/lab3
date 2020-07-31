package ua.lviv.ki.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.ki.model.AbstractRestaurant;
import ua.lviv.ki.model.DishType;

class DishManagerTest extends BaseDishesManagerTest {

    private DishManager dishManager;

    @BeforeEach
    public void setUp() {
        dishManager = new DishManager();
        dishManager.addDishes(dishes);

    }

    @Test
    public void testFindWithCaloriesAmountGreaterThan() {
        System.out.println(dishes.get(0).toString());
        List<AbstractRestaurant> dishes = dishManager.findWithCaloriesAmountGreaterThan(500);

        assertEquals(1, dishes.size());

        assertEquals(DishType.NON_VEGETERIAN, dishes.get(0).getDishType());

    }
}
