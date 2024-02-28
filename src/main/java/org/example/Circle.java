package org.example;

//Exercise 9
public class Circle {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        if (center.equals(point)) {
            throw new IllegalArgumentException("Radius is 0");
        }
        return Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return 2 * Math.PI * Math.pow(getRadius(), 2);
    }
}
