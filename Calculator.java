import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char operator;

        while (true) {
            System.out.println("Enter first number: ");
            num1 = scanner.nextInt();

            System.out.println("Choose an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            num2 = scanner.nextInt();

            int result = calculate(num1, operator, num2);

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("Do you want to continue? (y/n)");
            char choice = scanner.next().charAt(0);
            if (choice != 'y') {
                break;
            }
        }
        scanner.close();
    }

    public static int calculate(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Invalid operator!");
                return 0;
        }
    }
}
