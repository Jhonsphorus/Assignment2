// Date: 16/05/19
// Author: Johnson Adebayo
// Purpose: Input two numbers to determine the operator of their result


import java.util.Scanner;

public class CheckOperator2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input operator: ");
        String operator1 = input.nextLine();
    
        
        System.out.println("Input first number: ");
        double num1 = input.nextDouble();

        System.out.println("Input second number: ");
        double num2 = input.nextDouble();

        double a = num1 * num2;
        double b = num1 / num2;
        double c = num1 + num2;
        double d = num1 - num2;
        double e = num1 % num2;
        double f = Math.pow(num1,num2);

        switch (operator1) {
            case "*":
            System.out.println("Multiplication: " + num1 + " * " + num2 +" = " + a);
            break;

            case "/":
            System.out.println("Division: " + num1 + " / " + num2 +" = " + b);
            break;

            case "+":
            System.out.println("Addition: " + num1 + " + " + num2 +" = " + c);
            break;

            case "-":
            System.out.println("Subtraction: " + num1 + " - " + num2 +" = " + d);
            break;

            case "%":
            System.out.println("Modulus: " + num1 + " % " + num2 +" = " + e);
            break;

            case "^":
            System.out.println("Power: " + num1 + " ^ " + num2 +" = " + f);
            break;
        }
    }
}