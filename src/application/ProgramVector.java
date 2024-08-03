package application;

import java.util.Scanner;

public class ProgramVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos :");
        for(int i = 0; i < n; i++) {
            if(numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }


        sc.close();
    }
}
