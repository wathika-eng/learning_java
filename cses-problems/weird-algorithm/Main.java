import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // read input from command line
        Scanner scanner = new Scanner(System.in);
        long userInput;
        // store the input in a variable and declare data type
        try {
            userInput = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return;
        }

        if (userInput <= 0) {
            System.out.println("number must be greater than 0");
            return;
        }

        StringBuilder sb = new StringBuilder();

        // print initial number
        sb.append(userInput).append(" ");
        // print until number is 1
        while (userInput != 1) {
            userInput = checker(userInput);
            sb.append(userInput).append(" ");
        }
        System.out.print(sb);
    }

    public static long checker(long userInput) {
        return userInput = (userInput % 2 == 0) ? (userInput / 2) : (userInput * 3) + 1;
    }
}
