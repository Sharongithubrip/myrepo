package InterfaceEG;

public class Demo implements Sample{
	
	public void name() {
		
		System.out.println(name);
		
	}
	public  void age() {
		System.out.println(age);
	}

	public static void main(String[] args) {
		Sample obj=new Demo();
		obj.name();
		obj.age();
		
	}

}
