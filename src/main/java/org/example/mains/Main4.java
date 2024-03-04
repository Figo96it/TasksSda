package org.example.mains;

import org.example.conversionType.ConversionType;
import org.example.conversionType.MeasurementConverter;
import org.example.runner.Runner;
import org.example.shape.Hexagon;
import org.example.shape.Rectangle;
import org.example.shape.Shape;
import org.example.shape.Triangle;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        //Exercise 16
        Runner[] runner = Runner.values();
        System.out.println(Runner.getFitnessLevel(230));

        //Exercise 20
        Shape shape = new Hexagon(12);
        System.out.println(shape);
        Rectangle rectangle = new Rectangle(6,2);
        System.out.println(rectangle);
        Triangle triangle = new Triangle(3,5,7);
        System.out.println(triangle);


    }
}
