package ma.controle.controlejava;

import ma.controle.controlejava.dao.entities.Car;
import ma.controle.controlejava.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleJavaApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CarRepository carRepository) {
        return args -> {
            carRepository.saveAll(
                    List.of(
                            Car.builder().model("BMW - m1").color("red").matricul("sdf64w6e").price(12345).build(),
                            Car.builder().model("BMW - m2").matricul("ef6e+6").color("green").price(65489).build(),
                            Car.builder().model("BMW - m3").matricul("ef64we8").color("yellow").price(89789).build(),
                            Car.builder().model("BMW - m4").matricul("wroqals").color("black").price(67489).build(),
                            Car.builder().model("BMW - m5").matricul("wroqals").color("black").price(67489).build()
                    )
            );
        };
    };
}
