package InterfaceEG;

import java.util.Scanner;

public class ClassHDFC implements Rbi {
	
	static Scanner src=new Scanner (System.in);
	static double tamt=0;
	
	public void recurringDeposit () {
		
		System.out.println("Enter the deposit Amount :");
		
		int dpositeAmount=src.nextInt();
		

		System.out.println("Enter the Duration in year:");
		
		int duration=src.nextInt();
		
		
		tamt= dpositeAmount*(1+(interest/100)*duration);
		
		System.out.println("Bank fixed interest will be : 6%");
		
		System.out.println("Total amount with interest will be  : " +tamt);
		
		
	}

	public static void main(String[] args) {
		
		
		
		Rbi obj=new ClassHDFC();
		obj.recurringDeposit();

	}




}
