import java.util.Scanner;

public class UseCasePalindromeCheckerApp {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string to check: ");
    String input = scanner.nextLine();


    String reversed = "";


    for (int i = input.length() - 1; i >= 0; i--) {
      reversed += input.charAt(i);
    }


    System.out.println("Original String: " + input);
    System.out.println("Reversed String: " + reversed);


    if (input.equalsIgnoreCase(reversed)) {
      System.out.println("Result: The string IS a palindrome.");
    } else {
      System.out.println("Result: The string IS NOT a palindrome.");
    }


    scanner.close();
  }
}