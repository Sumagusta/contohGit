package dasar.loop;

public class KelasWhileDasarVariasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int noAntrian = 1;
		
		while (noAntrian < 5) {
			//blok code
			
			if (noAntrian > 3) {
				System.out.println(noAntrian + "Tidak Dapat Hadiah");
			} else {
				System.out.println(noAntrian + "Dapat Hadiah");
			}

			noAntrian++;
		}

	}

}
