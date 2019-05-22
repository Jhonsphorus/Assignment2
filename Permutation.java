// Date: 19/05/19
// Author: ADEBAYO Johnson
// Purpose: To obtain the Nroot(number2-root) of input value (number1)

import java.util.Scanner;  // importing the package util which contain class Scanner
public class Permutation{  // declaring class Nroot
    public static void main(String[] args){ // declaring the main method

        // creating 'input' object (which allow input of value) from the class Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: "); // Display the message for user to enter value 
        int number1 = input.nextInt(); // Store the value entered by the user in variable 'number1'
 
        System.out.print("Enter the second number: "); // Display the message for user to enter value 
        int number2 = input.nextInt();

        int number3 = number1 - number2;

        int factoria1 = 1;
        for (int i=number1; i>=1; i--){
            factoria1 *=i;
        }

        int  factoria2 = 1;
        for (int j=number3; j>=1; j--){
            factoria2 *=j;    
        } 
        int  factoria3 = 1;
        for (int k=number2; k>=1; k--){
            factoria3 *=k;    
        } 
        int permutation1 = factoria1 / factoria2;
        int combination1 = factoria1/ (factoria2 * factoria3);
        //System.out.println(factoria1);
        //System.out.println(factoria2);
        System.out.println(number1 +" Permutation " + number2 + " is " + permutation1);
        System.out.println(number1 +" Combination " + number2 + " is " + combination1);
    }
}
 
