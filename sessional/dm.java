class Account {
    int acc_no;
    double balance;

    Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void disp0() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no; 

    Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance); 
        this.name = name;
        this.aadhar_no = aadhar_no;
    }
    
    void disp0() {
        super.disp0();
        System.out.println("Name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
    }
}

public class dm {
    public static void main(String[] args) {
        Person p1 = new Person(123456, 5000, "RIYA", "1234 5678 9012");
        Person p2 = new Person(789012, 10000, "ROHAN", "3456 7890 1234");
        Person p3 = new Person(345678, 15000, "RAHUL;", "5678 9012 3456");
        

        p1.disp0();
        System.out.println();
        p2.disp0();
        System.out.println();
        p3.disp0();
        System.out.println();
    }
}
