package org.example;

public class Main2 {
    public static void main(String[] args) {
        //Exercise 8
        ParcelValidator validator = new ParcelValidator();
        Parcel parcel = new Parcel(30,100,80, 27.0F, Boolean.FALSE);
        Parcel parcel2 = new Parcel(30,100,80, 34.0F, Boolean.FALSE);
        Parcel parcel3 = new Parcel(170,100,80, 14.0F, Boolean.TRUE);

        System.out.println(validator.validate(parcel));
        System.out.println();
        System.out.println(validator.validate(parcel2));
        System.out.println();
        System.out.println(validator.validate(parcel3));
        System.out.println();

        //Exercise 9
        Point2D center = new Point2D(2.3,6.7);
        Point2D point = new Point2D(7.1, 8.4);
        Circle circle = new Circle(center, point);
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Perimeter: "+circle.getPerimeter());
        System.out.println("Area: "+circle.getArea());
    }
}
