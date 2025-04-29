import java.util.Scanner;

public class Part5BasicCalculator {

    public static void main(String[] args) {

        int num1;
        int num2;
        char operator;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Choose operator: (+, -, *, /):");
        operator = input.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The division of " + num1 + " and " + num2 + " is " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Do you want to increase or decrease the result? (Y) or (N)");
            char choice = input.next().charAt(0);
            if (choice == 'Y') {
                System.out.println("Increase (D) or Decrease (N)");
                char increaseOrDecrease = input.next().charAt(0);
                if (increaseOrDecrease == 'D') {
                    result++;
                    System.out.println("Result after incrementing: " + result);
                } else {
                    result--;
                    System.out.println("Result after decrementing: " + result);
                }
            }
        } else {
            System.out.println("Invalid operator.");
        }





    }

}
