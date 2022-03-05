package first;

public class Studentinfo {
    int age;
    char sex;
    String name, address, father_name, mother_name;

    public Studentinfo(int age, char sex, String name, String address, String father_name, String mother_name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.address = address;
        this.father_name = father_name;
        this.mother_name = mother_name;
    }

    public void display() {
        System.out.println("Student Personal Details");
        System.out.println("------------------------");
        System.out.println("Name of the student is " + name);
        System.out.println("Age is " + age);
        System.out.println("Student is " + sex);
        System.out.println("Address of the student is " + address);
        System.out.println("Father's name Mr." + father_name);
        System.out.println("Mother'sname is Mrs." + mother_name);
    }
}