import java.util.Scanner;

class Member {
    String name, phno, add;
    int age, sal;

    Member() {
        name = "unknown";
        phno = "unknown";
        add = "unknown";
        age = 0;
        sal = 0;
    }

    // Member(String a,String b,String c, int d,int e)
    // {
    // this.name=a;
    // this.phno=b;
    // this.add=c;
    // this.age=d;
    // this.sal=e;
    // }
    void printSalary() {
        System.out.println(name + " is " + age + " years old" + " has a Salary of Rs." + sal + " lives in " + add
                + " and phone number is " + phno);
    }

    class Employee extends Member {
        String special, dept;

        Employee(String name, String phno, String add, int age, int sal, String special, String dept) {
            this.name = name;
            this.phno = phno;
            this.add = add;
            this.age = age;
            this.sal = sal;
            this.special = special;
            this.dept = dept;
            super.printSalary();
            System.out.println("\nSPecialization is " + special);
            System.out.println("\nDepartment is " + dept);
        }
    }

    class Manager extends Member {
        String special, dept;

        Manager(String a, String b, String c, int d, int e, String f, String g) {
            super.name = a;
            super.phno = b;
            super.add = c;
            super.age = d;
            super.sal = e;
            this.special = f;
            this.dept = g;
            super.printSalary();
            System.out.println("\nSPecialization is " + special);
            System.out.println("\nDepartment is " + dept);
        }
    }
}

public class not {
    public static void main(String[] args) {
        int age, salary;
        String name, phno, add, special, dept;
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Registration\n");
        System.out.println("Enter Employee Name");
        name = sc.next();
        System.out.println("Enter Employee Age");
        age = sc.nextInt();
        System.out.println("Enter Employee Phone Number");
        phno = sc.next();
        System.out.println("Enter Employee Address");
        add = sc.next();
        System.out.println("Enter Employee Salary");
        salary = sc.nextInt();
        System.out.println("Enter Employee specialization");
        special = sc.next();
        System.out.println("Enter Employee Department");
        dept = sc.next();
        Employee obj = new Employee(name, phno, add, age, salary, special, dept);
        obj.printSalary();
    }
}