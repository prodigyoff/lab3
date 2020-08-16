package ua.lviv.ki.spring.dataaccess;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ua.lviv.ki.model.Hamburger;

@Repository
public interface DishRepository extends JpaRepository<Hamburger, Integer>{

}
