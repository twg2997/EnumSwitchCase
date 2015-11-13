import java.util.Scanner;


import javax.swing.JOptionPane;
public class EchoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	int int_input;
	short short_input;
	long long_input;
	byte byte_input;
	float float_input;
	double double_input;
	char char_input;
	
	Scanner keyboard = new Scanner(System.in);
	
	
	
	System.out.println("Enter your current age.");
	int_input = keyboard.nextInt();
	JOptionPane.showMessageDialog(null, "Your age : " + int_input);
	
	
	System.out.println("Enter a whole number beteen -32,768 and 32,767");
	short_input = keyboard.nextShort();
	JOptionPane.showMessageDialog(null, "Your input:" + short_input);
	
	
	System.out.println("Enter a whole number between (-2^63) and (2^63 -1)");
	long_input = keyboard.nextLong();
	JOptionPane.showMessageDialog(null, "Your input:" + long_input);
	
	
	System.out.println("Enter a number between -128 an 127");
	byte_input = keyboard.nextByte();
	JOptionPane.showMessageDialog(null, "Your input:" + byte_input);
	
	
	System.out.println("Enter your age");
	float_input = keyboard.nextFloat();
	JOptionPane.showMessageDialog(null, "Your input:\nYou are  " + float_input + " years old.");
	
	
	System.out.println("Enter your current account balance.");
	double_input = keyboard.nextDouble();
	JOptionPane.showMessageDialog(null, "Your current account balance is " + double_input);
	
	
	System.out.println("Enter the first letter of your last name.");
	char_input = keyboard.next().charAt(0);
	JOptionPane.showMessageDialog(null, "Your input: " + char_input);
	
	
	
	}
}


