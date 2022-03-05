class Degree {
    void getDegree() {
        System.out.println("I Got a Degree");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    void getDegree1() {
        System.out.println("I am an Postgraduate");
    }
}

class degreeinhert {
    public static void main(String[] args) {
        Postgraduate obj = new Postgraduate();
        // obj.getDegree();
        // Undergraduate obj1 = new Undergraduate();
        // obj1.getDegree();
        // Postgraduate obj2 = new Postgraduate();
        // obj2.getDegree();
    }
}