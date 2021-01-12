package dasar.loop;

public class KelasDoWhileDasar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int noAntrian = 1;

		do {
			
			if (noAntrian < 3) {
				System.out.println("Juara "+ noAntrian + " Pasti Dapat Hadiah");
			} else {
				System.out.println("Juara "+ noAntrian + " Pasti ZONK");
			} // blok code
			
			noAntrian = noAntrian + 1; // i++ / i+=1
			
		} while (noAntrian < 4);

	}

}
