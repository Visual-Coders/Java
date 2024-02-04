import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("Sum: " + sum);
    }
}
