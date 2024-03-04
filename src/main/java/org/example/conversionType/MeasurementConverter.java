package org.example.conversionType;

//Exercise 17
public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType){
        return conversionType.convert(value);
    }

    public static void main(String[] args) {
        int value = 25;
        double metersToYards = convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(metersToYards);
        double inchesToCentimeters = convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(inchesToCentimeters);

    }
}
