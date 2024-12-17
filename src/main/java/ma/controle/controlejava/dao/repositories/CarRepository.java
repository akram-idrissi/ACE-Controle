package ma.controle.controlejava.dao.repositories;

import ma.controle.controlejava.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long>  {
    List<Car> findByModel(String model);
    Car findByMatricul(String plate);
}
