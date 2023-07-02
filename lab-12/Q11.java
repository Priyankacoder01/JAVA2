//5. Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super.

class base {
    int num;

    base(int num) {
        this.num = num;
        System.out.println("Base class constructor called with num = " + num);
    }
}

class Derived extends base {
    int sum;

    Derived(int num1, int num2) {
        super(num1); // Calling the parameterized constructor of the base class using super
        sum = num1 + num2;
        System.out.println("Derived class constructor called with num1 = " + num1 + " and num2 = " + num2);
    }

    void display() {
        System.out.println("Sum: " + sum);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Derived obj = new Derived(10, 20); // Creating an object of the Derived class
        obj.display(); // Calling the display() method of the Derived class
   }
}
