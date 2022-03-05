import first.*;
import second.*;
import java.util.Scanner;

class Student007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, rollno;
        char sex;
        String name, address, father_name, mother_name, techName, designation, Department;
        float avg_marks, attendace;
        System.out.println("");
        System.out.println("***Enter Student Informations***\n");
        System.out.println("Name of the student:");
        name = sc.next();
        System.out.println("Student's Age:");
        age = sc.nextInt();
        System.out.println("Student's Gender is:");
        sex = sc.next().charAt(0);
        System.out.println("Student Address:");
        address = sc.next();
        System.out.println("Student's Father's name:");
        father_name = sc.next();
        System.out.println("Student's Mother's name:");
        mother_name = sc.next();

        Studentinfo obj = new Studentinfo(age, sex, name, address, father_name, mother_name);

        System.out.println("\n\n***Enter Student Informations***\n");
        System.out.println("Student's Rollno:");
        rollno = sc.nextInt();
        System.out.println("Student's Marks:");
        avg_marks = sc.nextFloat();
        System.out.println("Student's Attendence:");
        attendace = sc.nextFloat();
        Acedamicinfo obj1 = new Acedamicinfo(avg_marks, attendace, rollno);

        System.out.println("\n\n***Enter Teacher's Informations***\n");
        System.out.println("Teacher's Name:");
        techName = sc.next();
        System.out.println("Teacher's Designation:");
        designation = sc.next();
        System.out.println("Teacher's Department:");
        Department = sc.next();
        Teacherinfo obj3 = new Teacherinfo(techName, designation, Department);
        obj.display();
        obj1.display();
        obj3.display();
        sc.close();
    }
}