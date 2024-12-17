package ma.controle.controlejava.services.manager;


import ma.controle.controlejava.dao.entities.Car;
import ma.controle.controlejava.dto.CarDTO;

import java.util.List;

public interface CarManager {
    List<Car> getCarByModel(String model);
    Car saveCar(CarDTO carDTO);
}
