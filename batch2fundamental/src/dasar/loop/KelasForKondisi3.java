package dasar.loop;

public class KelasForKondisi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int hari = 1; hari <= 7; hari++) {
			if (hari == 5) {
				System.out.println("Ada Jumatan " + "hari ke - "+ hari);
			} else if (hari == 6 || hari == 7) {
				System.out.println("Hari Libur " + "hari ke - "+ hari);
			} else {
				System.out.println("Kerja " + "hari ke - "+ hari);
			}
		}
	}

}
