package dasar.oop.poly;

public class KelasAnak extends KelasBapak {

	public void makan() {
		System.out.println("Nasi Goreng");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KelasBapak kba = new KelasBapak();
		kba.makan();
		
		//override
		KelasBapak kbaOverride = new KelasAnak();
		kbaOverride.makan();
	}

}
