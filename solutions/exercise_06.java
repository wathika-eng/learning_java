import java.util.Scanner;

public class exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        try {
            System.out.print("enter a string: ");
            input = scanner.nextLine().trim().toLowerCase();
        } catch (Exception e) {
            System.out.println("error occured: " + e);
            return;
        }
        boolean status = checker(input);
        if (!status) {
            System.out.println(input + " is not a palindrome");
            return;
        } else {
            System.out.println(input + " is a palindrome");
        }
    }

    private static boolean checker(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        if (reversed.matches(input)) {
            return true;
        } else {
            return false;
        }
        // int len = input.length();
        // for (int i = 0; i < len; i++) {
        // ch = input.charAt(i);
        // }
    }
}
