package Main;

import java.util.*;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();

        int max = 0;

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } 
            else {
                max = num3;
            }
        } 
        else if (num2 > num3) {
            max = num2;
        } 
        else {
            max = num3;
        }

        System.out.println("Max number is : " + max);
    }
}
