import java.util.Scanner;

class Stud {
    String name, age, address;

    Stud() {
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

}

public class Student {
    public static void main(String[] args) {
        String na, ag, ad;
        int i = 0;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Strength of Student's:");
        a = sc.nextInt();
        Stud[] obj = new Stud[a];
        while (i < a) {
            System.out.println("Student " + (i + 1) + " details Insertion");
            System.out.println("-------------------------------");
            System.out.println("Enter Student Name:");
            na = sc.next();
            System.out.println("Enter Student Age:");
            ag = sc.next();
            System.out.println("Enter Student Address:");
            ad = sc.next();
            obj[i] = new Stud();
            obj[i].setinfo(na, ag, ad);
            i++;
        }
        i = 0;
        while (i < a) {
            System.out.println("\n---------------------");
            System.out.println("Student " + (i + 1) + " details");
            System.out.println("---------------------");
            obj[i].disp();
            i++;
        }
    }
}