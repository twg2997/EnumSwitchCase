public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator overload = new Calculator();
		
		double [] num = { 5.0, 10.0, 15.0 };
		
	
		
		System.out.println("The sum is " + Calculator.getSum(num[0],num[1],num[2]));
		
		System.out.println("The product is " + Calculator.getProduct(num[0],num[1],num[2]));
		
		System.out.println("The average is " + Calculator.getAverage(num[0],num[1],num[2]));
		
		System.out.println("The factorial is " + Calculator.getFactorial(num[0]));
		
	}
	
}


