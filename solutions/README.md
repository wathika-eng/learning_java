---
title: Practice Java - Exercises for Beginners

---

# Practice Java - Exercises for Beginners

Credits go to Michele Pratusevich, who is the author of *Practice Python*. All the exercises are adapted from there. Exercises that are too Python-specific have been omitted. New exercises will be added over time.

Solutions are provided in Java, and confirmed to work with Java SE 17 on Windows 10/Linux, as well as on online platforms like Replit. Solutions are beginner-appropriate and not optimized (e.g., the prime checker in Exercise 10).

The [Java Tutorial by Oracle University](https://mylearn.oracle.com/ou/story/40805) is an excellent place to start, and its content should be sufficient to solve all the exercises.

<!-- - [Link to GitHub repository]() -->
- [dev.java](https://dev.java/learn/)
- [sdkman](https://sdkman.io/)

## Running the Code

1. Download and install the [Java Development Kit (JDK)](https://sdkman.io/) on your machine. `sdk install java 17.0.15-tem`
2. Write your code in `.java` files or clone the Git repository.
3. Compile and run your code from the terminal:

   ```bash
   javac CodeFile.java
   java CodeFile
   ```

4. Alternatively, you can run the code on [Replit](https://replit.com/) (select Java from the options) or other online IDEs. Note that some platforms may have limitations on I/O operations.

> **Recommendation**: Use Replit for ease of use.

---

## Exercise 1

Create a program that asks the user to enter their name and age. Print a message that tells how many years they have left to reach 100 years old.

<details>
  <summary>solution</summary>

  ```java
  import java.util.Scanner;

// check if user is 100 years
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
                System.out.println("You are " + name + ", you are " + age + " years");
                return;
            }

            System.out.println("You are " + name + ", you have " + (100 - age) + " years to be 100");
        }
    }
  ```

</details>

## Exercise 2

Ask the user for a number. Print whether the number is even or odd.

<details>
  <summary>solution</summary>

```java
    import java.util.Scanner;

    public class exercise_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("The number " + number + " is odd.");
            }
        }
    }
```

</details>

## Exercise 3

Given a list, for example:

```java
int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
```

Write a program that prints all elements of the list that are less than 5.

<details>
  <summary>solution</summary>

```java
    public class exercise_03 {
        public static void main(String[] args) {
            int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

            System.out.println("Elements less than 5:");
            for (int number : a) {
                if (number < 5) {
                    System.out.print(number + " ");
                }
            }
        }
    }
```

</details>

---

## Exercise 4

Create a program that asks the user for a number and prints a list of all its divisors.

*Note*: A divisor is a number that divides evenly into another number (e.g., 13 is a divisor of 26 because 26 / 13 has no remainder).

<details>
  <summary>solution</summary>

```java
    import java.util.Scanner;

    public class exercise_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("Divisors of " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
```

</details>

---

## Exercise 5

Given two lists, for example:

```java
int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
```

Write a program that returns a list of elements common to both (without duplicates). Ensure it works for lists of different sizes.

**Solution**

---

## Exercise 6

Ask the user for a string and print whether it is a palindrome.

*Note*: A palindrome reads the same forwards and backwards.

**Solution**

---

## Exercise 7

Given a list:

```java
int[] a = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
```

Write a program that creates a new list containing only the even elements.

**Solution**

---

## Exercise 8

Create a two-player Rock-Paper-Scissors game against the computer. Ask for player input, compare choices, and print the winner.

**Solution**

---

## Exercise 9

Generate a random number between 1 and 100. Ask the user to guess it, then indicate if the guess is too low, too high, or correct. Track the number of guesses and print it when the game ends.

**Solution**

---

## Exercise 10

Ask the user for a number and determine if it is prime using a function.

**Solution**

---

## Exercise 11

Given a list, for example:

```java
int[] a = {5, 10, 15, 20, 25};
```

Write a function that returns a new list containing only the first and last elements.

**Solution**

---

## Exercise 12

Write a program that asks the user how many Fibonacci numbers to generate and then generates them using functions.

**Solution**

---

## Exercise 13

Write a function that takes a list and returns a new list with all duplicates removed.

**Solution**

---

## Exercise 14

Write a function that asks the user for a string of multiple words and prints the words in reverse order. For example:

```
Input: My name is Michele
Output: Michele is name My
```

**Solution**

---

## Exercise 15

Write a password generator in Java. Generate strong passwords with a mix of lowercase, uppercase, numbers, and symbols. Generate a new password each time the user requests one, using a `main` method. Ask the user how strong they want the password (e.g., weak passwords can be one or two words from a list).

*Warning*: Do not use generated passwords for real accounts. Use a password manager like 1Password.

**Solution**

---

## Exercise 16

Create a "Cows and Bulls" game. Generate a random 4-digit number. The user guesses a 4-digit number. A "cow" is a digit guessed correctly in the correct position; a "bull" is a digit guessed correctly in the wrong position. After each guess, show the number of cows and bulls. Track guesses and display the total when the correct number is guessed.

**Solution**

---

## Exercise 17

Draw a game board (like Tic-Tac-Toe) using `System.out.println`. For example, a 3x3 board:

```
 --- --- --- 
|   |   |   | 
 --- --- ---  
|   |   |   | 
 --- --- ---  
|   |   |   | 
 --- --- --- 
```

Ask the user for the board size and draw it.

**Solution**

---

## Exercise 18

Given a 3x3 Tic-Tac-Toe board as a 2D array, for example:

```java
int[][] game = {
    {1, 2, 0},
    {2, 1, 0},
    {2, 1, 1}
};
```

where `0` is an empty square, `1` is Player 1, and `2` is Player 2, check if anyone has won (3 in a row, column, or diagonal). Indicate which player won, if any. Assume only one winner per board.

**Solution**

---

## Exercise 19

Using a 3x3 Tic-Tac-Toe board as a 2D array, handle user input for a player’s move (e.g., Player 1 places an `X`). Ask for coordinates to place their piece.

**Solution**

---

## Exercise 20

Combine the Tic-Tac-Toe components (board drawing, win checking, move handling) into a two-player game. Track the winner and display a congratulatory message. Stop the game if no moves remain. Rework functions as needed for integration.

**Solution**

---

## Exercise 21

The user thinks of a number between 0 and 100. The program guesses a number, and the user indicates if it’s too high, too low, or correct. Print the number of guesses taken to find the number.

**Solution**

---

## Exercise 22

Write a function that takes three variables and returns the largest without using Java’s `Math.max()` function. Use variables and `if` statements.

**Solution**

---

## Exercise 23

Write a function that picks a random word from the SOWPODS dictionary file. Save the file in the same directory as your code and use Java’s random utilities to select a word.

**Solution**

---

## Exercise 24

Implement the Hangman game. The player guesses letters for a clue word (e.g., `EVAPORATE`). Display correctly guessed letters and allow unlimited guesses until the word is complete. Optionally, track guessed letters and display a message for repeated guesses.

**Solution**

---

## Exercise 25

Complete the Hangman game. Limit the player to 6 incorrect guesses (head, body, 2 legs, 2 arms). Track guessed letters and avoid penalizing repeated guesses. Allow starting a new game on win/loss. Optionally, display ASCII art for the hangman instead of a guess counter.

**Solution**

---

## Exercise 26

Create a birthday dictionary. Store names and birthdays in a file. Ask the user for a name and return the corresponding birthday. Example:

```
Welcome to the birthday dictionary. We know the birthdays of:
Albert Einstein
Benjamin Franklin
Ada Lovelace
Who's birthday do you want to look up?
> Benjamin Franklin
Benjamin Franklin's birthday is 01/17/1706.
```

**Solution**

---

## Exercise 27

Modify the birthday dictionary program to load birthdays from a JSON file. Allow the user to add a new name and birthday, updating the JSON file.

**Solution**

---

## Exercise 28

Load the birthday JSON file and count how many scientists have birthdays in each month. Output a structure like:

```java
{
    "May": 3,
    "November": 2,
    "December": 1
}
```

**Solution**

```
# Practice Java - Exercises for Beginners

Credits go to Michele Pratusevich, who is the author of *Practice Python*. All the exercises are adapted from there. Exercises that are too Python-specific have been omitted. New exercises will be added over time.

Solutions are provided in Java, and confirmed to work with Java SE 17 on Windows 10/Linux, as well as on online platforms like Replit. Solutions are beginner-appropriate and not optimized (e.g., the prime checker in Exercise 10).

The [Java Tutorial by Oracle University](https://mylearn.oracle.com/ou/story/40805) is an excellent place to start, and its content should be sufficient to solve all the exercises.

<!-- - [Link to GitHub repository]() -->
- [dev.java](https://dev.java/learn/)
- [sdkman](https://sdkman.io/)

## Running the Code
1. Download and install the [Java Development Kit (JDK)](https://sdkman.io/) on your machine. `sdk install java 17.0.15-tem`
2. Write your code in `.java` files or clone the Git repository.
3. Compile and run your code from the terminal:
   ```bash
   javac CodeFile.java
   java CodeFile
   ```

4. Alternatively, you can run the code on [Replit](https://replit.com/) (select Java from the options) or other online IDEs. Note that some platforms may have limitations on I/O operations.

> **Recommendation**: Use Replit for ease of use.

---

## Exercise 1

Create a program that asks the user to enter their name and age. Print a message that tells how many years they have left to reach 100 years old.

<details>
  <summary>solution</summary>

  This is the hidden solution content.  
  You can write code, explanations, or anything else here.

  ```java
  public class Main {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
</details>
---

## Exercise 2

Ask the user for a number. Print whether the number is even or odd.

**Solution**

---

## Exercise 3

Given a list, for example:

```java
int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
```

Write a program that prints all elements of the list that are less than 5.

**Solution**

---

## Exercise 4

Create a program that asks the user for a number and prints a list of all its divisors.

*Note*: A divisor is a number that divides evenly into another number (e.g., 13 is a divisor of 26 because 26 / 13 has no remainder).

**Solution**

---

## Exercise 5

Given two lists, for example:

```java
int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
```

Write a program that returns a list of elements common to both (without duplicates). Ensure it works for lists of different sizes.

**Solution**

---

## Exercise 6

Ask the user for a string and print whether it is a palindrome.

*Note*: A palindrome reads the same forwards and backwards.

**Solution**

---

## Exercise 7

Given a list:

```java
int[] a = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
```

Write a program that creates a new list containing only the even elements.

**Solution**

---

## Exercise 8

Create a two-player Rock-Paper-Scissors game against the computer. Ask for player input, compare choices, and print the winner.

**Solution**

---

## Exercise 9

Generate a random number between 1 and 100. Ask the user to guess it, then indicate if the guess is too low, too high, or correct. Track the number of guesses and print it when the game ends.

**Solution**

---

## Exercise 10

Ask the user for a number and determine if it is prime using a function.

**Solution**

---

## Exercise 11

Given a list, for example:

```java
int[] a = {5, 10, 15, 20, 25};
```

Write a function that returns a new list containing only the first and last elements.

**Solution**

---

## Exercise 12

Write a program that asks the user how many Fibonacci numbers to generate and then generates them using functions.

**Solution**

---

## Exercise 13

Write a function that takes a list and returns a new list with all duplicates removed.

**Solution**

---

## Exercise 14

Write a function that asks the user for a string of multiple words and prints the words in reverse order. For example:

```
Input: My name is Michele
Output: Michele is name My
```

**Solution**

---

## Exercise 15

Write a password generator in Java. Generate strong passwords with a mix of lowercase, uppercase, numbers, and symbols. Generate a new password each time the user requests one, using a `main` method. Ask the user how strong they want the password (e.g., weak passwords can be one or two words from a list).

*Warning*: Do not use generated passwords for real accounts. Use a password manager like 1Password.

**Solution**

---

## Exercise 16

Create a "Cows and Bulls" game. Generate a random 4-digit number. The user guesses a 4-digit number. A "cow" is a digit guessed correctly in the correct position; a "bull" is a digit guessed correctly in the wrong position. After each guess, show the number of cows and bulls. Track guesses and display the total when the correct number is guessed.

**Solution**

---

## Exercise 17

Draw a game board (like Tic-Tac-Toe) using `System.out.println`. For example, a 3x3 board:

```
 --- --- --- 
|   |   |   | 
 --- --- ---  
|   |   |   | 
 --- --- ---  
|   |   |   | 
 --- --- --- 
```

Ask the user for the board size and draw it.

**Solution**

---

## Exercise 18

Given a 3x3 Tic-Tac-Toe board as a 2D array, for example:

```java
int[][] game = {
    {1, 2, 0},
    {2, 1, 0},
    {2, 1, 1}
};
```

where `0` is an empty square, `1` is Player 1, and `2` is Player 2, check if anyone has won (3 in a row, column, or diagonal). Indicate which player won, if any. Assume only one winner per board.

**Solution**

---

## Exercise 19

Using a 3x3 Tic-Tac-Toe board as a 2D array, handle user input for a player’s move (e.g., Player 1 places an `X`). Ask for coordinates to place their piece.

**Solution**

---

## Exercise 20

Combine the Tic-Tac-Toe components (board drawing, win checking, move handling) into a two-player game. Track the winner and display a congratulatory message. Stop the game if no moves remain. Rework functions as needed for integration.

**Solution**

---

## Exercise 21

The user thinks of a number between 0 and 100. The program guesses a number, and the user indicates if it’s too high, too low, or correct. Print the number of guesses taken to find the number.

**Solution**

---

## Exercise 22

Write a function that takes three variables and returns the largest without using Java’s `Math.max()` function. Use variables and `if` statements.

**Solution**

---

## Exercise 23

Write a function that picks a random word from the SOWPODS dictionary file. Save the file in the same directory as your code and use Java’s random utilities to select a word.

**Solution**

---

## Exercise 24

Implement the Hangman game. The player guesses letters for a clue word (e.g., `EVAPORATE`). Display correctly guessed letters and allow unlimited guesses until the word is complete. Optionally, track guessed letters and display a message for repeated guesses.

**Solution**

---

## Exercise 25

Complete the Hangman game. Limit the player to 6 incorrect guesses (head, body, 2 legs, 2 arms). Track guessed letters and avoid penalizing repeated guesses. Allow starting a new game on win/loss. Optionally, display ASCII art for the hangman instead of a guess counter.

**Solution**

---

## Exercise 26

Create a birthday dictionary. Store names and birthdays in a file. Ask the user for a name and return the corresponding birthday. Example:

```
Welcome to the birthday dictionary. We know the birthdays of:
Albert Einstein
Benjamin Franklin
Ada Lovelace
Who's birthday do you want to look up?
> Benjamin Franklin
Benjamin Franklin's birthday is 01/17/1706.
```

**Solution**

---

## Exercise 27

Modify the birthday dictionary program to load birthdays from a JSON file. Allow the user to add a new name and birthday, updating the JSON file.

**Solution**

---

## Exercise 28

Load the birthday JSON file and count how many scientists have birthdays in each month. Output a structure like:

```java
{
    "May": 3,
    "November": 2,
    "December": 1
}
```

**Solution**

```
