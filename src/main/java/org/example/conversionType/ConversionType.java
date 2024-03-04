package org.example.conversionType;

public enum ConversionType implements Converter {
    METERS_TO_YARDS(value -> value * 1.09361),
    YARDS_TO_METERS(value -> value / 1.09361),
    CENTIMETERS_TO_INCHES(value -> value * 0.393701),
    INCHES_TO_CENTIMETERS(value -> value / 0.393701),
    KILOMETERS_TO_MILES(value -> value * 0.621371),
    MILES_TO_KILOMETERS(value -> value / 0.621371);

    private final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(int value) {
        return converter.convert(value);
    }
}
