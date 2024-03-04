package org.example.shape;

public class Hexagon extends Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return 6 * a;
    }

    @Override
    public double calculateArea() {
        return 6 * (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "a=" + a +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
