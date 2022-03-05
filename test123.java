class abc {
    int a;

    abc() {
        this.a = 0;
        System.out.println("parents default constructor");
    }

    void pe() {
        System.out.println(a);
    }
}

class xyz extends abc {
    int ab;
    String ch;

    xyz(int a, int ab, String ch) {
        System.out.println("child default constructor");
        this.a = a;
        this.ab = ab;
        this.ch = ch;
    }

    void xyzpe() {
        // super.pe();
        System.out.println("ab=" + ab + " ch=" + ch);
    }
}

public class test123 {
    public static void main(String[] args) {
        xyz obj = new xyz(5, 10, "qwerty");
        obj.xyzpe();
        obj.pe();
    }
}