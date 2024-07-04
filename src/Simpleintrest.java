import java.util.Scanner;
public class Simpleintrest {

	public static void main(String[] args) {
		
		float p,r,t,SI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle");
		p = sc.nextFloat();
		
		System.out.println("Enter the rate of intrest");
		r = sc.nextFloat();
		
		System.out.println("Enter the time period");
		t = sc.nextFloat();
		
		SI = (p*r*t)/100;
		System.out.println("simple intrest is" + SI);
		

	}

}
