// Date: 19/05/19
// Author: ADEBAYO Johnson
// Purpose: To obtain the Nroot(number2-root) of input value (number1)

import java.util.Scanner;  // importing the package util which contain class Scanner
public class Nroot{  // declaring class Nroot
    public static void main(String[] args){ // declaring the main method

        // creating 'input' object (which allow input of value) from the class Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find its root: "); // Display the message for user to enter value 
        double number1 = input.nextInt(); // Store the value entered by the user in variable 'number1'
 
        System.out.print("Enter the root: "); // Display the message for user to enter value 
        double number2 = input.nextInt();

        double number3 = 1/number2; // Initializing 'number3' to the value at the right
        double number4 = Math.pow(number1, number3); // Initializing 'number4' to the value at the right
        // double number5 = Math.rint(number4);

        System.out.println("The root of " + number1 + " is " + number4 ); // print out nroot of the value entered
    }
}