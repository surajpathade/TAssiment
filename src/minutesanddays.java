import java.util.Scanner;
public class minutesanddays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of minutes");
		Double min = sc.nextDouble();
		
		long years = (long) (min/(60*24*365));
		long days = (long) (min/60/24)%365;
		
		System.out.println(min + "in approx"+years+ "years &"+ days + "days");
		

	}

}
