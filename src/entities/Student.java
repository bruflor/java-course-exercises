package entities;

public class Student {
    public String name;
    public double trimester1;
    public double trimester2;
    public double trimester3;

    public Student(String name, double trimester1, double trimester2, double trimester3) {
        this.name = name;
        this.trimester1 = trimester1;
        this.trimester2 = trimester2;
        this.trimester3 = trimester3;
    }

    public String finalGrade(){
        double finalGrade = trimester1 + trimester2 + trimester3;
        if(finalGrade > 60){
            return finalGrade + " PASS";
        }
        else {
            double missedGrade = 60 - finalGrade;
            return finalGrade + " FAILED" + " missed " + missedGrade + " points";
        }
    }
}
