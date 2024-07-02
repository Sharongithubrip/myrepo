package InterfaceEG;

public class InterfaceMainDetails implements InterfaceName,InterfaceAge {
	
	public void name() {
		
		
		
		System.out.println("name is : "+name);
		
	}
	
	public  void age() {
		
		System.out.println("age is : "+age);
		
	}

	public static void main(String[] args) {
		
		InterfaceMainDetails obj=new InterfaceMainDetails();
		obj.name();
		obj.age();

	}

}
