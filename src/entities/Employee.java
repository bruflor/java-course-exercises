package entities;

public class Employee {
    private final String name;
    private double grossSalary;
    private final double tax;

    public Employee(String name, double salary, double tax) {
        this.name = name;
        this.grossSalary = salary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * percentage/100);
    }
}
