package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    //psvm

    //Jackson = fasterxml
    public static void main(String[] args) throws IOException {

        ObjectMapper obj = new ObjectMapper();

        Car c = new Car("Opel", "Omega");

        //Serialization to JSON
        String car = obj.writeValueAsString(c);
        System.out.println(car);

        String jsonCar = "{\"brand\":\"Hyndai\",\"model\":\"Elantra i35\"}";
        //Deserialization
        Car carFromJson = obj.readValue(jsonCar, Car.class);
        System.out.println(carFromJson);

    }
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Car {
    private String brand;
    private String model;
}
