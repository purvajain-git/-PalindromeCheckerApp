import java.util.Scanner;

public class UseCasePalindromeCheckerApp {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Input : ");

    String input = scanner.nextLine();


    char[] chars = input.toCharArray();


    int start = 0;


    int end = chars.length - 1;


    boolean isPalindrome = true;


    while (start < end) {

      if (chars[start] != chars[end]) {
        isPalindrome = false;
        break;
      }
      start++;
      end--;
    }


    System.out.println("Is Palindrome? : " + isPalindrome);


    scanner.close();
  }
}