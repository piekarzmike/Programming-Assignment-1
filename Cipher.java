
/*
**********************************************************************************************

	Author: Mike Piekarz

	Course Name: Programming Fundamentals	
	
	Semester: 2020 Summer

	Assignment Name: Programming Assignment # 1
 		
**********************************************************************************************/


// Import the Scanner and Random class from the Java.util package
import java.util.Scanner;
import java.util.Random;

public class Cipher {

	/*-----------------------------------------------------------------------------------------
       Requirements
	     For this assignment, you are to create a program in Java that allows the user to encode the sum of 5 numbers
	     using the Caesar Code, as shown above. You are to work on this assignment independently. The program will work
	     as follows:
	 		1. Ask the user to enter 5 integers in the range from 0 to 19 (inclusive). If they enter a number outside of this
	           range, display the message "Please read directions and try again!" and terminate the program.
	 		2. Sum these 5 numbers and store it in a variable. This will be your plaintext (the unencoded number).
	 		3. Create a random integer in the range of 0 to 9 (inclusive). This will be your key for the encoding. Display
	           this key to the user.
	 		4. Encode each digit of the plaintext separately using the Caesar Code (see above). The encoded number
	           should be 2 digits (even if plaintext is only 1 digit).
	 		5. Display the encoded number to the user.
	-----------------------------------------------------------------------------------------*/
		
	public static void main(String[] args) {
		
		// Declare variables
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int sumNum1to5;
		int key;
		int digit1 =0 ;
		int digit2 = 0;
		int encodedNum1 = 0;
		int encodedNum2 = 0;
		Scanner scan = new Scanner(System.in);
		Random randomNum = new Random();
		
		// Create program header details (Program Name, Programmer Name, Program Assignment #, & Welcome Intro) and display to the user 
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Mike Piekarz");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println("\nWelcome to the Cipher program.");
		
		// Prompt user to enter in 5 numbers that are within the range of 0 to 19 
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		// Prompt user to enter 1st number and initialize input
		System.out.print("1st number: ");
		num1 = scan.nextInt();
		
		//Check if input (num1) is greater than 19. If so, notify user and exit program.
		if (num1 > 19)
		{                           
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
	
		// Prompt user to enter 2nd number and initialize input
		System.out.print("2nd number: ");
		num2 = scan.nextInt();
		
		//Check if input (num2) is greater than 19. If so, notify user and exit program.
		if (num2 > 19)
		{
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		// Prompt user to enter 3rd number and initialize input
		System.out.print("3rd number: ");
		num3 = scan.nextInt();
		
		//Check if input (num3) is greater than 19. If so, notify user and exit program.
		if (num3 > 19)
		{
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		// Prompt user to enter 4th number and initialize input
		System.out.print("4th number: ");
		num4 = scan.nextInt();
		
		//Check if input (num4) is greater than 19. If so, notify user and exit program.
		if (num4 > 19)
		{
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		// Prompt user to enter 5th number and initialize input
		System.out.print("5th number: ");
		num5 = scan.nextInt();
		
		//Check if input (num5) is greater than 19. If so, notify user and exit program.
		if (num5 > 19)
		{
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
	
		// Sum all numbers inputed by the user and display the sum
		sumNum1to5 = (num1 + num2 + num3 + num4 + num5);
		System.out.println("\nTotal = " + sumNum1to5);

		// Initialize the key variable to a random number between 0 to 9 and display to user.  
		key = randomNum.nextInt(10);
		System.out.println("Your random key is " + key);
		
		// Encode the sum of the numbers inputed by the user by adding the "key" to each digit in the sum amount and doing a modulo 10 to each digit.
		if (sumNum1to5 > 9)
		{
			digit1 = (sumNum1to5 / 10);
			digit2 = (sumNum1to5 % 10);
		
			encodedNum1 = ((digit1 + key)%10);
			encodedNum2 = ((digit2 + key)%10);
		}
		else
		{
			encodedNum1 = ((0 + key)%10);
			encodedNum2 = ((sumNum1to5 + key)%10);
		}
		
		// Display to user the encoded number
		System.out.println("Your encoded number is " + encodedNum1 + "" + encodedNum2);
		
		//Close Scanner
		scan.close();

	}
		
}
		
