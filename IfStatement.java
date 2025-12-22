import java.util.*;

public class IfStatement {
  public static void main(String[] args) {
    
    // if statement = performs a block of code if its condition is true

    Scanner scanner = new Scanner(System.in);

    String name;
    int age ;
    Boolean isStudent;

    System.out.print("Enter your name : " );
    name = scanner.nextLine();

    System.out.print("Enter your age : " );
    age = scanner.nextInt();

    System.out.print("Are you a student (true/false) : " );
    isStudent = scanner.nextBoolean();

    //GROUP 01
    if (name.isEmpty()){
      System.out.println("You didn't enter your name!");
    }
    else{
      System.out.println("Hello l" + name + " !");
    }

    // GROUP 02
    if(age >= 65){
      System.out.println("You are an senior!");
    }
    else if(age >= 18){
      System.out.println("You are an adult!");
    }
    else if(age < 0){
      System.out.println("Invalid age!");
    }
    else if(age == 0){
      System.out.println("You are a baby!");
    }
    else{
      System.out.println("You are child!");
    }

    // GROUP 03
    if (isStudent){
      System.out.println("You are a student!");
    }
    else{
      System.out.println("You are NOT a student");
    }
    scanner.close();
  }
}
