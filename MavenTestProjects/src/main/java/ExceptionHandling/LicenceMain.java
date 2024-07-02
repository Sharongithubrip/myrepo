package ExceptionHandling;

public class LicenceMain {

	
	public static void display(int age) throws LicenceException {
		
		if (age<18) {
			throw new LicenceException ("not eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {

		try {
			LicenceMain.display(11);
		} catch (LicenceException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
