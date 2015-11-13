import javax.swing.JOptionPane;
 

 
 public class CarDriver { 
 
 
 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 
 
 		Car car1 = new Car(); 
 		 
 
 
 		 
 		
 		String color = JOptionPane.showInputDialog("Enter a color.");
 		car1.setcolor(color); 
 		 
 		 
 		int horsePower = Integer.parseInt(JOptionPane.showInputDialog("Enter the horse-power."));
 		car1.sethorsePower(horsePower); 
 		 
 		 
 		String engineSize = JOptionPane.showInputDialog("Enter the engine size.");
 		car1.setengineSize(engineSize); 
 		
 		 
 		JOptionPane.showMessageDialog(null, car1); 
 		 
 		 
 		 
 		 
 		Car car2 = new Car(); 
 		
 
 
 		 
 		color = JOptionPane.showInputDialog("Enter a color.");
 		car2.setcolor(color); 
 		 
 		 
 		horsePower = Integer.parseInt(JOptionPane.showInputDialog("Enter the horse-power."));
 		car2.sethorsePower(horsePower); 
 		 
 		 
 		engineSize = JOptionPane.showInputDialog("Enter the engine size.");
 		car2.setengineSize(engineSize); 
 		
 		 
 		JOptionPane.showMessageDialog(null, car2); 
 		 
 		 
 		 
 		 
 		Car car3 = new Car(); 
 		 
 
 
 		 
 		color = JOptionPane.showInputDialog("Enter a color.");
 		car3.setcolor(color); 
 		 
 		 
 		horsePower = Integer.parseInt(JOptionPane.showInputDialog("Enter the horse-power."));
 		car3.sethorsePower(horsePower); 
 		 
 		 
 		engineSize = JOptionPane.showInputDialog("Enter the engine size.");
 		car3.setengineSize(engineSize); 
 		
 		 
 		JOptionPane.showMessageDialog(null, car3); 
 	} 
 }

