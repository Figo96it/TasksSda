package org.example.shape;

//Exercise 20
public abstract class Shape {

    protected double perimeter;
    protected double area;

    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    public double getPerimeter() {
        return perimeter;
    }
}
