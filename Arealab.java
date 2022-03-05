import java.util.*;

abstract class Shape1 {
    abstract void RectangleArea(float length, float breadth);

    abstract void SquareArea(float radius);

    abstract void CircleArea(float side);
}

class Area2 extends Shape {
    double Area = 0;

    void Rectangle(float length, float breadth) {
        Area = length * breadth;
        System.out.println("Area of rectangle is: " + Area);

    }

    void Square(float Side) {
        Area = Side * Side;
        System.out.println("Area of Square is: " + Area);
    }

    void Circle(float radius) {
        Area = (radius * radius) * 3.14;
        System.out.println("Area of Circle is: " + Area);
    }

}

public class Arealab {
    public static void main(String[] args) {
        float l, b, s, r;
        Area2 A = new Area2();
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangles");
        System.out.println("-----------------------------------------");
        System.out.println("length");
        l = scr.nextFloat();
        System.out.println("breadth");
        b = scr.nextFloat();
        A.Rectangle(l, b);

        System.out.println("Enter the sides of squares");
        System.out.println("--------------------------");
        System.out.println("side");
        s = scr.nextFloat();
        A.Square(s);

        System.out.println("Enter the radius of circles");
        System.out.println("---------------------------");
        System.out.println("radius=");
        r = scr.nextFloat();
        A.Circle(r);
        scr.close();
    }

}