package org.example;

import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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


        //Exercise 13
        CarService carService = new CarService();

        for (int i = 0; i < 20; i++) {
            carService.addCar(generateRandomCar());
        }
    }

    private static Car generateRandomCar() {
        String[] brands = {"Toyota", "Honda", "Ford", "BMW", "Mercedes", "Audi","Volvo"};
        String[] models = {"Camry", "Civic", "Focus", "X5", "C-Class","A8", "XC80"};

        int randomBrandIndex = new Random().nextInt(brands.length);
        int randomModelIndex = new Random().nextInt(models.length);

        String brand = brands[randomBrandIndex];
        String model = models[randomModelIndex];
        int year = getRandomYear(1990, 2022);
        BigDecimal price = BigDecimal.valueOf(getRandomDouble(10000, 50000));
        String[] engineTypes = {"V8", "V12", "V6", "S6"};
        int randomEngineTypeIndex = new Random().nextInt(engineTypes.length);
        String engineType = engineTypes[randomEngineTypeIndex];

        Manufacturer manufacturer1 = new Manufacturer("Audi USA", Year.of(1912), "USA");
        Manufacturer manufacturer2 = new Manufacturer("Audi Poland", Year.of(1960), "Poland");
        Manufacturer manufacturer3 = new Manufacturer("Audi Germany", Year.of(1920), "Germany");
        Manufacturer manufacturer4 = new Manufacturer("Audi Germany", Year.of(1920), "Germany");

        List<Manufacturer> manufacturerList = new ArrayList<>(List.of(manufacturer1,manufacturer2,manufacturer3,manufacturer4));


        return new Car(brand, model,price, Year.of(year),manufacturerList, EngineType.valueOf(engineType));
    }

    private static int getRandomYear(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    // Generowanie losowej liczby zmiennoprzecinkowej
    private static double getRandomDouble(double min, double max) {
        return Math.random() * (max - min) + min;
    }
}
