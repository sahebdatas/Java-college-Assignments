import java.util.Scanner;

class abcde {
    int sub1, sub2, sub3, tot, roll;
    float avg;

    abcde(int sub1, int sub2, int sub3, int roll) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.roll = roll;
    }

    void display() {
        tot = sub1 + sub2 + sub3;
        avg = tot / 3;
        // System.out.println("Student's Roll.no is " + roll);
        // System.out.println("Subject 1 Marks= " + sub1);
        // System.out.println("Subject 2 Marks= " + sub2);
        // System.out.println("Subject 3 Marks= " + sub3);
        // System.out.println("Total Marks= " + tot);
        System.out.println("Average Marks= " + avg);
    }

}

public class Student1234 {
    public static void main(String[] args) {
        int sub1, sub2, sub3, roll;
        int i = 0;
        int j = 0;
        abcde[] obj = new abcde[10];
        Scanner sc = new Scanner(System.in);
        while (i < 8) {
            System.out.println("Enter Student " + (i + 1) + " Roll.no:");
            roll = sc.nextInt();
            System.out.println("Enter Student " + (i + 1) + " Subject 1 Marks:");
            sub1 = sc.nextInt();
            System.out.println("Enter Student " + (i + 1) + " Subject 2 Marks:");
            sub2 = sc.nextInt();
            System.out.println("Enter Student " + (i + 1) + " Subject 3 Marks:");
            sub3 = sc.nextInt();
            obj[i] = new abcde(sub1, sub2, sub3, roll);
            i++;
        }
        System.out.println("ALL STUDENT'S INFORMATION");
        System.out.println("-------------------------");
        while (j < 8) {
            System.out.println("***Student " + (j + 1) + " Info***");
            obj[j].display();
            j++;
        }
        sc.close();
    }
}