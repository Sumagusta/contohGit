package dasar.oop.poly;

public class SubClass extends SuperClass {
	String laptop = "ASUS";
	
	public void panggil() {
		System.out.println(laptop);
		System.out.println(super.laptop);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		s.panggil();
	}

}
