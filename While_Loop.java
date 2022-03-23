/*
 * @Purpose:: Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5.
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

public class While_Loop {

	public static void main(String[] args) {

		int num = 5, i = 1, sum = 0;

		while (i <= num) {

			sum = sum + i;

			i++;
		}

		System.out.println("Sum of First 5 Natural Numbers is = " + sum);
	}

}
