package dasar.conditional.tugas;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String warna;
		Scanner scan = new Scanner(System.in);

		System.out.print("Inputkan nama warna : ");
		warna = scan.nextLine();

		switch (warna) {
		case "Merah":
			System.out.println("Bahaya, Gairah, Kegembiraan, & Energi");
			break;
		case "Orange":
			System.out.println("Segar, Bermuda, Kreatif & Petualang");
			break;

		default:
			System.out.println("Hidupmu kurang berwarna");
			break;
		}

	}

}
