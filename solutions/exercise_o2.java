import java.util.Scanner;

public class exercise_o2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Enter a number: ");
            String numInput = scanner.nextLine().trim();
            number = Integer.parseInt(numInput);
        } catch (Exception e) {
            System.out.println("error occured: " + e);
            return;
        }
        if (number <= 0) {
            System.out.println("number must be greater than 0");
            return;
        } else if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }

}
