package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle ret;

        System.out.println("Enter the width and the height of the rectangle: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        ret = new Rectangle(w, h);
        System.out.println("Area: " + ret.calculateArea());
        System.out.println("Perimeter: " + ret.calculatePerimeter());
        System.out.println("Diameter: " + ret.calculateDiagonal());

        sc.close();
    }
}
