import java.util.Scanner;

public class PrimeCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number to check: ");
        int num1 = input.nextInt();

        for (int i =2; i<=num1; i++){

            if (num1%i ==0 && i != num1 ){
                System.out.println(num1 + " is not a Prime number");
                break;
            }
            //else if (num1 % i !=0 ){

            //}
            else {
                System.out.println(num1 + " is a Prime number");
                break;
            }

        }
    }
}
