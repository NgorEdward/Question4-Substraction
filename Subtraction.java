package vu.subtraction;

import java.util.Random;
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Generate two single-digit integers
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        // Ensure number1 is greater than or equal to number2
        if (number2 > number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student to answer the subtraction question
        System.out.printf("What is %d - %d? ", number1, number2);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        // Check the student's answer and display the result
        if (answer == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Incorrect. The correct answer is %d.\n", number1 - number2);
        }
    }
}
