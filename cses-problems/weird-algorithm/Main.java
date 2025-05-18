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
        // close to save resources
        // scanner.close();

        // print initial number
        System.out.print(userInput + " ");
        // print until number is 1
        while (userInput != 1) {
            userInput = checker(userInput);
            System.out.print(userInput + " ");
        }
    }

    public static long checker(long userInput) {
        if (userInput % 2 != 0) {
            userInput = (userInput * 3) + 1;
        } else if (userInput % 2 == 0) {
            userInput = userInput / 2;
        }
        return userInput;
    }
}
