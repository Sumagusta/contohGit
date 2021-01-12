package dasar.jdbc.bahas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/batch2";
		String user = "root";
		String password = "";

		Connection koneksi = DriverManager.getConnection(url, user, password);

		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Masukkan Value Genre : ");
			int valueGenre = scanner.nextInt();
			
			String sql = "SELECT A.NM_ARTIS, G.NM_GENRE FROM FILM F"
					+ " JOIN ARTIS A ON A.KD_ARTIS = F.ARTIS"
					+ " JOIN GENRE sG ON G.KD_GENRE = F.GENRE"
					+ " WHERE A.AWARD = ?";// (?) ADALAH VALUE NYA
			
			PreparedStatement myStmt = koneksi.prepareStatement(sql);
			
			// set value
			myStmt.setInt(1, valueGenre);
			
			//myStmt.executeQuery();
			ResultSet rs = myStmt.executeQuery();
			
			// print
			while (rs.next()) {
				System.out.println(rs.getString(1)); 
				}
			
			System.out.println("Execute Success");
			koneksi.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
