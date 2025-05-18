import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        try {
            System.out.printf("What is your name?: ");
            name = scanner.nextLine().trim();

            System.out.printf("What is your age?: ");
            String ageInput = scanner.nextLine().trim();
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            System.out.println("Error occured: " + e);
            return;
        }

        if (age <= 0 || name.trim().isBlank()) {
            System.out.println("Input correct details, age must be greater than 0");
            return;
        }

        if (age > 100) {
            System.out.println("You are " + name + ", you are " + age + "years");
            return;
        }

        System.out.println("You are " + name + ", you have " + (100 - age) + " years to be 100");
    }
}
