package com.coreprograms;
import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter number2 : ");
		int num2 = scan.nextInt();
		
		/*using temporary variable
		 
		int temp=0;       
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("number1 value after swapping : "+num1);
		System.out.println("number2 value after swapping : "+num2);
		
		*/
		
		//without temporary variable
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("number1 value after swapping : "+num1);
		System.out.println("number2 value after swapping : "+num2);
		
		
	}

}
