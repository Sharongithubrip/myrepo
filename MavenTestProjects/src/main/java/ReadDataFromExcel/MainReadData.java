package ReadDataFromExcel;

import java.io.IOException;

public class MainReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String name=ReadDataPgm.getStringData(1, 0);
		System.out.println(name);
		
		double id=ReadDataPgm.getNumData(2, 1);
		
		int roundVal= (int) Math.round(id);
		
		System.out.println(roundVal);	
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
