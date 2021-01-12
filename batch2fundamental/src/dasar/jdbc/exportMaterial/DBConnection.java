package dasar.jdbc.exportMaterial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public Connection ambilConnection() throws ClassNotFoundException, SQLException {
		
		Connection koneksi = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/batch2";
			String user = "root";
			String password = "";

			koneksi = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
		return koneksi;

	}

}
