public class Car { 
 
 
 	
	private String color; 
 	private int horsePower; 
 	private String engineSize; 
 	private int count;

 	 
 	

	public Car() { 
 		
 		this.color = "color"; 
 		this.horsePower = 0; 
 		this.engineSize = "engineSize";
 		this.count++;
 		 
 	} 
 	 
 	public Car(String color, int horsePower, String engineSize) { 

 		
 		
 		this.color = color; 
 		this.horsePower = horsePower; 
 		this.engineSize = engineSize; 
 		this.count++;
 	} 
 	 
 	
 	
 
 	
 	
 	
 	
 	public String getcolor() { 
 		return this.color; 
 	} 
 
 
 	public void setcolor(String color) { 
 		this.color = color; 
 	} 
 
 
 	public int gethorsePower() { 
 		return this.horsePower; 
 	} 
 
 
 	public void sethorsePower(int horsePower) { 
 		this.horsePower = horsePower; 
 	} 
 
 
 	public String getengineSize() { 
 		return this.engineSize; 
 		 
 	} 
 	 
 	
 	
 	
 	
 	
 	public void setengineSize(String engineSize) { 
 		this.engineSize = engineSize; 
 	} 
 	 
 	public int getcount() {
		return count;
	}

	public void setcount(int count) {
		this.count = count++;
	}
 	
 	
 	
 	
 	
 	
 	public String toString() { 
 		return "Car #" + this.count + " is the color " + this.color + ", the horse-power is " + this.horsePower + ", and the engine size is " + engineSize + "."; 
 	} 
 
 
 
 
 } 



