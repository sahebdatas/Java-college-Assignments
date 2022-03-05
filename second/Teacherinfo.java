package second;

public class Teacherinfo {
    String name, designation, Department;

    public Teacherinfo(String name, String designation, String Department) {
        this.name = name;
        this.designation = designation;
        this.Department = Department;
    }

    public void display() {
        System.out.println("STAFF  DETAILS");
        System.out.println("--------------");
        System.out.println("Name of the Member " + name);
        System.out.println("Designation= " + designation);
        System.out.println("Department = " + Department);
    }
}