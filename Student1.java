import java.util.Scanner;

class Stude {
    String name;

    Stude() {
        this.name = "Unknown";
    }

    void setinfo(String n) {
        this.name = n;
    }

    void disp() {
        System.out.println("\nStudent Name:" + name);
    }
}

public class Student1 {
    public static void main(String[] args) {
        String na;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        na = sc.next();
        Stude obj = new Stude();
        obj.disp();
        Stude obj1 = new Stude();
        obj1.setinfo(na);
        obj1.disp();
    }
}
