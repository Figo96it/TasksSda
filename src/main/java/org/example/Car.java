package org.example;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.Objects;

//Exercise 12
public class Car {

    private String name;
    private String model;
    private BigDecimal price;
    private Year yearOfProduction;
    private List<Manufacturer> listOfProducers;
    private EngineType engineType;

    public Car(String name, String model, BigDecimal price, Year yearOfProduction, List<Manufacturer> listOfProducers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.listOfProducers = listOfProducers;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price)
                && Objects.equals(yearOfProduction, car.yearOfProduction) && Objects.equals(listOfProducers, car.listOfProducers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfProduction, listOfProducers, engineType);
    }
}
