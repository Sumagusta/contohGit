package dasar.jdbc.exportMaterial;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExportDatabase {

	public static void main(String[] args) throws SQLException {
		
		String path = "C:\\Users\\ryoge\\Downloads\\tampungExport\\List_artis1.csv";
		
		try {

			PrintWriter print = new PrintWriter(new File(path));
			
			StringBuffer sb = new StringBuffer();
			
			Connection conn=null;
			DBConnection objConnection = new DBConnection();
			conn = objConnection.ambilConnection();
			
			ResultSet res = null;
			
			String query = "SELECT * FROM ARTIS";
			PreparedStatement ps =  conn.prepareStatement(query);
			res = ps.executeQuery();
			
			while (res.next()) {
				sb.append(res.getString("NM_ARTIS"));
				sb.append(",");
				sb.append(res.getString("JK"));
				sb.append(",");
				sb.append(res.getString("BAYARAN"));
				sb.append(",");
				sb.append(res.getString("AWARD"));
				sb.append(",");
				sb.append(res.getString("NEGARA"));
				sb.append("\r\n");
			}
			
			print.write(sb.toString());
			print.close();
			System.out.println("Finished");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
