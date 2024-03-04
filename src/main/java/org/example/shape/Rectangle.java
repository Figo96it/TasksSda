package org.example.shape;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
