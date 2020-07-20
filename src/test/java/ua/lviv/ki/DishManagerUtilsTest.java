package ua.lviv.ki;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ua.lviv.ki.manager.DishManagerUtils;
import ua.lviv.ki.model.SortType;

public class DishManagerUtilsTest extends BaseDishesManagerTest {

	
	@Test
	public void testSortByPopularityDescending() {
		DishManagerUtils.sortByPopularity(dishes, SortType.DESC);
		assertEquals(9, dishes.get(0));
		assertEquals(8, dishes.get(1));
		assertEquals(7, dishes.get(2));
	}
	
	@Test
	public void testSortByPriceDescending() {
		DishManagerUtils.sortByPrice(dishes, SortType.DESC);
		assertEquals(125, dishes.get(0));
		assertEquals(120,dishes.get(1));
		assertEquals(70,dishes.get(2));
	}
}
