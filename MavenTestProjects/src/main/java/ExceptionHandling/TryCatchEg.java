package ExceptionHandling;

public class TryCatchEg {

	public static void main(String[] args) {
		int a=50;
		int b=10;
		int sum=a+b;
		try {
			
			System.out.println(sum);
			int s=a/0;
			int arr[]=new int[3];
			arr[6]=10;
			System.out.println(sum);
			
			
			
		}
			catch(ArrayIndexOutOfBoundsException e){
				
				System.out.println(e);
				
			}
		
		catch(ArithmeticException e){
			
			System.out.println(e);
			
		}
	catch(Exception e){
			
			System.out.println(e);
			
		}
		//System.out.println(sum);
		
		finally {
			System.out.println("final block");
		}
	}

}
