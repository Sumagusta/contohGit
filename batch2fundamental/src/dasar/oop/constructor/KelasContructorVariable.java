package dasar.oop.constructor;

public class KelasContructorVariable {
	String namaDepan;
	int usia;
	
	public KelasContructorVariable() {
		namaDepan = "Subagyo";
		usia = 29;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KelasContructorVariable kav = new KelasContructorVariable();
		System.out.println(kav.namaDepan);
		System.out.println(kav.usia);
	}

}
