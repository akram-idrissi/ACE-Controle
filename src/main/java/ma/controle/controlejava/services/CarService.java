package ma.controle.controlejava.services;

import ma.controle.controlejava.dao.entities.Car;
import ma.controle.controlejava.dao.repositories.CarRepository;
import ma.controle.controlejava.dto.CarDTO;
import ma.controle.controlejava.mappers.CarMapper;
import ma.controle.controlejava.services.manager.CarManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements CarManager {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> getCarByModel(String model) {
        return carRepository.findByModel(model);
    }

    @Override
    public Car saveCar(CarDTO carDTO) {
        Car car = carMapper.fromCarDTOToCar(carDTO);
        if (carRepository.findByMatricul(car.getMatricul()) != null)
            throw new IllegalArgumentException("Car already exists");
        return carRepository.save(car);
    }

}
