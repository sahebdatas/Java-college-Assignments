import java.util.*;

abstract class Marks {
    public abstract float getPercentage();
}

class A extends Marks {
    int marks1, marks2, marks3;

    A(int m1, int m2, int m3) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public float getPercentage() {
        float total = ((marks1 + marks2 + marks3) / (float) 300) * 100;
        return total;
    }
}

class B extends Marks {
    int marks1, marks2, marks3, marks4;

    B(int m1, int m2, int m3, int m4) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.marks4 = m4;
    }

    public float getPercentage() {
        float total = ((marks1 + marks2 + marks3 + marks4) / (float) 400) * 100;
        return total;
    }
}

public class Student123 {
    public static void main(String[] args) {
        int s1, s2, s3, s4;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n  Enter marks for Student A :");
        System.out.println("---------------------------");
        System.out.println("Enter marks for Subject1:");
        s1 = sc.nextInt();
        System.out.println("Enter marks for Subject2:");
        s2 = sc.nextInt();
        System.out.println("Enter marks for Subject3:");
        s3 = sc.nextInt();
        A a = new A(s1, s2, s3);
        System.out.println("Percentage=" + a.getPercentage());
        System.out.println("\nEnter marks for Student B :");
        System.out.println("---------------------------");
        System.out.println("Enter marks for Subject1:");
        s1 = sc.nextInt();
        System.out.println("Enter marks for Subject2:");
        s2 = sc.nextInt();
        System.out.println("Enter marks for Subject3:");
        s3 = sc.nextInt();
        System.out.println("Enter marks for Subject4:");
        s4 = sc.nextInt();
        B b = new B(s1, s2, s3, s4);
        System.out.println("Percentage=" + b.getPercentage());
    }
}