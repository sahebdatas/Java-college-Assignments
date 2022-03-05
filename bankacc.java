import java.util.Scanner;

class Rbi {
    int inter, minbal, maxwith;

    Rbi() {
        inter = 4;
        minbal = 0;
        maxwith = 50000;
    }

    void dis() {
        System.out.println("Miniumum Interest Rate=" + inter);
        System.out.println("Miniumum Balance=" + minbal);
        System.out.println("Maximum Withdrawl limit=" + maxwith);
    }
}

class Sbi extends Rbi {
    int a, a1, a2;

    Sbi() {
        inter = 5;
    }

    void cust(int a) {
        this.a = a;
    }

    // void dis() {
    // System.out.println("Miniumum Interest Rate of SBI BANK=" + inter);
    // System.out.println("Miniumum Balance of SBI BANK=" + minbal);
    // System.out.println("Maximum Withdrawl limit of SBI BANK=" + maxwith);
    // }
    void custde() {
        a1 = (a * inter) / 100;
        a2 = a + a1;
        System.out.println("\nPrinting amount details");
        System.out.println("-------------------------");
        System.out.println("amount is " + a);
        System.out.println("Interest amount is " + a1);
        System.out.println("Total amount is " + a2);
    }
}

class Icici extends Rbi {
    int a, a1, a2;

    Icici() {
        minbal = 10000;
    }

    void cust(int a) {
        this.a = a;
    }

    void custde() {
        a1 = (a * inter) / 100;
        a2 = a + a1;
        System.out.println("\nPrinting amount details");
        System.out.println("-------------------------");
        System.out.println("amount is " + a);
        System.out.println("Interest amount is " + a1);
        System.out.println("Total amount is " + a2);

    }
    // void dis() {
    // System.out.println("Miniumum Interest Rate of ICICI BANK=" + inter);
    // System.out.println("Miniumum Balance of ICICI BANK=" + minbal);
    // System.out.println("Maximum Withdrawl limit of ICICI BANK=" + maxwith);
    // }
}

class Pnb extends Rbi {
    int a, a1, a2;

    Pnb() {
        maxwith = 20000;
    }

    void cust(int a) {
        this.a = a;
    }

    void custde() {
        a1 = (a * inter) / 100;
        a2 = a + a1;
        System.out.println("\nPrinting amount details");
        System.out.println("-------------------------");
        System.out.println("amount is " + a);
        System.out.println("Interest amount is " + a1);
        System.out.println("Total amount is " + a2);

    }
    // void dis() {
    // System.out.println("Miniumum Interest Rate of PNB BANK=" + inter);
    // System.out.println("Miniumum Balance of PNB BANK=" + minbal);
    // System.out.println("Maximum Withdrawl limit of PNB BANK=" + maxwith);
    // }
}

public class bankacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, sel, a;
        System.out.println("\n\n\n***BANK ACCOUNT MANAGMENT PORTAL BY SAHEB***");
        // else
        // {
        // System.out.println("Wrong Choice");
        // }
        while (true) {
            System.out.println("\n\nPress 1 to display bank details");
            System.out.println("press 2 to select a bank");
            inp = sc.nextInt();
            if (inp == 1) {
                System.out.println("\nRBI details");
                System.out.println("-----------");
                Rbi obj = new Rbi();
                obj.dis();

                System.out.println("\nSBI details");
                System.out.println("-----------");
                Sbi obj1 = new Sbi();
                obj1.dis();

                System.out.println("\nICICI details");
                System.out.println("-----------");
                Icici obj2 = new Icici();
                obj2.dis();

                System.out.println("\nPNB details");
                System.out.println("-----------");
                Pnb obj3 = new Pnb();
                obj3.dis();
            } else if (inp == 2) {
                System.out.println("Press 1 for RBI");
                System.out.println("Press 2 for ICICI");
                System.out.println("Press 3 for PNB");
                sel = sc.nextInt();
                if (sel == 1) {
                    System.out.println("Enter your amount:");
                    a = sc.nextInt();
                    Sbi obj = new Sbi();
                    obj.cust(a);
                    obj.custde();
                } else if (sel == 2) {
                    System.out.println("Enter your amount:");
                    a = sc.nextInt();
                    Icici obj = new Icici();
                    obj.cust(a);
                    obj.custde();
                } else if (sel == 3) {
                    System.out.println("Enter your amount:");
                    a = sc.nextInt();
                    Pnb obj = new Pnb();
                    obj.cust(a);
                    obj.custde();
                } else {
                    System.out.println("Wrong Choice");
                }

            } else {
                System.out.println("Wrong Choice");
            }
        }
    }
}