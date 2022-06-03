package lexicon.fundamentals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Hello user, wanted to calculate or wanted to end program press 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        if (number1 == 0) {
            System.exit(0);
        }
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the operator you want to perform +,-,*,/ ");
        String operator = scanner.next();
        while(!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))){
            System.out.println("Invalid operator, choose the operator from +,-,*,/");
            operator=scanner.next();
            continue;

        }
         if (operator.equals("+")) {
            System.out.println("Result: " + calculator.addOperation(number1, number2, operator));

        } else if (operator.equals("-")) {
            System.out.println("Result: " + calculator.subOperation(number1, number2, operator));

        } else if (operator.equals("*")) {
            System.out.println("Result: " + calculator.mulOperation(number1, number2, operator));

        } else if (operator.equals("/")) {
            System.out.println("Result: " + calculator.divOperation(number1, number2, operator));

        }
    }

        public int addOperation ( int number1, int number2, String operator){
            return number1 + number2;
        }
        public int subOperation ( int number1, int number2, String operator){
            return number1 - number2;
        }
        public int mulOperation ( int number1, int number2, String operator){
            return number1 * number2;
        }
        public int divOperation ( int number1, int number2, String operator){
            return number1 / number2;
        }
    }
