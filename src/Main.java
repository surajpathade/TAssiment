import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		System.out.println("Enter two Number");
		
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		System.out.println("Before Swapping " + a +"+ b");
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(" After Swapping " + a +"+ b");

	}

}
