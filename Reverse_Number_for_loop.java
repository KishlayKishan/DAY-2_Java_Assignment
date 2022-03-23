/*
 * @Purpose:: Write a Program to reverse the integer number eg. Input n=231 reverse is 132.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

public class Reverse_Number_for_loop {

	public static void main(String[] args) {
		int num = 1234567, reversed = 0;

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}

		System.out.println("Reversed Number: " + reversed);
	}

}
