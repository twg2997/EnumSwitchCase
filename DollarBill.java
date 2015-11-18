import javax.swing.JOptionPane;

public class DollarBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double $1Bill = 1.00;
		double $5Bill = 5.00;
		double $10Bill = 10.00;
		double changeQuarter = .25;
		double changeDime = .10;
		double changeNickel = .05;
		double changePenny = .01;
		
		int inputAmount = 0;
		
	
		
		inputAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert a one, five, or ten dollar bill to make change."));
	
		double quarterReturn = inputAmount/changeQuarter;
		double dimeReturn = inputAmount/changeDime;
		double nickelReturn = inputAmount/changeNickel;
		double pennyReturn = inputAmount/changePenny;
		
		
		if (inputAmount==($1Bill)||inputAmount==($5Bill)||inputAmount==($10Bill)){
		
			JOptionPane.showMessageDialog(null, "Input: $" + inputAmount + "\nQuarters: " + quarterReturn + "\nDimes: " + dimeReturn + "\nNickels: " + nickelReturn + "\nPennys: " + pennyReturn);
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid Input.");
		}
	
	}

}

