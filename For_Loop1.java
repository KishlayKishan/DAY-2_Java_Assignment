/*
 * @Purpose::Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
 * @File::Java_Assignment
 * @Author::Kishlay Kishan
 */

package Java_Assignment_Day2;

public class For_Loop1 {

	public static void main(String[] args) {
		int i, num = 5, sum = 0;

		for (i = 1; i <= num; ++i) {

			sum = sum + i;
		}

		System.out.println("Sum of First 5 Natural Numbers is = " + sum);

	}

}
