
//1. Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.	

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
    
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            students[i] = new Student(roll, name, cgpa);
        }
        
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.roll);
            System.out.println("Name: " + student.name);
            System.out.println("CGPA: " + student.cgpa);
            System.out.println();
        }
        
        Student lowestCgpaStudent = students[0];
        for (Student student : students) {
            if (student.cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = student;
            }
        }
        
        System.out.println("Student with Lowest CGPA:");
        System.out.println("Name: " + lowestCgpaStudent.name);
        System.out.println("Roll Number: " + lowestCgpaStudent.roll);
        System.out.println("CGPA: " + lowestCgpaStudent.cgpa);
  }
}
