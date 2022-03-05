class A {
    int i;

    A(int i) {
        this.i = i;
    }

    void printNum() {
        System.out.println("i=" + i);
    }
}

class B extends A {
    int j;

    B(int j) {
        super(10);
        this.j = j;
    }

    void printNum() {
        System.out.println("j=" + j + "\ni=" + i);
    }
}

public class Supinher {
    public static void main(String[] args) {
        B obj = new B(5);
        obj.printNum();
    }
}