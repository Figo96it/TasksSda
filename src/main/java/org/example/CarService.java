package org.example;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Exercise 13
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public boolean addCar(Car car) {
        if (car != null && carList.stream().noneMatch(c -> c.equals(car))) {
            carList.add(car);
            return true;
        }
        return false;
    }

    public boolean deleteCar(Car car) {
        List<Car> modifiedList = carList.stream().filter(c -> !c.equals(car)).toList();
        boolean removedFlag = modifiedList.size() != carList.size();
        carList.clear();
        carList.addAll(modifiedList);
        return removedFlag;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarListWithEngine12() {
        return carList.stream().filter(c -> c.getEngineType().equals(EngineType.V12)).toList();
    }

    public List<Car> getCarListProducedBefore1999() {
        return carList.stream().filter(c -> c.getYearOfProduction().isBefore(Year.of(1999))).toList();
    }

    public Car getTheMostExpensiveCar() {
        return carList.stream().max(Comparator.comparing(Car::getPrice)).orElse(null);
    }

    public Car getCheapestCar() {
        return carList.stream().min(Comparator.comparing(Car::getPrice)).orElse(null);
    }

    public List<Car> getCarsWithAtLeast3Producers() {
        return carList.stream().filter(c -> c.getListOfProducers().size() >= 3).toList();
    }

    public List<Car> getSortedCarsList(boolean flag) {
        if (Boolean.TRUE.equals(flag)) {
            return carList.stream().sorted().toList();
        } else {
            return carList.stream()
                    .sorted(Comparator.comparing(Car::getModel)
                            .thenComparing(Car::getName)
                            .thenComparing(Car::getEngineType)
                            .thenComparing(Car::getPrice))
                    .toList();
        }
    }

    public boolean isTheCarOnTheList(Car car) {
        return carList.stream().anyMatch(c -> c.equals(car));
    }

    public List<Car> getCarsByProducer(String producer){
        return carList.stream().filter(c -> c.getListOfProducers().toString().contains(producer)).toList();
    }

    public List<Car> getCarsByManufacturerAndFoundationYear(String producer, String comparisonOperator, Year inputYear){
        return carList.stream().filter(c -> c.getListOfProducers().toString().contains(producer) && compareYears(comparisonOperator, inputYear, c.getYearOfProduction())).toList();
    }

    private boolean compareYears(String comparisonOperator, Year inputYear, Year yearOfProduction) {
        switch (comparisonOperator) {
            case "<":
                return yearOfProduction.isBefore(inputYear);
            case ">":
                return yearOfProduction.isAfter(inputYear);
            case "<=":
                return !yearOfProduction.isAfter(inputYear);
            case ">=":
                return !yearOfProduction.isBefore(inputYear);
            case "=":
                return yearOfProduction.equals(inputYear);
            case "!=":
                return !yearOfProduction.equals(inputYear);
            default:
                throw new IllegalArgumentException("Invalid comparison operator");
        }
    }

}