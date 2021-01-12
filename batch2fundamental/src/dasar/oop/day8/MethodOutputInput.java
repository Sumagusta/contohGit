package dasar.oop.day8;

public class MethodOutputInput {
	
	public int perkalian(int a, int b, int c) {
		int hasil = a + (b/c);
		return hasil;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOutputInput moi = new MethodOutputInput();
		int a = 90;
		int hasilPerkalian = moi.perkalian(a, 60, 3);
		int coba = hasilPerkalian + 100;
		System.out.println(hasilPerkalian);
		System.out.println(coba);
		
		
		
	}

}
