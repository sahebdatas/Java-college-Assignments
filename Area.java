import java.util.Scanner;

abstract class Shape {
    int length, breadth, side, radius;

    abstract void rectangle_area(int length, int breadth);

    abstract void square_area(int side);

    abstract void circle_area(int radius);
}

class Area {
    double pi = 3.14, rec, sq, ci;

    void rectangle_area(int length, int breadth) {
        System.out.println("\nRectangle Area=" + length * breadth);
    }

    void square_area(int side) {
        System.out.println("\nSquare Area=" + side * side);
    }

    void circle_area(int radius) {
        System.out.println("\nCicle Area=" + pi * radius * radius);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, l, b, s, j, r;
        Area[] A = new Area[15];
        for (i = 0; i < 14; i++) {
            A[i] = new Area();
        }
        for (j = 0; j < 15; j++) {
            A[j] = new Area();
        }
        i = 0;
        System.out.println("\nRectangle Calculator");
        System.out.println("--------------------");
        for (i = 0; i < 4; i++) {
            System.out.println("length");
            l = sc.nextInt();
            System.out.println("breadth");
            b = sc.nextInt();
            A[i].rectangle_area(l, b);
        }
        System.out.println("\nSquare Calculator");
        System.out.println("-----------------");
        for (i = 5; i < 9; i++) {
            System.out.println("side");
            s = sc.nextInt();
            A[i].square_area(s);
        }
        System.out.println("\nCircle Calculator");
        System.out.println("-----------------");
        for (i = 10; i < 15; i++) {
            System.out.println("radius=");
            r = sc.nextInt();
            A[i].circle_area(r);
        }

    }
}