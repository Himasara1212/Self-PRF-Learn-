import java.util.*;

public class NumberGame {
  public static void main(String[] args) {
    Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randNum = rand.nextInt(101); 
        System.out.println("...............ENTER NUMBER 0 TO 100 ..........");

        for (int i = 0; i < 8; i++) {

            System.out.print("Enter your num : ");
            int num = sc.nextInt();

            if (num == randNum) {
                System.out.println("..Correct..");
                return;
            } 
            else if(num<randNum) {
                System.out.println("Enter the Heiger Number Than you enterd");
            }

            else if(num>randNum) {
                System.out.println("Enter the Lower Number Than you enterd");
            }
            else{
              System.out.print("try again");
            }
        }

        System.out.println("...Game over...");
        System.out.print("Correct number is : " + randNum);
  }
}
