
//4. Write a program to create an Account class containing acc_no, balance as data members and disp() to display the details. Inherit it in Person class with all mentioned data members and functions. Person class also has name and aadhar_no as extra data members of its own. Override disp() function. Create 3 persons‟ details.
class account {
    int acc_no;
    double balance;

    account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends account {
    String name;
    long aadhar_no;

    Person(int acc_no, double balance, String name, long aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    void disp() { 
        super.disp(); // Calling the disp() method of the parent class
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}
..[[[[[[[[[[[[]]]]]]]]]]]]
public class acc{
    public static void main(String[] args) {
        // Creating three Person objects
        Person person1 = new Person(1001, 5000.0, "John", 123456789012L);
        Person person2 = new Person(1002, 7500.0, "Alice", 987654321098L);
        Person person3 = new Person(1003, 3000.0, "Bob", 456789012345L);

        // Displaying details of the three persons
        System.out.println("Details of Person 1:");
        person1.disp();
        System.out.println("\nDetails of Person 2:");
        person2.disp();
        System.out.println("\nDetails of Person 3:");
        person3.disp();
   }
}
