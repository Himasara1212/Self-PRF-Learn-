package Main;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("Invalid Age");
        } 
        else if (age < 18) {
            System.out.println("Child");
        } 
        else {
            System.out.println("Adult");
        }
    }
}
