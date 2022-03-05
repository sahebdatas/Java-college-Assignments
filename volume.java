import java.util.*;

class Volume {
    double area = 0.0, vol = 0.0;

    public void area(double l) {
        area = 6 * l * l;
    }

    public void area(double r, double h) {
        area = (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
    }

    public void area(double l, double b, double h) {
        area = 2 * (l * b + l * h + b * h);
    }

    public void vol(double l) {
        vol = l * l * l;
    }

    public void vol(double r, double h) {
        vol = Math.PI * r * r * h;
    }

    public void vol(double l, double b, double h) {
        vol = l * b * h;
    }

    public void display() {
        System.out.println("Area = " + area);
        System.out.println("Volume = " + vol);
    }
}

class Shape {
    public static void main(String args[]) {
        double l, b, h, r;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("***WELCOME TO SHAPE CALCULATOR BY SAHEB***");
        System.out.println("------------------------------------------");
        while (true) {
            System.out.println("\n***MAIN MENU***");
            System.out.println("---------------");
            System.out.println("To find the surface area of a cube press 1:");
            System.out.println("To find the surface area of a Cylinder press 2:");
            System.out.println("To find the surface area of a rectangular box press 3:");
            System.out.println("Press 4 to exit");
            a = sc.nextInt();
            if (a == 1) {
                Volume cube = new Volume();
                System.out.println("Enter length of Cube: \n");
                l = sc.nextDouble();
                cube.area(l);
                cube.vol(l);
                System.out.println("PRINTING RESULT....");
                cube.display();
            } else if (a == 2) {
                Volume cylinder = new Volume();
                System.out.println("Enter radius of Cylinder: \n");
                r = sc.nextDouble();
                System.out.println("Enter height of Cylinder: \n");
                h = sc.nextDouble();
                cylinder.area(r, h);
                cylinder.vol(r, h);
                System.out.println("PRINTING RESULT....");
                cylinder.display();
            } else if (a == 3) {
                Volume cuboid = new Volume();
                System.out.println("Enter length of Cuboid: \n");
                l = sc.nextDouble();
                System.out.println("Enter breadth of Cuboid: \n");
                b = sc.nextDouble();
                System.out.println("Enter height of Cuboid: \n");
                h = sc.nextDouble();
                cuboid.area(l, b, h);
                cuboid.vol(l, b, h);
                System.out.println("PRINTING RESULT....");
                cuboid.display();
            } else if (a == 4) {
                break;
            } else {
                System.out.println("ERROR: Wrong Input");
            }
        }

    }
}
