/*
 * @Purpose:: Write a Program to print the month name for the given number.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

public class Vowel_Consonent_Check {

	public static void main(String[] args) {

		// char ch = 'z';
		char ch = 'a';

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonant");

		}

	}
}
