//3. Write a program in java to define a class Shape which has data member „area‟ and a member function showArea(). Derive two classes Circle and Rectangle from Shape class. Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle. [Use abstract class]
import java.util.Scanner;

abstract class Shape {
    double area;

    abstract void calculateArea(); // Abstract method to calculate area

    void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        area = length * width;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Circle object
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.calculateArea();
        circle.showArea();

        // Creating Rectangle object
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();
        rectangle.showArea();
   }
}
