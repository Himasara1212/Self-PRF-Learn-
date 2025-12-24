package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("========================================================");
            System.out.println("                EMPLOYEE MANAGEMENT SYSTEM              ");
            System.out.println("========================================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter Number: ");

            int num = sc.nextInt();

            if (num == 1) {
                if (employees.size() < 3) {

                    System.out.print("\nEnter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, salary);
                    employees.add(emp);

                    System.out.println("\n....Added Successfully....\n");

                } else {
                    System.out.println("\n....You can add Only 3 employees....\n");
                }

            } else if (num == 2) {

                System.out.println("\n---------------------------");
                System.out.println("ID\tName\tSalary");
                System.out.println("---------------------------\n");

                for (Employee e : employees) {
                    System.out.println(e.id + "\t" + e.name + "\t" + e.salary);
                }

            } else if (num == 3) {
                System.out.println("\n....Thank you....");
                break;

            } else {
                System.out.println("\n....Invalid Number....");
            }
        }
    }
}
