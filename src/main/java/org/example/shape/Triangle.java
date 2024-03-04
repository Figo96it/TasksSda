package org.example.shape;

//Exercise 20
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double v = this.getPerimeter() / 2;
        return Math.sqrt(v * (v - this.a) * (v - this.b) * (v - this.c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
