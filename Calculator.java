public class Calculator {
	public static double getSum(double first, double second, double third) {
		return (first + second + third);
	}
	
	public static double getProduct(double first, double second, double third) {
		return (first * second * third);
	}
	
	public static double getAverage(double first, double second, double third) {
		return (first + second + third)/3.0;
	}
	
	public static double getFactorial(double first) {
		
		return ((first) * (first - 1) * (first - 2) * (first - 3) * (first - 4));
	}
	
	
	public static double getAverage(double [] num) {
		double sum = 0.0;
		for(int i = 0; i<num.length; i++){
			sum+=num[i];
		}
		
		
		
		
		return(sum/3.0);
	}

	
	public static double getProduct(double [] num) {
		double product = 1.0;
		for(int i = 0; i<num.length; i++){
			product+=num[i];
	}
	return(product);
	}

	public static double getSum(double [] num) {
		double sum = 0.0;
		for(int i = 0; i<num.length; i++){
			sum+=num[i];
	}
	return(sum);
	}

	


}
	



