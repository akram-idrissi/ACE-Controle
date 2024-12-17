package ma.controle.controlejava.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {
    private String model;
    private String matricul;
    private String color;
    private double price;
}
