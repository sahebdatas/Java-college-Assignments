import java.util.Scanner;

class Hero {
    void disp() {
        System.out.println("Class is being executed");
    }
}

public class Student10 {
    String name, age, address;

    Student10() {
        this.name = "Unknown";
        this.age = "0";
        this.address = "Not available";
    }

    void setinfo(String n, String a) {
        this.name = n;
        this.age = a;
    }

    void setinfo(String n, String a, String add) {
        this.name = n;
        this.age = a;
        this.address = add;
    }

    void disp() {
        System.out.println("\nStudent Name:" + name + "\nStudent Age:" + age + "\nStudent Address:" + address);
    }

    public static void main(String[] args) {
        String na, ag, ad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        na = sc.next();
        System.out.println("Enter Student Age:");
        ag = sc.next();
        System.out.println("Enter Student Address:");
        ad = sc.next();
        Student10 obj = new Student10();
        obj.disp();
        Student10 obj1 = new Student10();
        obj1.setinfo(na, ag);
        obj1.disp();
        Student10 obj2 = new Student10();
        obj2.setinfo(na, ag, ad);
        obj2.disp();
        Hero objec = new Hero();
        objec.disp();
        sc.close();
    }
}
