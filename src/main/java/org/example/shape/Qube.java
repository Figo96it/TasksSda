package org.example.shape;

public class Qube extends ThreeDShape {

    private double a;

    private double volume;

    public Qube(double a) {
        this.a = a;
        this.area = calculateArea();
        this.volume = calculateVolume();
    }

    @Override
    public double calculatePerimeter() {
        throw new RuntimeException();
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
                ", volume=" + volume +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
