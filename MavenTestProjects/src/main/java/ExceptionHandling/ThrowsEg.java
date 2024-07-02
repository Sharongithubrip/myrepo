package ExceptionHandling;

public class ThrowsEg {
static int sum;
	
	public static int add(int a,int b) throws ArithmeticException  {
		
		
		sum=a+b;
		if(sum>50) {
		throw new ArithmeticException(sum+" grater than 50");
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ThrowsEg.add(5, 56));
		
	}

}
