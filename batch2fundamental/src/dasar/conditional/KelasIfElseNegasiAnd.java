package dasar.conditional;

public class KelasIfElseNegasiAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usia = 14;
		
		if (usia < 5) {
			
			System.out.println("TK");
			
		} else if (usia >= 5 && usia < 12) {
			
			System.out.println("SD");
			
		}else if (usia >= 12 && usia < 15) {
			
			System.out.println("SMP");
			
		}else if (usia >= 15 && usia < 18) {
			
			System.out.println("SMA/SMK");
		}else {
			System.out.println("Tidak Wajib Belajar");
		}
		
	}

}
