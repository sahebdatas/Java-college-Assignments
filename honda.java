class bikes {
    int speedlimit = 90;
}

public class honda extends bikes {
    int speedlimit = 150;

    public static void main(String[] args) {
        bikes obj = new honda();
        System.out.println(obj.speedlimit);
        System.out.println(obj instanceof bikes);
    }
}
