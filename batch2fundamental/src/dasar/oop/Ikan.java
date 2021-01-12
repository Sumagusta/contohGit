package dasar.oop;

public class Ikan {

	public static void main(String[] args) {
		
		//instance class sendiri
		Ikan ik = new Ikan();
		ik.berenang();
		ik.bernafas();
		
		//instance class lain
		KelasDenganTigaMethod kdtm = new KelasDenganTigaMethod();
		kdtm.methodSatu();
	}
	
	public void berenang() {
		System.out.println("di kolam");
	}
	
	public void bernafas() {
		System.out.println("menghirup udara");
	}

}
