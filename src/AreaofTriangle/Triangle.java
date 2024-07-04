package AreaofTriangle;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		
		System.out.println("Enter value for sides of Triangle");
		
		Scanner Scanner  = new Scanner(System.in);
		
		double height;
		double width;
		double area;
		System.out.println("Enter width:");
		width = Scanner.nextDouble();
		System.out.println("Enter height:");
		height = Scanner.nextDouble();
		
		area = (height*width)/2;
		
		System.out.println("Area of a Tringle is " + area);
		
		


	}

}
