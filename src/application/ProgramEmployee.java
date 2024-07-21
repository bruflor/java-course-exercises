package application;

import entities.Employee;

import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String name = sc.nextLine();
        System.out.println("Enter the gross salary of the employee: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the tax of the employee: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, salary, tax);
        System.out.println("Employee: " + employee.getName() + ", $" + employee.netSalary());
        System.out.println("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee.getName() + ", $" +employee.netSalary() );
        sc.close();
    }
}
