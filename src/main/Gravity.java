/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("please enter the value of t");
		double t = Scanner.nextDouble();
		double s = 9.8 * t;
		double D = 0.5 * 9.8 * t * t;
		System.out.print("The speed of object 6.0 after release is " + s);
		System.out.print(" and the distance the object has travell in 6.0 after the relase is" + D);
		Scanner.close();
	}
}
