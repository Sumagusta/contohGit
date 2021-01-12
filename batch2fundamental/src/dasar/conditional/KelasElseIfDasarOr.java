package dasar.conditional;

public class KelasElseIfDasarOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int usia = 15;
		boolean kerja = true;

		if (usia > 14 || kerja == false) {
			System.out.println("Usia diatas  18 atau kerja true");
		} else if (usia > 18 || kerja == false) {
			System.out.println("Usia diatas  18 atau kerja false");
		} else {
			System.out.println("Other");
		}

	}

}
