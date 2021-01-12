package dasar.oop;

public class GlobalVariable {

	// variable global
	int global1 = 150;
	String global2 = "variabel ini adalah global, " + "karena didalam class dan tidak didalam " + "suatu method";

	//method 
	public void metodeSatu() {
		System.out.println(global1);
		int ambilVariable = this.global1; //GlobalVariable.global1
		
		System.out.println(ambilVariable);
		
		String warna = "Yellow";// local variable dari methodSatu
		int berat = 56;
		
	}

	public void metodeDua() {
		String warna = "Red";// local variable dari methodDua
		int berat = 90;
		System.out.println(warna);
	}
}
