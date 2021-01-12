package dasar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.PreparableStatement;

public class JdbcInputConsole {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// JDBC console
		
		// connecting
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/batch2";
		String user = "root";
		String password = "";
		
		Connection koneksi = DriverManager.getConnection(url, user, password);
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Masukkan kode: ");
			String kdFilm = scanner.nextLine();
			
			System.out.print("Masukkan Nama Film: ");
			String namaFilm = scanner.nextLine();
			
			System.out.print("Masukkan Genre: ");
			String genre = scanner.nextLine();
			
			System.out.print("Masukkan Foreign Key Artis: ");
			String artis = scanner.nextLine();
			
			System.out.print("Masukkan Foreign Key Produser: ");
			String produser = scanner.nextLine();
			
			System.out.print("Masukkan Pendapatan: ");
			long pendapatan = scanner.nextLong();
			
			System.out.print("Masukkan Nominasi: ");
			int nominasi = scanner.nextInt();
			
			String sql = "insert into film"
					+ " (KD_FILM, NM_FILM, GENRE, ARTIS, PRODUSER, PENDAPATAN, NOMINASI)"
					+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement st = koneksi.prepareStatement(sql);
			
			// set values
			st.setString(1, kdFilm);
			st.setString(2, namaFilm);
			st.setString(3, genre);
			st.setString(4, artis);
			st.setString(5, produser);
			
			
			// execute SQL
			
			
			//ResultSet rs = st.executeUpdate();
			
			System.out.println("Insert Complete");
			st.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
				
		
	}

}
