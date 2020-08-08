package ua.lviv.ki.spring.rest.tools;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ua.lviv.ki.model.Hamburger;

@RequestMapping("/dishes")
@RestController
public class DishesController {

  private Map<Integer, Hamburger> dishes = new HashMap<>();
  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping
  public List<Hamburger> getDishes() {
    return new LinkedList<Hamburger>(dishes.values());
  }

  @GetMapping(path = "/{id}")
  public Hamburger getHamburger(final @PathVariable("id") Integer dishId) {
    if (dishes.get(dishId) == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    return dishes.get(dishId);
  }

  @PostMapping
  public Hamburger createHamburger(Hamburger hamburger) {
    hamburger.setDishId(idCounter.getAndIncrement());
    dishes.put(hamburger.getDishId(), hamburger);
    return hamburger;
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Hamburger> deleteHamburger(final @PathVariable("id") Integer dishId) {
    HttpStatus status = dishes.remove(dishId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).build();
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Hamburger> updateDish(final @PathVariable("id") Integer dishId,
      final @RequestBody Hamburger hamburger) {
    hamburger.setDishId(dishId);
    HttpStatus status = dishes.put(hamburger.getDishId(), hamburger) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).build();
  }
}
