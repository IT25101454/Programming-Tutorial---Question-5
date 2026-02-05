public class Calculator{
	
	public static int add(int a, int b){
		return a + b;
	}
	
	public static int multiply(int a, int b){
		return a * b;
	}
	
	public static int square(int a){
		return a * a;
	}
	
	public static void main(String[] args){
		
		System.out.println("Calculator:");
		System.out.println();
		
		int mul1 = multiply(3, 4);
		int mul2 = multiply(5, 7);
		int sum1 = add(mul1, mul2);
		int result1 = square(sum1);
		
		System.out.println("1. (3 * 4 + 5 * 7)^2 =  " + result1);
		
		int sum2 = add(4, 7);
		int square1 = square(sum2);
		
		int sum3 = add(8, 3);
		int square2 = square(sum3);
		
		int result2 = add(square1, square2);
		
		System.out.println("2. (4 + 7)^2 + (8 + 3)^2 = " + result2);
	}
}