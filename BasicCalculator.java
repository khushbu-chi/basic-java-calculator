//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class BasicCalculator {
    static double addition(double number1, double number2) {
        //System.out.println(number1);
        return number1 + number2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) {
        return (num1/num2);
    }
    public static void main(String[] args) {
        double result;
        boolean continueCalculation = true;
        Scanner scanner = new Scanner(System.in);
        // Input two numbers
        while (continueCalculation) {
            System.out.println("Welcome to the Calculator!");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                continueCalculation = false;
                break;
            }else if(choice == 1) {
                    // System.out.println(operator);
                    result = addition(num1, num2);
                    System.out.println(result);
                    continueCalculation=true;
                } else if (choice == 2) {
                    // System.out.println(operator);
                    result = subtraction(num1, num2);
                    System.out.println(result);
                    continueCalculation=true;
                } else if (choice == 3) {
                    // System.out.println(operator);
                    result = multiplication(num1, num2);
                    System.out.println(result);
                    continueCalculation=true;
                } else if (choice == 4) {
                    // System.out.println(operator);
                    result = division(num1, num2);
                    System.out.println(result);
                    continueCalculation=true;
                }else{
                System.out.println("Invalid choice. Please try again!");
                continueCalculation=true;
            }
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if(response.equalsIgnoreCase("no")) {
                System.out.println("Exiting the calculator. Goodbye!");
                continueCalculation = false;
            } else {
                continueCalculation=true;
            }
            }
            //Perform operation based on operator
            //scanner.close();
        }
    }
