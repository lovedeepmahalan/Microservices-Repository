package Practice_Set;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test{
	
	private static final String path = "D:\\Nitin_Projects\\DataStructureFolder\\Data_Structure\\src\\Practice_Set\\database.properties";
	private static  FileInputStream fis=null;
	private static Properties properties=null;
	static {

		try {
			fis=new FileInputStream(path);
			if(fis!=null) {
				properties=new Properties();
				properties.load(fis);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Connection getConnection() throws SQLException {
	String url=properties.getProperty("url");
	String username=properties.getProperty("username");
	String password=properties.getProperty("password");
	return DriverManager.getConnection(url,username,password);
	}
	
	public static void CloseConnection(ResultSet rs,Statement stmt,Connection con) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}