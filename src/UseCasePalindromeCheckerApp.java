import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return input.equalsIgnoreCase(reversed.toString());
    }
}

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.check(input);
        long endTime = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");
    }
}