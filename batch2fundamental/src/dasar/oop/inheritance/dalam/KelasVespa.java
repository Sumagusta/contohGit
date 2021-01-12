package dasar.oop.inheritance.dalam;

import dasar.oop.inheritance.luar.KelasMotor;

public class KelasVespa extends KelasMotor{ // is a

	public void spesifikasi() {
		KelasMesin km = new KelasMesin(); // has a
		km.mesinMatic();
	}
}


