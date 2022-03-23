/*
 * @Purpose:: Write a Program to print the month name for the given number.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

import java.util.Scanner;

public class Month_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month name (full name): ");

		String name = sc.next().toUpperCase();

		sc.close();

		switch (name) {

		case "JANUARY":

			System.out.println("Month Number: 1");

			break;

		case "FEBRUARY":

			System.out.println("Month Number: 2");

			break;

		case "MARCH":

			System.out.println("Month Number: 3");

			break;

		case "APRIL":

			System.out.println("Month Number: 4");

			break;

		case "MAY":

			System.out.println("Month Number: 5");

			break;

		case "JUNE":

			System.out.println("Month Number: 6");

			break;

		case "JULY":

			System.out.println("Month Number: 7");

			break;

		case "AUGUST":

			System.out.println("Month Number: 8");

			break;

		case "SEPTEMBER":

			System.out.println("Month Number: 9");

			break;

		case "OCTOBER":

			System.out.println("Month Number: 10");

			break;

		case "NOVEMBER":

			System.out.println("Month Number: 11");

			break;

		case "DECEMBER":

			System.out.println("Month Number: 12");

			break;

		default:
			System.out.println("Invalid Data.");

		}

	}

}
