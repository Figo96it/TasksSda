package org.example.shape;

public class Cone extends ThreeDShape {

    private double radius;

    private double height;
    private double creatingCone;

    public Cone(double radius, double height, double creatingCone) {
        this.radius = radius;
        this.height = height;
        this.creatingCone = creatingCone;
    }

    @Override
    public double calculateVolume() {
        return (double) 1 / 3 * (Math.PI * Math.pow(radius, 2)) * height;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
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
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
