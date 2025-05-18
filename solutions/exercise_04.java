import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Enter a number: ");
            String numInput = scanner.nextLine();
            number = Integer.parseInt(numInput);
        } catch (Exception e) {
            System.out.println("error occured: " + e);
            return;
        }
        if (number <= 0) {
            System.out.println("number must be greater than 0");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
