package dasar.oop.constructor;

public class KelasAdaConstructor {

	public KelasAdaConstructor() { // constructor
		System.out.println("Inisialisasi dari class / pertama kali yang dipanggil saat di instance");
	}
	
	public void iniMethod() { // method biasa
		System.out.println("Aku method biasa");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KelasAdaConstructor kac = new KelasAdaConstructor();
		kac.iniMethod();
	}

}
