package dasar.oop.day8;

public class KelasFunctionString {

	public String returnString() {
		String kota = "JAKARTA";
		return kota;
	}

	public int returnInt() {
		int angkaSatu = 1;

		return 0;
	}

	public double returnDouble() {
		double angkaBerkoma = 1.5;
		return angkaBerkoma;
	}

	public float returnFloat() {
		float angkaBerkoma2 = 1.5f;
		return angkaBerkoma2;
	}

	public String[][] returnArrayString() {
		String namaDepan = "Intan"; // i=0
		String namaTengah = "Maulida";// i=1
		String namaBelakang = "Ayu"; // i=2
		String namaPanggilan = "Ima";

		String[][] fullName = { 
				{ namaDepan, namaTengah }, 
				{ namaBelakang, namaPanggilan } 
				};

		return fullName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KelasFunctionString kfs = new KelasFunctionString();

		// return string function
		String city = kfs.returnString();
		System.out.println(city);

		// return int function
		int angka = kfs.returnInt();
		System.out.println(angka * angka + angka);

		// return double function
		double Angkadouble = kfs.returnDouble();
		System.out.println(Angkadouble);
		System.out.println(Angkadouble * Angkadouble);

		// return float function
		float angkaFloat = kfs.returnFloat();
		System.out.println(angkaFloat + "\n");

		String[][] returnArray = kfs.returnArrayString();
		// return array function
		for (int i = 0; i < returnArray.length; i++) {
			for (int j = 0; j < returnArray[i].length; j++) {
				System.out.println(returnArray[i][j]);
			}
			
		}
		System.out.println(returnArray.length);
	}

}
