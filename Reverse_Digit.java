/*
 * @Purpose::Write a Program to reverse the integer number eg. Input n=231 reverse is 132.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

public class Reverse_Digit {

	public static void main(String[] args) {
		int num = 1234, reversed = 0;

		System.out.println("Original Number: " + num);

		while (num != 0) {

			int digit = num % 10;
			reversed = reversed * 10 + digit;

			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);

	}
}
