package org.example;

import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        //Exercise 12
        Manufacturer manufacturer1 = new Manufacturer("Audi USA", Year.of(1912), "USA");
        Manufacturer manufacturer2 = new Manufacturer("Audi Poland", Year.of(1960), "Poland");
        Manufacturer manufacturer3 = new Manufacturer("Audi Germany", Year.of(1920), "Germany");
        Manufacturer manufacturer4 = new Manufacturer("Audi Germany", Year.of(1920), "Germany");

        System.out.println(manufacturer3.equals(manufacturer4));
        System.out.println(manufacturer3.hashCode());
        System.out.println(manufacturer4.hashCode());

        Car car1 = new Car("Audi", "A8", new BigDecimal(700000), Year.of(2024), new ArrayList<>(List.of(manufacturer1, manufacturer2, manufacturer3, manufacturer4)), EngineType.V8);
        Car car2 = new Car("Audi", "A8", new BigDecimal(700000), Year.of(2024), new ArrayList<>(List.of(manufacturer1, manufacturer2, manufacturer3, manufacturer4)), EngineType.V8);

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
