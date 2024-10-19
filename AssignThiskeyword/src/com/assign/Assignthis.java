package com.assign;

import java.util.Scanner;

public class Assignthis {
 
	public int summation(int a,int b) {
		int sum = a+b ;
		return sum;
	}
	public int substraction(int a,int b) {
		int sub = a-b ;
		return sub;
	}
	public int multiplication(int a,int b) {
		int multi = a*b ;
		return multi;
	}
	public void division(int a,int b) {
		int div = a/b ;
		System.out.println("(((((x1+x2)-x3)+x4)*x5)/x6)--Result--->"  + div);
	}
	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		int X1 =sc.nextInt();
		int X2 = sc.nextInt();
		int X3 = sc.nextInt();
		int X4 = sc.nextInt();
		int X5 = sc.nextInt();
		int X6 = sc.nextInt();
		Assignthis assi = new Assignthis();
		int summation1 = assi.summation(X1, X2);
		int substraction1 = assi.substraction(summation1, X3);
		int addition = assi.summation(substraction1, X4);
		int multiplication1 = assi.multiplication(addition, X5);
		    assi.division(multiplication1, X6);
		
	}
}