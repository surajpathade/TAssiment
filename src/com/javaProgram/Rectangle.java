package com.javaProgram;

import java.util.Scanner; 

public class Rectangle {

	public static void main(String[] args) {
		// Attribute of the rectangle
		
		float l,b,a,p;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter length");
		
		l = input.nextFloat();
		
		System.out.println("Enter breath");
		
		b = input.nextFloat();
		
		a = l*b;
		p = 2*(l+b);
		
		System.out.println("Area = "+ b);
		
		
		
		

	}

}
