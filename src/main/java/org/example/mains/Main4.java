package org.example.mains;

import org.example.conversionType.ConversionType;
import org.example.conversionType.MeasurementConverter;
import org.example.runner.Runner;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        //Exercise 16
        Runner[] runner = Runner.values();
        System.out.println(Runner.getFitnessLevel(230));

        //Exercise 17
        int value = 25;
        double metersToYards = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(metersToYards);
        double inchesToCentimeters = MeasurementConverter.convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(inchesToCentimeters);

    }
}
