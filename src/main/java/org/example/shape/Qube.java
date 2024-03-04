package org.example.shape;

public class Qube extends ThreeDShape {

    private double a;

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public String toString() {
        return "Qube{" +
                "a=" + a +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
