package dasar.variable;

public class KelasKonversi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// integer - string
		Integer A = 95;
		System.out.println(String.valueOf(A)+90);
		
		// String - Integer
		String B = "105";
		System.out.println(Integer.valueOf(B)+5);
		
		// Integer - Double
		Integer C = 81;
		System.out.println(Double.valueOf(C));
		
		// Integer - Float
		Integer D = 82;
		System.out.println(Float.valueOf(D));
		
		// String - Double
		String E = "90";
		System.out.println(Double.valueOf(E));
		
		// Char - String
		char a = 'K';
		System.out.println(String.valueOf(a));
	}

}
