package dasar.oop.day8;

public class MethodInput {

	public void methodInput(String nama) {
		System.out.println(nama);
	}
	
	public void methodInput2(int a) {
		System.out.println(a);
	}
	
	public void methodInput3(String namaDepan, String namaBelakang) {
		String fullName = namaDepan+"\t"+namaBelakang;
		System.out.println(fullName);
	}
	
	public void methodInput4(String nama, int tinggi, double ipk) {
		System.out.println(nama);
		System.out.println(tinggi+" cm");
		System.out.println(ipk);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodInput mi = new MethodInput();
		String namaBuah = "Buah Naga";
		mi.methodInput(namaBuah);
		mi.methodInput2(90);
		
		mi.methodInput3("Satria", "Wiguna");
		System.out.println();
		
		mi.methodInput4("Wahyu", 168, 3.45);
	}

}
