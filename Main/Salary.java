package Main;

import java.util.*;

public class Salary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your salary : ");
    int salary = sc.nextInt();

    int result = salary / 5000;
    salary = salary % 5000;
    System.out.println("5000 notes : "+ result);

    result = salary / 2000;
    salary = salary % 2000;
    System.out.println("2000 notes : "+ result);

    result = salary / 1000;
    salary = salary % 1000;
    System.out.println("1000 notes : "+ result);

    result = salary / 500;
    salary = salary % 500;
    System.out.println("500 notes : "+ result);

    result = salary / 100;
    salary = salary % 100;
    System.out.println("100 notes : "+ result);

    result = salary / 50;
    salary = salary % 50;
    System.out.println("50 notes : "+ result);

    result = salary / 20;
    salary = salary % 20;
    System.out.println("20 notes : "+ result);

    result = salary / 10;
    salary = salary % 10;
    System.out.println("10 coins : "+ result);

    result = salary / 5;
    salary = salary % 5;
    System.out.println("5 coins : "+ result);

    result = salary / 2;
    salary = salary % 2;
    System.out.println("2 coins : "+ result);

    System.out.println("1 coins : " + salary);

  }
}
