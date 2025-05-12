import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // read input from command line
        Scanner scanner = new Scanner(System.in);
        // store the input in a variable and declare data type
        long userInput = scanner.nextLong();
        // close to save resources
        scanner.close();

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