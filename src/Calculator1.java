import java.util.Scanner;

public class Calculator1 {
    // psvm - not so magic shortcut
    public static void main(String[] args) {
        System.out.println("calculator....");
        System.out.println("calculating sum of two numbers");
        System.out.println("provide first number");
        int firstNumber;
        int secondNumber;
        // TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);
    }
}
