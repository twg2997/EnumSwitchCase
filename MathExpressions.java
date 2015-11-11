import javax.swing.JOptionPane;
public class MathExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strHeightcm = "";
		double dblHeightcm, dblHeightft;
		
		strHeightcm = JOptionPane.showInputDialog("Enter your height in centimeters:");
		dblHeightcm = Double.parseDouble(strHeightcm);
		dblHeightcm = dblHeightcm * 0.39;
		dblHeightft = dblHeightcm / 12;
		JOptionPane.showMessageDialog(null, "Your height is approximately " + dblHeightcm + " in inches, or " + dblHeightft + " in feet.");
	}

}

