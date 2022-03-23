/*
 * @Purpose::Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 * can be found using a formula (Note: Take a, b and c as input values)
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

import java.util.Scanner;

public class Quadratic {

	public static void quadraticRoot(double a, double b, double c) {

		// delta = b*b - 4*a*c

		double delta = 0;
		delta = Math.pow(b, 2) - 4 * a * c;

		System.out.println("delta= " + delta);

		// Root 1 of x = (-b + sqrt(delta))/(2*a)
		// Root 2 of x = (-b - sqrt(delta))/(2*a)

		double rootOneOf_x = 0;
		double rootTwoOf_x = 0;
		rootOneOf_x = ((-b) + Math.sqrt(delta)) / (2 * a);
		rootTwoOf_x = ((-b) - Math.sqrt(delta)) / (2 * a);
		System.out.println("rootOneOf_x= " + rootOneOf_x + "\trootTwoOf_x= " + rootTwoOf_x);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the constants of equation a*x*x+b*x+c");
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = scanner.nextInt();
		quadraticRoot(a, b, c);
		//

	}

}
