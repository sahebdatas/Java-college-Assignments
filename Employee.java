import java.util.Scanner;

public class Employee {
    String name, id, address;

    public Employee(String d, String e, String f, int a, int b, String g, String h) {
    }

    public void setter(String a, String b, String c) {
        System.out.println("Initializing values...");
        name = a;
        id = b;
        address = c;
    }

    public void disp() {
        System.out.println("Printing Object...\n");
        System.out.println("Employee Details");
        System.out.println("----------------\n");
        System.out.println("Employee ID= " + id);
        System.out.println("Employee Name= " + name);
        System.out.println("Employee Address=" + address);
    }

    public static void main(String[] args) {
        System.out.println("******Welcome to Employee's Portal by Saheb******");
        String name, id, add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter employee's details");
        System.out.println("Enter Employee ID:");
        name = sc.next();
        System.out.println("Enter Employee Name:");
        id = sc.next();
        System.out.println("Enter Employee Address:");
        add = sc.next();
        System.out.println("Creating object Employee OBJ...");
        Employee obj;
        obj = new Employee();
        System.out.println("Calling Function through OBJ...");
        obj.setter(id, name, add);
        obj.disp();
    }

    public void printSalary() {
    }
}