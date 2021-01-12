package dasar.oop.encapsulation.keluarga;

public class Saya {
	
	public void nama() { // bisa diakses diclass lain maupun package lain
		System.out.println("Nama saya");
	}
	
	protected void kamera() { // bisa diakses class lain tapi dalam package yang sama
		System.out.println("Kamera saya");
	}
	
	private void handphone() { // bisa diakses hanya pada classnya sendiri
		System.out.println("Handphone saya");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saya sy = new Saya();
		sy.nama();
		sy.kamera();
		sy.handphone();
		
	}
	
	

}
