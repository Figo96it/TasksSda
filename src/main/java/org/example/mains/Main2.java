package org.example.mains;

import org.example.circle.*;

public class Main2 {
    public static void main(String[] args) {
        //Exercise 8
        ParcelValidator validator = new ParcelValidator();
        Parcel parcel = new Parcel(30, 100, 80, 27.0F, Boolean.FALSE);
        Parcel parcel2 = new Parcel(30, 100, 80, 34.0F, Boolean.FALSE);
        Parcel parcel3 = new Parcel(170, 100, 80, 14.0F, Boolean.TRUE);

        System.out.println(validator.validate(parcel));
        System.out.println();
        System.out.println(validator.validate(parcel2));
        System.out.println();
        System.out.println(validator.validate(parcel3));
        System.out.println();

        //Exercise 9,10,11
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(3, 4);
        Circle circle = new Circle(center, point);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Slice points: " + circle.getSlicePoints() + "\n");

        MoveDirection moveDirection2 = new MoveDirection(10, 10);
        System.out.println(circle.toString());
        center.move(moveDirection2);
        System.out.println(circle.toString());
        System.out.println("After resizable.");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Slice points: " + circle.getSlicePoints() + "\n");
//        System.out.println("Radius: " + circle.getRadius());
//        System.out.println("Perimeter: " + circle.getPerimeter());
//        System.out.println("Area: " + circle.getArea() + "\n");
//        System.out.println("Slice points: " + circle.getSlicePoints() + "\n");
//
//        MoveDirection moveDirection = new MoveDirection(2, 3);
//        center.move(moveDirection);
//        System.out.println("After move direction.");
//        System.out.println("Radius: " + circle.getRadius());
//        System.out.println("Perimeter: " + circle.getPerimeter());
//        System.out.println("Area: " + circle.getArea() + "\n");
//        System.out.println("Slice points: " + circle.getSlicePoints() + "\n");
//
//        circle.move(moveDirection);
//        System.out.println("After second move direction.");
//        System.out.println("Radius: " + circle.getRadius());
//        System.out.println("Perimeter: " + circle.getPerimeter());
//        System.out.println("Area: " + circle.getArea() + "\n");
//        System.out.println("Slice points: " + circle.getSlicePoints() + "\n");
//
//        //Exercise 11
//        circle.resize(1.5);
//        System.out.println("After resizable.");
//        System.out.println("Radius: " + circle.getRadius());
//        System.out.println("Perimeter: " + circle.getPerimeter());
//        System.out.println("Area: " + circle.getArea());
//        System.out.println("Slice points: " + circle.getSlicePoints() + "\n");

    }
}
