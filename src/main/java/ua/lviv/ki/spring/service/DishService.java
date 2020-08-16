package ua.lviv.ki.spring.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ua.lviv.ki.model.Hamburger;
import ua.lviv.ki.spring.dataaccess.DishRepository;

@Service
public class DishService {

  @Autowired
  private DishRepository dishRepository;
  
  public Hamburger createDish(Hamburger hamburger) {
    return dishRepository.save(hamburger);
  }
  
  public Hamburger getDish(Integer dishId) {
    return dishRepository.findById(dishId).get();
  }
  
  public void deleteDish(Integer dishId) {
    dishRepository.deleteById(dishId);
  }
  
  public ArrayList<Hamburger> getAllDishes(){
    return (ArrayList<Hamburger>) dishRepository.findAll();
  }
  
  public Boolean checkIfExists(Integer dishId) {
    return dishRepository.existsById(dishId);
  }
  
  public Hamburger updateDish(Integer dishId, Hamburger hamburger) {
    Hamburger outDatedHamburger = dishRepository.findById(dishId).get();
    if(outDatedHamburger == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    Hamburger updatedHamburger = new Hamburger(outDatedHamburger.getCaloriesAmount(),
        outDatedHamburger.getPortionWeightInGrams(),
        outDatedHamburger.getDishPopularityIndex(),outDatedHamburger.getDishPriceInHryvnias(),
        outDatedHamburger.getDishName(),outDatedHamburger.getDishType(),
        outDatedHamburger.getCutletsAmount(), dishId);
    updatedHamburger.setDishId(dishId);
    hamburger.setDishId(dishId);
    dishRepository.save(hamburger);
    return updatedHamburger;
  }
}
