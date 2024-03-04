package org.example.shape;

public class Cone extends ThreeDShape {

    private double radius;

    private double height;
    private double creatingCone;
    private double volume;

    public Cone(double radius, double height, double creatingCone) {
        this.radius = radius;
        this.height = height;
        this.creatingCone = creatingCone;
        this.area = calculateArea();
        this.volume = calculateVolume();
    }

    @Override
    public double calculateVolume() {
        return (double) 1 / 3 * (Math.PI * Math.pow(radius, 2)) * height;
    }

    @Override
    public double calculatePerimeter() {
        throw new RuntimeException();
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2)) + (Math.PI * this.radius * this.creatingCone);
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                ", creatingCone=" + creatingCone +
                ", volume=" + volume +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
