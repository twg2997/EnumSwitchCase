import java.util.Scanner;
public class Delimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;//Each variable represents a numeric input value
		
		Scanner keyboard1 = new Scanner(System.in);
		
		
		
		System.out.println("Enter ten numbers separated by a comma to find the average.");
		n1 = keyboard1.nextInt();//Stores the number input on each line to a variable
		n2 = keyboard1.nextInt();
		n3 = keyboard1.nextInt();
		n4 = keyboard1.nextInt();
		n5 = keyboard1.nextInt();
		n6 = keyboard1.nextInt();
		n7 = keyboard1.nextInt();
		n8 = keyboard1.nextInt();
		n9 = keyboard1.nextInt();
		n10 = keyboard1.nextInt();
		
		int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;//Calculates sum
		System.out.println("\nSum: " + sum);
		int average = sum/10;//Calculates average
		System.out.println("\nThe average is " + average + ".");
	}

}

