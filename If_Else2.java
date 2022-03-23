/*
 * @Purpose::Read a Number 1,10,100,1000 and display unit, ten hundred.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

import java.util.Scanner;

public class If_Else2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int thousand = 0;

		int hundreds = 0;

		int tens = 0;

		int ones = 0;

		// Input 4 digit number

		System.out.print("Enter 4 digit number: ");

		int number = input.nextInt();

		if (number <= 9999 && number > 999)

		{

			thousand = number / 1000;

			System.out.printf("thousands place digit: " + thousand);

			hundreds = (number / 100) % 10;

			System.out.printf("\nHundreds place digit: " + hundreds);

			tens = (number / 10) % 10; // compare with your code

			System.out.printf("\nTens place digit: " + tens);

			ones = (number % 10); // compare with your code

			System.out.printf("\nOnes place digit: " + ones);

		}

		else

		{

			if (number > 9999)

				System.out.println("\nError! Number more then  digits.");

			if (number < 1000)

				System.out.println("Error! Number less then 4 digits.");
		}
	}
}
