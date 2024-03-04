package org.example;

import java.util.ArrayList;
import java.util.List;

//Exercise 9
public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;
    private double radius;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
        if (center.equals(point)) {
            throw new IllegalArgumentException("Radius is 0");
        }
        this.radius = getRadius();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return 2 * Math.PI * Math.pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints() {
        List<Point2D> points = new ArrayList<>();
        double x = 0;
        double y = 0;

        for (double angle = 90.0, i = 0; i < 3; i++, angle += 90) {
            System.out.println(angle);
            x = point.getX() + getRadius() * Math.cos(angle);
            y = point.getY() + getRadius() * Math.sin(angle);
            points.add(new Point2D(x, y));
        }

        return points;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.move(moveDirection);
        this.point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        this.radius *= resizeFactor;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
    }

    @Override
    public String toString() {
        this.radius = getRadius();
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                ", radius=" + radius +
                '}';
    }
}
