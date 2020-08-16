package ua.lviv.ki.spring.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.ki.model.Hamburger;
import ua.lviv.ki.spring.service.DishService;

@RequestMapping("/dishes")
@RestController
public class DishesController {

  private Map<Integer, Hamburger> dishes = new HashMap<>();
  
  private AtomicInteger idCounter = new AtomicInteger();
  @Autowired
  private DishService dishService;

  @GetMapping
  public List<Hamburger> getDishes() {
    return new ArrayList<Hamburger>(dishService.getAllDishes());
  }

  @GetMapping(path = "/{id}")
  public Hamburger getHamburger(final @PathVariable("id") Integer dishId) {
    return dishService.getDish(dishId);
  }

  @PostMapping
  public Hamburger createHamburger(Hamburger hamburger) {
    dishService.createDish(hamburger);
    
    hamburger.setDishId(idCounter.getAndIncrement());
    dishes.put(hamburger.getDishId(), hamburger);
    return hamburger;
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Hamburger> deleteHamburger(final @PathVariable("id") Integer dishId) {
    if (dishService.checkIfExists(dishId) == false) {
      return ResponseEntity.notFound().build();
    } else {
      dishService.deleteDish(dishId);
      return ResponseEntity.ok().build();
    }
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Hamburger> updateDish(final @PathVariable("id") Integer dishId,
      final @RequestBody Hamburger hamburger) {
    hamburger.setDishId(dishId);
    if (dishService.checkIfExists(dishId) == false) {
      return ResponseEntity.notFound().build();
    } else {
      dishService.updateDish(dishId, hamburger);
      return ResponseEntity.ok().build();
    }
  }
}
