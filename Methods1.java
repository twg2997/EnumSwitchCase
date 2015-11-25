import java.util.Scanner;

public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		output(h(input()));
		output(f(input()));
		output(g(input()));
		output(square(input()));
		output(power(input()));
		output(absoluteValue(input()));
		
	}
	
	
	
	
	

	public static int h(int x) {
		return (int) Math.pow(x, 10);
	}
	
	public static int f(int x) {
		int y=4;
		return x+y;
	}
	
	public static int g(int x) {
		int y=4;
		int z=2;
		return (int) Math.sqrt(x) + (int) Math.abs(y) + (int) Math.pow(z, y);
	}
	
	public static void output(int x) {
		System.out.println(x);
	}

	
	public static int input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number.");
		return keyboard.nextInt();
	}

	public static int square(int x) {
		return x*x;
	}
	
	public static int power(int x) {
		return x*x*x*x*x;
	}
	public static int absoluteValue(int x) {
		if(x<0) {
			return x*-1;
		}
		
		else { 
			return x;
		}
	}

}
