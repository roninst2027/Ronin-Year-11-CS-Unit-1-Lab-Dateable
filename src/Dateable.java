import java.util.Scanner;
public class Dateable {

  public static void main(String[] args) {
      // Write your code below, inside the main method.
   //Creating a scanner for input
   Scanner scanner = new Scanner(System.in);

   // prompt user to enter their age
   System.out.print("How old are you?");
   int age = scanner.nextInt();

   //Calculate the minimum age
   int minimumAge = (7+(age/2));

   //print the users minimum dating age
   System.out.print("You should only date people aged " +minimumAge + " or above.");

  }
  
}
