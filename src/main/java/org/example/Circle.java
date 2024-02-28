package org.example;

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
        this.radius = Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return 2 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        setCenter(new Point2D(center.getX() + moveDirection.getX(), center.getY() + moveDirection.getY()));
        setPoint(new Point2D(point.getX() + moveDirection.getX(), point.getY() + moveDirection.getY()));
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
        return radius;
    }
}
