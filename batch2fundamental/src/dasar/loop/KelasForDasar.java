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
		
//		1Dapat Hadiah 0
//		2Dapat Hadiah 1
//		3Dapat Hadiah 2
//		4Tidak Dapat Hadiah 3
//		5Tidak Dapat Hadiah 4

	}

}
