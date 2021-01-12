package dasar.loop;

public class KelasForDasar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 1 1 1 1
		int noAntrian = 1; // 2
		
		for (int i = 0; i < 5; i++) 
		{
			if (noAntrian > 3) {
				System.out.println(noAntrian + "Tidak Dapat Hadiah");
			} else {
				System.out.println(noAntrian + "Dapat Hadiah");
			}
			noAntrian +=1;
		}
		
		int a = 0;
		for (int i = 0; i < 10; i++) {
			
			if (i%2 == 0) {
				System.out.println("KH");
			}else {
				System.out.println(a);
				a+=1;
			}
		}

	}

}
