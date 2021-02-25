import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class JeffGrockowskiProject04 here.
 *
 * @author Jeff Grockowski
 * @version V1 09/23/2019
 */
public class JeffGrockowskiProject04
{
    public static void main (String [] args) {
        //create scanner class for input from keyboard
        Scanner input = new Scanner (System.in);
        
        //user instructions and get input of hex value
        System.out.println("This program converts numbers to different bases");
        System.out.println("First, lets convert a hexadecimal value to an integer."); 
        System.out.print("Enter your amount: ");
        String hex = input.nextLine();
        //convert hex value to decimal
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Your Hex value is " + decimal);
        
        // get input for decimal to binary conversion
        System.out.println("Now lets convert decimal to binary. Enter a decimal number:");
        int l = input.nextInt();
        // convert using pre build method and print for user
        System.out.println("Your number in binary is " + Integer.toBinaryString(l));
        
        //convert from decimal to binary using my own algoitham
        
        //get input from user
        System.out.println("Lastly, my own alorithm for converting binary to decimal. Enter your binary number:");
        int a = input.nextInt();
        //initialize variables to track the power and final result
        int result = 0, p = 0;
        
        //loop through input removing last digit each loop
        while(a != 0) {
            // each loop, find the last digit of variable and multiply by 2^x power
            result += ((a % 10) * Math.pow(2,p));
            //remove last digit and increase the power
            a /= 10;
            p++;
        }
        //output result
        System.out.println("Your binary number is " + result + " in decimal.");

    }
}


/*          Sample Program output
 * 
 * 
 *   This program converts numbers to different bases
 *   First, lets convert a hexadecimal value to an integer.
 *   Enter your amount: ab
 *   Your Hex value is 171
 *   Now lets convert decimal to binary. Enter a decimal number:
 *   171
 *   Your number in binary is 10101011
 *   Lastly, my own alorithm for converting binary to decimal. Enter your binary number:
 *   10101011
 *   Your binary number is 171 in decimal.
 *   This program converts numbers to different bases
 *   First, lets convert a hexadecimal value to an integer.
 *   Enter your amount: cd
 *   Your Hex value is 205
 *   Now lets convert decimal to binary. Enter a decimal number:
 *   205
 *   Your number in binary is 11001101
 *   Lastly, my own alorithm for converting binary to decimal. Enter your binary number:
 *   11001101
 *   Your binary number is 205 in decimal.
 *
 */