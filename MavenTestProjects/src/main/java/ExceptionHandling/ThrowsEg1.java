package ExceptionHandling;

import java.io.IOException;

public class ThrowsEg1 {
	
	public static void display() throws IOException {
		throw new IOException("test");
	}

	public static void main(String[] args) {
		

		try {
			ThrowsEg1.display();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
