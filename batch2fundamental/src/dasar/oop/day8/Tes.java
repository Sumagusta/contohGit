package dasar.oop.day8;

public class Tes {
	public int[] returnArray() {
		int [] test = {1, 2};
 		return test;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tes kr = new Tes();
		int[] test2 = kr.returnArray();
		
		for (int x : test2) {
			System.out.println(x);
		}
	}

}
