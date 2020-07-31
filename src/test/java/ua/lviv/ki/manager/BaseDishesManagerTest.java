package ua.lviv.ki.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.ki.model.AbstractRestaurant;
import ua.lviv.ki.model.CocaCola;
import ua.lviv.ki.model.DishType;
import ua.lviv.ki.model.Hamburger;
import ua.lviv.ki.model.Juice;
import ua.lviv.ki.model.JuiceType;
import ua.lviv.ki.model.Pizza;
import ua.lviv.ki.model.Salad;

public abstract class BaseDishesManagerTest {

    protected List<AbstractRestaurant> dishes;

    @BeforeEach
    public void createDishes() {
        dishes = new LinkedList<AbstractRestaurant>();
        dishes.add(new Hamburger(450, 500, 9, 125, "Hamburger", DishType.NON_VEGETERIAN, 2));
        dishes.add(new Pizza(500, 550, 8, 120, "Pizza", DishType.NON_VEGETERIAN, 6));
        dishes.add(new Salad(250, 420, 6, 70, "Salad", DishType.VEGETERIAN, 70));
        dishes.add(new CocaCola(500, 120, 7, 18, "CocaCola", DishType.BABY_FRIENDLY, 75));
        dishes.add(new Juice(500, 50, 5, 25, "Juice", DishType.BABY_FRIENDLY, JuiceType.APPLE));
    }

}
