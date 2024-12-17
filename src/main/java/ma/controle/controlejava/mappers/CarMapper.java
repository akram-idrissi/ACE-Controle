package ma.controle.controlejava.mappers;

import ma.controle.controlejava.dao.entities.Car;
import ma.controle.controlejava.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Car fromCarDTOToCar(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }

    public CarDTO fromCarToCarDTO(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }
}
