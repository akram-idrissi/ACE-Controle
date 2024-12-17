package ma.controle.controlejava.web;


import ma.controle.controlejava.dao.entities.Car;
import ma.controle.controlejava.dto.CarDTO;
import ma.controle.controlejava.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarGraphQLController {

    @Autowired
    private CarService carService;

    @QueryMapping
    public List<Car> getCarByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public Car saveCar(@Argument CarDTO carDTO) {
        try {
            return carService.saveCar(carDTO);
        } catch (IllegalArgumentException exception) {
            return null;
        }
    }

}
