package first;

public class Acedamicinfo {
    int rollno;
    float avg_marks, attendace;

    public Acedamicinfo(float avg_marks, float attendace, int rollno) {
        this.avg_marks = avg_marks;
        this.attendace = attendace;
        this.rollno = rollno;
    }

    public void display() {
        System.out.println("STUDENT EDUCATIONAL DETAILS");
        System.out.println("---------------------------");
        System.out.println("Roll no of the student " + rollno);
        System.out.println("Average of Marks of student is " + avg_marks);
        System.out.println("Attendance of student is " + attendace + "%");
    }
}