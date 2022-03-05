class Bank {
    int bal;

    Bank() {
        this.bal = 0;
    }

    void getBalance() {
        System.out.println(bal);
    }
}

class BankA extends Bank {
    int bal;

    BankA(int bal) {
        this.bal = bal;
    }

    void getBalance() {
        System.out.println("Balance=" + bal);
    }
}

class BankB extends Bank {
    BankB(int bal) {
        this.bal = bal;
    }

    void getBalance() {
        System.out.println("Balance=" + bal);
    }
}

class BankC extends Bank {
    BankC(int bal) {
        this.bal = bal;
    }

    void getBalance() {
        System.out.println("Balance=" + bal);
    }
}

public class inhbank {
    public static void main(String[] args) {
        BankA obj = new BankA(1000);
        obj.getBalance();
        BankB obj1 = new BankB(1500);
        obj1.getBalance();
        BankC obj2 = new BankC(2000);
        obj2.getBalance();
    }
}
