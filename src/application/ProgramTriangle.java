package application;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        System.out.println("Enter the size of the first triangle: ");
        double xa = sc.nextDouble();
        double xb = sc.nextDouble();
        double xc = sc.nextDouble();

        x = new Triangle(xa, xb, xc);
        System.out.println("Enter the size of the second triangle: ");
        double ya = sc.nextDouble();
        double yb = sc.nextDouble();
        double yc = sc.nextDouble();
        y = new Triangle(ya, yb, yc);

        double xArea = x.calculateArea();
        double yArea = y.calculateArea();
        System.out.println("Area X :" + xArea);
        System.out.println("Area Y :" + yArea);

        if(xArea > yArea) {
            System.out.println("X area is bigger than Y area");
        }else{
            System.out.println("Y area is bigger than X area");
        }


    }

}
