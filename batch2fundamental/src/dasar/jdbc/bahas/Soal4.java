package dasar.jdbc.bahas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Soal4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/batch2";
		String user = "root";
		String password = "";

		Connection koneksi = DriverManager.getConnection(url, user, password);

		PreparedStatement myState = null;

		int length;
		Scanner scan = new Scanner(System.in);

		System.out.println("Masukkan Jumlah Insert: ");
		length = scan.nextInt();

		// variable penampung
		String[] kdFilm = new String[length];
		String[] namaFilm = new String[length];
		String[] genre = new String[length];
		String[] fkArtis = new String[length];
		String[] fkProduser = new String[length];
		long[] pendapatan = new long[length];
		int[] nominasi = new int[length];
		
		String sql = "insert into film"
				+ " (KD_FILM, NM_FILM, GENRE, ARTIS, PRODUSER, PENDAPATAN, NOMINASI)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		for (int i = 0; i < length; i++) {
			
			 try {
					
					System.out.print("Masukkan kode " + (i+1) + " : ");
					kdFilm[i] = scan.next();
					
					System.out.print("Masukkan Nama Film: ");
					namaFilm[i] = scan.next();
					
					System.out.print("Masukkan Genre: ");
					genre[i] = scan.next();
					
					System.out.print("Masukkan Foreign Key Artis: ");
					fkArtis[i] = scan.next();
					
					System.out.print("Masukkan Foreign Key Produser: ");
					fkProduser[i] = scan.next();
					
					System.out.print("Masukkan Pendapatan: ");
					pendapatan[i] = scan.nextLong();
					
					System.out.print("Masukkan Nominasi: ");
					nominasi[i] = scan.nextInt();
					
					myState = koneksi.prepareStatement(sql);
					
					// set values
					myState.setString(1, kdFilm[i]);
					myState.setString(2, namaFilm[i]);
					myState.setString(3, genre[i]);
					myState.setString(4, fkArtis[i]);
					myState.setString(5, fkProduser[i]);
					myState.setLong(6, pendapatan[i]);
					myState.setInt(7, nominasi[i]);
					
					System.out.println("Insert Success..");
					
					//EXECUTE
					myState.executeUpdate();
					
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		scan.close();
		
	}

}
