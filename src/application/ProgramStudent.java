package application;

import entities.Student;

import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter the first trimester grade: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the second trimester grade: ");
        double grade2 = sc.nextDouble();
        System.out.println("Enter the third trimester grade: ");
        double grade3 = sc.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);
        System.out.println(student.finalGrade());
    }
}
