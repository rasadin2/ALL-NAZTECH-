package com.example.demo;

import java.util.Scanner;

public class Fibonacci_Class {
	public static int num1;
	public static int num2;
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("How many Fibonacci number you want? ");
		int number= input.nextInt();
		System.out.println("Enter 1st Number of Fibonacci Series: ");
		num1= input.nextInt();
		
		System.out.println("Enter 2nd Number of Fibonacci Series: ");
		num2=input.nextInt();
		
		System.out.print(num1+" "+num2);
		
		
		for(int i=3; i<=number;i++) {
			int fabo=num1+num2;
			
			num1=num2;
			num2=fabo;
			System.out.print(" "+fabo+" ");
			
		}
		
		
	}

}
